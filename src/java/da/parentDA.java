/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import db.dbconnect;
import domain.login;
import domain.parent;
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
public class parentDA{
    
    private static Connection conn;
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException
    {
        
         parent p = parentDA.updateParent(61,"hai@gmail.com","lol","sudahla","9292929","983838","32323","Indian","Buddha","hello","ibu","9292929","212211","22222","Chinese","Buddha","84848","84848","Government","oi");//Edit
         System.out.print("Name : "+p.getF_FIRSTNAME());

    }
    
    
     public static parent authenticateParent(String EMAIL) throws SQLException, NoSuchAlgorithmException{
        
        conn = dbconnect.getConnection();

        parent P = null;

        try {
            PreparedStatement statement;
            ResultSet rs;

            statement = conn.prepareStatement("SELECT * FROM ACCOUNT JOIN PARENTS ON ACCOUNT.EMAIL=PARENTS.EMAIL WHERE ACCOUNT.EMAIL = ?");
            statement.setString(1, EMAIL);
            rs = statement.executeQuery();
            while (rs.next()) {
                int PARENT_ID = rs.getInt("PARENT_ID");
                    String F_FIRSTNAME = rs.getString("F_FIRSTNAME");
                    String F_LASTNAME = rs.getString("F_LASTNAME");
                    String F_IC = rs.getString("F_IC");
                    String F_CONTACTNUM = rs.getString("F_CONTACTNUM");
                    String F_OFFICENUMBER = rs.getString("F_OFFICENUMBER");
                    String F_RACES = rs.getString("F_RACES");
                    String F_RELIGION = rs.getString("F_RELIGION");
                    String F_JOBSECTOR = rs.getString("F_JOBSECTOR");
                    String F_COMPANYNAME = rs.getString("F_COMPANYNAME");
                    String M_FIRSTNAME = rs.getString("M_FIRSTNAME");
                    String M_LASTNAME = rs.getString("M_LASTNAME");
                    String M_IC = rs.getString("M_IC");
                    String M_CONTACTNUM = rs.getString("M_CONTACTNUM");
                    String M_OFFICENUMBER = rs.getString("M_OFFICENUMBER");
                    String M_RACES = rs.getString("M_RACES");
                    String M_RELIGION = rs.getString("M_RELIGION");
                    String M_JOBSECTOR = rs.getString("M_JOBSECTOR");
                    String M_COMPANYNAME = rs.getString("M_COMPANYNAME");
                    P=new parent(PARENT_ID, EMAIL,F_FIRSTNAME,F_LASTNAME,F_IC,F_CONTACTNUM,
                    F_OFFICENUMBER,F_RACES,F_RELIGION,F_JOBSECTOR,F_COMPANYNAME,M_FIRSTNAME,
                    M_LASTNAME,M_IC,M_CONTACTNUM,M_OFFICENUMBER,M_RACES,M_RELIGION,M_JOBSECTOR,M_COMPANYNAME);
                    
            }
               
            }catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return P;

    }
        
        public static parent getParent(int PARENT_ID) throws SQLException, NoSuchAlgorithmException
         {
             
            conn = dbconnect.getConnection();
            parent p = null;
            StringBuffer sb = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("SELECT * FROM PARENTS where PARENT_ID=?");
                statement.setInt(1, PARENT_ID);

                rs = statement.executeQuery();
                while (rs.next()) {
                    //int PARENT_ID = rs.getInt("PARENT_ID");
                    String EMAIL = rs.getString("EMAIL");
                    String F_FIRSTNAME = rs.getString("F_FIRSTNAME");
                    String F_LASTNAME = rs.getString("F_LASTNAME");
                    String F_IC = rs.getString("F_IC");
                    String F_CONTACTNUM = rs.getString("F_CONTACTNUM");
                    String F_OFFICENUMBER = rs.getString("F_OFFICENUMBER");
                    String F_RACES = rs.getString("F_RACES");
                    String F_RELIGION = rs.getString("F_RELIGION");
                    String F_JOBSECTOR = rs.getString("F_JOBSECTOR");
                    String F_COMPANYNAME = rs.getString("F_COMPANYNAME");
                    String M_FIRSTNAME = rs.getString("M_FIRSTNAME");
                    String M_LASTNAME = rs.getString("M_LASTNAME");
                    String M_IC = rs.getString("M_IC");
                    String M_CONTACTNUM = rs.getString("M_CONTACTNUM");
                    String M_OFFICENUMBER = rs.getString("M_OFFICENUMBER");
                    String M_RACES = rs.getString("M_RACES");
                    String M_RELIGION = rs.getString("M_RELIGION");
                    String M_JOBSECTOR = rs.getString("M_JOBSECTOR");
                    String M_COMPANYNAME = rs.getString("M_COMPANYNAME");
                    p=new parent(PARENT_ID, EMAIL,F_FIRSTNAME,F_LASTNAME,F_IC,F_CONTACTNUM,
                    F_OFFICENUMBER,F_RACES,F_RELIGION,F_JOBSECTOR,F_COMPANYNAME,M_FIRSTNAME,
                    M_LASTNAME,M_IC,M_CONTACTNUM,M_OFFICENUMBER,M_RACES,M_RELIGION,M_JOBSECTOR,M_COMPANYNAME);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return p;

        }
        
        public static parent insertParent(String EMAIL,String F_FIRSTNAME,String F_LASTNAME,String F_IC,String F_CONTACTNUM,
        String F_OFFICENUMBER,String F_RACES,String F_RELIGION,String F_JOBSECTOR,String F_COMPANYNAME,
        String M_FIRSTNAME, String M_LASTNAME,String M_IC,String M_CONTACTNUM,String M_OFFICENUMBER,String M_RACES,
        String M_RELIGION,String M_JOBSECTOR, String M_COMPANYNAME) throws SQLException, NoSuchAlgorithmException
         {
             
            conn = dbconnect.getConnection();
            parent p = null;
            StringBuffer sb = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("INSERT into PARENTS(PARENT_ID,EMAIL,F_FIRSTNAME,F_LASTNAME,F_IC,F_CONTACTNUM,\n" +
"                    F_OFFICENUMBER,F_RACES,F_RELIGION,F_JOBSECTOR,F_COMPANYNAME,M_FIRSTNAME,\n" +
"                    M_LASTNAME,M_IC,M_CONTACTNUM,M_OFFICENUMBER,M_RACES,M_RELIGION,M_JOBSECTOR,M_COMPANYNAME) "
                        + "values (parents_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                statement.setString(1, EMAIL);
                statement.setString(2, F_FIRSTNAME);
                statement.setString(3, F_LASTNAME);
                statement.setString(4, F_IC);
                statement.setString(5, F_CONTACTNUM);
                statement.setString(6, F_OFFICENUMBER);
                statement.setString(7, F_RACES);
                statement.setString(8, F_RELIGION);
                statement.setString(9, F_JOBSECTOR);
                statement.setString(10, F_COMPANYNAME);
                statement.setString(11, M_FIRSTNAME);
                statement.setString(12, M_LASTNAME);
                statement.setString(13, M_IC);
                statement.setString(14, M_CONTACTNUM);
                statement.setString(15, M_OFFICENUMBER);
                statement.setString(16, M_RACES);
                statement.setString(17, M_RELIGION);
                statement.setString(18, M_JOBSECTOR);
                statement.setString(19, M_COMPANYNAME);
                //rs = statement.executeQuery();
                int success = statement.executeUpdate();
                if(success == 1){
                    p=new parent(EMAIL,F_FIRSTNAME,F_LASTNAME,F_IC,F_CONTACTNUM,
                    F_OFFICENUMBER,F_RACES,F_RELIGION,F_JOBSECTOR,F_COMPANYNAME,M_FIRSTNAME,
                    M_LASTNAME,M_IC,M_CONTACTNUM,M_OFFICENUMBER,M_RACES,M_RELIGION,M_JOBSECTOR,M_COMPANYNAME);
                }
                //statement = conn.prepareStatement("Select * from PARENT where PARENT_ID=?");
                //statement.setString(1, PARENT_ID);
                //statement.setString(2, EMAIL);
                //rs = statement.executeQuery();
                //while (rs.next()) {
                    
                    //int PARENT_ID=rs.getInt("PARENT_ID");
                    //p=new parent(PARENT_ID,EMAIL,F_FIRSTNAME,F_LASTNAME,F_IC,F_CONTACTNUM,
                    //F_OFFICENUMBER,F_RACES,F_RELIGION,F_JOBSECTOR,F_COMPANYNAME,M_FIRSTNAME,
                    //M_LASTNAME,M_IC,M_CONTACTNUM,M_OFFICENUMBER,M_RACES,M_RELIGION,M_JOBSECTOR,M_COMPANYNAME);
                //}
                
                //statement = conn.prepareStatement("update class set teacherId=? where className=?");
                //statement.setInt(1, T.getTeacherId());
                //statement.setString(2, className);
                //rs = statement.executeQuery();
                
                

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return p;

        }
        
        //Edit 
        public static parent updateParent(int PARENT_ID,String EMAIL,String F_FIRSTNAME,String F_LASTNAME,String F_IC,String F_CONTACTNUM,
        String F_OFFICENUMBER,String F_RACES,String F_RELIGION,String F_JOBSECTOR,String F_COMPANYNAME,
        String M_FIRSTNAME, String M_LASTNAME,String M_IC,String M_CONTACTNUM,String M_OFFICENUMBER,String M_RACES,
        String M_RELIGION,String M_JOBSECTOR, String M_COMPANYNAME) throws SQLException, NoSuchAlgorithmException
         {
             
            conn = dbconnect.getConnection();
            parent p = null;
            StringBuffer sb = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("UPDATE PARENTS set EMAIL=?, F_FIRSTNAME=?, F_LASTNAME=?, "
                                                  + "F_IC=?, F_CONTACTNUM=?, F_OFFICENUMBER=?, F_RACES=?,"
                                                  + "F_RELIGION=?, F_JOBSECTOR=?, F_COMPANYNAME=?,"
                                                  + "M_FIRSTNAME=?, M_LASTNAME=?, M_IC=?,"
                                                  + "M_CONTACTNUM=?, M_OFFICENUMBER=?,"
                                                  + "M_RACES=?, M_RELIGION=?, M_JOBSECTOR=?,"
                                                  + "M_COMPANYNAME=? where PARENT_ID=?");
                
                statement.setString(1, EMAIL);
                statement.setString(2, F_FIRSTNAME);
                statement.setString(3, F_LASTNAME);
                statement.setString(4, F_IC);
                statement.setString(5, F_CONTACTNUM);
                statement.setString(6, F_OFFICENUMBER);
                statement.setString(7, F_RACES);
                statement.setString(8, F_RELIGION);
                statement.setString(9, F_JOBSECTOR);
                statement.setString(10, F_COMPANYNAME);
                statement.setString(11, M_FIRSTNAME);
                statement.setString(12, M_LASTNAME);
                statement.setString(13, M_IC);
                statement.setString(14, M_CONTACTNUM);
                statement.setString(15, M_OFFICENUMBER);
                statement.setString(16, M_RACES);
                statement.setString(17, M_RELIGION);
                statement.setString(18, M_JOBSECTOR);
                statement.setString(19, M_COMPANYNAME);
                statement.setInt(20, PARENT_ID);
                int success = statement.executeUpdate();
                if(success == 1){
                    p=new parent(PARENT_ID,EMAIL,F_FIRSTNAME,F_LASTNAME,F_IC,F_CONTACTNUM,
                    F_OFFICENUMBER,F_RACES,F_RELIGION,F_JOBSECTOR,F_COMPANYNAME,M_FIRSTNAME,
                    M_LASTNAME,M_IC,M_CONTACTNUM,M_OFFICENUMBER,M_RACES,M_RELIGION,M_JOBSECTOR,M_COMPANYNAME);
                }
                
                //statement = conn.prepareStatement("Select * from PARENTS where PARENT_ID=?");
                //statement.setInt(1, PARENT_ID);
                //rs = statement.executeQuery();
                //while (rs.next()) {
                    
                    //int PARENT_ID=rs.getInt("PARENT_ID");
                    //p=new parent(PARENT_ID,EMAIL,F_FIRSTNAME,F_LASTNAME,F_IC,F_CONTACTNUM,
                    //F_OFFICENUMBER,F_RACES,F_RELIGION,F_JOBSECTOR,F_COMPANYNAME,M_FIRSTNAME,
                    //M_LASTNAME,M_IC,M_CONTACTNUM,M_OFFICENUMBER,M_RACES,M_RELIGION,M_JOBSECTOR,M_COMPANYNAME);
               //}
                
                //statement = conn.prepareStatement("update class set teacherId=? where className=?");
                //statement.setInt(1, T.getTeacherId());
                //statement.setString(2, className);
                //rs = statement.executeQuery();
                
                

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return p;

        }
    
}
