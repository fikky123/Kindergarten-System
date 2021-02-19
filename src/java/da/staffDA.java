/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import db.dbconnect;
import domain.Staff;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class staffDA {
    private static Connection conn;
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException
    {
           Staff s = authenticateStaff(123,"123");
           //login L = authenticateLoginEdit(6,"abcd");
           System.out.println("dsadsdsa: "+s.getSTAFF_ID());
    }
    
    //Login
    public static Staff authenticateStaff(int STAFF_ID,String PASSWORD) throws SQLException, NoSuchAlgorithmException{
        
        conn = dbconnect.getConnection();

        Staff s = null;
        try {


            PreparedStatement statement;
            ResultSet rs;

            statement = conn.prepareStatement("SELECT * FROM STAFF WHERE STAFF_ID = ? AND PASSWORD = ?");
            statement.setInt(1, STAFF_ID);
            statement.setString(2, PASSWORD);
            statement.executeQuery();

            rs = statement.executeQuery();
            while (rs.next()) {
                //int STAFF_ID = rs.getInt("max(STAFF_ID)");
                s=new Staff(STAFF_ID,PASSWORD);
               
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return s;

    }
    public static Staff authenticateStaff(String PASSWORD) throws SQLException, NoSuchAlgorithmException
    {
        conn = dbconnect.getConnection();

        Staff s = null;
        try {
                String original = PASSWORD; //password
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(original.getBytes());
                byte[] digest = md.digest();
                StringBuffer sb = new StringBuffer();
                for (byte b : digest) {
                    sb.append(String.format("%02x", b & 0xff));
                }
                
            PreparedStatement statement;
            ResultSet rs;
            statement = conn.prepareStatement("INSERT into STAFF(PASSWORD) values(?)");
            statement.setString(1, sb.toString());
            statement.executeQuery();
            
            statement = conn.prepareStatement("select max(STAFF_ID) from STAFF");
            statement.setString(1, sb.toString());
            rs = statement.executeQuery();
            while (rs.next()) {
                int STAFF_ID = rs.getInt("max(STAFF_ID)");
                s=new Staff(STAFF_ID,PASSWORD);
               
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return s;

    }
    
    
    //Edit TEACHER
   // public static login authenticateLoginEdit(int PARENT_ID,String PASSWORD) throws SQLException, NoSuchAlgorithmException
    //{
        //conn = dbconnect.getConnection();

        //login L = null;
        //try {
               // String original = PASSWORD; //password
               // MessageDigest md = MessageDigest.getInstance("MD5");
               // md.update(original.getBytes());
               // byte[] digest = md.digest();
               // StringBuffer sb = new StringBuffer();
               // for (byte b : digest) {
               //     sb.append(String.format("%02x", b & 0xff));
               // }
                
           // PreparedStatement statement;
           // ResultSet rs;
            
            //statement = conn.prepareStatement("SELECT * FROM ACCOUNT JOIN PARENT ON ACC.LOGINID=PARENT.LOGINID WHERE PARENT.PARENT_ID = ?");
            //statement.setInt(1, PARENT_ID);
            //rs = statement.executeQuery();
            //while (rs.next()) {
              //  int LOGINID = rs.getInt("LOGINID");
              //  L=new login(LOGINID,IC,PASSWORD);
               
            //}
           // statement = conn.prepareStatement("update ACCOUNT set PASSWORD=? where LOGINID=?");
           // statement.setString(1, sb.toString());
           // statement.setInt(2, L.getLOGINID());
           // statement.executeQuery();
            
            

       // } catch (SQLException e) {
       //     System.out.println(e.getMessage());
      //  }

      //  return L;

    //}
}