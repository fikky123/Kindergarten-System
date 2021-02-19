/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import db.dbconnect;
import domain.login;
import domain.payment;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 
 */
public class loginDA {
    private static Connection conn;
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException
    {
           login L = authenticateLogin("s@mail.com","123");
           //login L = authenticateLoginEdit(6,"abcd");
           System.out.println("dsadsdsa: "+L.getEMAIL());
           System.out.println("dsadsdsa: "+L.getPASSWORD());
           
    }
    
    //Login
    public static login authenticateLogin(String EMAIL,String PASSWORD) throws SQLException, NoSuchAlgorithmException{
        
        conn = dbconnect.getConnection();

        login L = null;
        try {
            PreparedStatement statement;
            ResultSet rs;

            statement = conn.prepareStatement("SELECT * FROM ACCOUNT WHERE EMAIL = ? AND PASSWORD = ?");
            statement.setString(1, EMAIL);
            statement.setString(2, PASSWORD);

            rs = statement.executeQuery();
            while (rs.next()) {
                //String EMAIL = rs.getString("EMAIL");
                L=new login(EMAIL,PASSWORD);
               
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return L;

    }
    //ADD TEACHER
    public static login insertLogin(String EMAIL,String PASSWORD) throws SQLException, NoSuchAlgorithmException
    {
        conn = dbconnect.getConnection();

        login L = null;
                
            PreparedStatement statement;
            ResultSet rs;
            statement = conn.prepareStatement("INSERT into ACCOUNT(EMAIL,PASSWORD) values(?,?)");
            statement.setString(1, EMAIL);
            statement.setString(2, PASSWORD);
            //statement.executeQuery();
            int success = statement.executeUpdate();
            if(success == 1){
            L=new login(EMAIL,PASSWORD);
                }
            
            //statement = conn.prepareStatement("select max(EMAIL) from ACCOUNT");
            //statement.setString(1, sb.toString());
            //rs = statement.executeQuery();
            //while (rs.next()) {
               // String EMAIL = rs.getString("max(EMAIL)");
               // L=new login(EMAIL,PASSWORD);
               
           // }

      

            return L;

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


 
}
