/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import db.dbconnect;
import domain.payment;
//import domain.student;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 */
public class paymentda{
    
    private static Connection conn;
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException
    {
         ArrayList<payment> paymentlist = paymentda.getAllPayment();//Edit
         System.out.print(paymentlist.get(0).getPAYMENT());  
    }
        
        public static payment getPayment(int PAYMENT_ID) throws SQLException, NoSuchAlgorithmException
         {
             
            conn = dbconnect.getConnection();
            payment p = null;
            StringBuffer sb = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("SELECT * FROM PAYMENT where PAYMENT_ID=?");
                statement.setInt(1, PAYMENT_ID);

                rs = statement.executeQuery();
                while (rs.next()) {
                   // int PAYMENT_ID = rs.getInt("PAYMENT_ID");
                    String REG_DATE = rs.getString("REG_DATE");
                    String PAYMENT = rs.getString("PAYMENT");
                    String EMAIL = rs.getString("EMAIL");
                    int RPRICE = rs.getInt("RPRICE");
                    int ADDPAY = rs.getInt("ADDPAY");
                    p=new payment(PAYMENT_ID,REG_DATE,PAYMENT,EMAIL,RPRICE,ADDPAY);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return p;

        }
        
         public static ArrayList<payment> getAllPayment() throws SQLException, NoSuchAlgorithmException
         {
             ArrayList<payment> pList = new ArrayList<payment>();
             
            conn = dbconnect.getConnection();
            payment p = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("SELECT * FROM PAYMENT");
                rs = statement.executeQuery();
                while (rs.next()) {
                    int PAYMENT_ID = rs.getInt("PAYMENT_ID");
                    String REG_DATE = rs.getString("REG_DATE");
                    String PAYMENT = rs.getString("PAYMENT");
                    String EMAIL = rs.getString("EMAIL");
                    int RPRICE = rs.getInt("RPRICE");
                    int ADDPAY = rs.getInt("ADDPAY");
                    //int PARENT_ID = rs.getString("PARENT_ID");
                    p=new payment(PAYMENT_ID,REG_DATE,PAYMENT,EMAIL,RPRICE,ADDPAY);
                    pList.add(p);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return pList;

        }
        
        //ADD TEACHER
        public static payment insertPayment(String REG_DATE, String PAYMENT, String EMAIL, int RPRICE, int ADDPAY) throws SQLException, NoSuchAlgorithmException
         {
             
            conn = dbconnect.getConnection();
            payment p = null;
            StringBuffer sb = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("INSERT into PAYMENT(PAYMENT_ID,REG_DATE,PAYMENT,EMAIL,RPRICE,ADDPAY) "
                        + "values (payment_seq.NEXTVAL,?,?,?,?,?)");
                statement.setString(1, REG_DATE);
                statement.setString(2, PAYMENT);
                statement.setString(3, EMAIL);
                statement.setInt(4, RPRICE);
                statement.setInt(5, ADDPAY);
                int success = statement.executeUpdate();
                if(success == 1){
                    p=new payment(REG_DATE,PAYMENT,EMAIL,RPRICE,ADDPAY);
                }
                
                
                
                /*statement = conn.prepareStatement("Select * from PAYMENT where PAYMENT_ID=?");
                statement.setInt(1, PAYMENT_ID);
                //statement.setString(2, EMAIL);
                rs = statement.executeQuery();
                while (rs.next()) {
                    
                    //int PAYMENT_ID=rs.getInt("PAYMENT_ID");
                    
                }*/
                
                //statement = conn.prepareStatement("update class set teacherId=? where className=?");
                //statement.setInt(1, T.getTeacherId());
                //statement.setString(2, className);
                //rs = statement.executeQuery();
                
                

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return p;

        }
        
        //Edit TEACHER
        //public static parent authenticateTeacher(int PARENT_ID,String F_FIRSTNAME,String F_LASTNAME,String F_IC,String F_CONTACTNUM) throws SQLException, NoSuchAlgorithmException
        // {
             
           // conn = dbconnect.getConnection();
            //Teacher T = null;
            //StringBuffer sb = null;
            //try {
               // PreparedStatement statement;
                //ResultSet rs;
                //statement = conn.prepareStatement("update teacher set teacherName=?, teacherIC=?, teacherPosition=?, teacherContact=? where teacherId=?");
                //statement.setString(1, teacherName);
                //statement.setString(2, teacherIC);
               // statement.setString(3, teacherPosition);
                //statement.setString(4, teacherContact);
                //statement.setInt(5, teacherid);
                //rs = statement.executeQuery();
                
                //statement = conn.prepareStatement("Select * from Teacher where teacherId=?");
                //statement.setInt(1, teacherid);
               // rs = statement.executeQuery();
                //while (rs.next()) {
                    
                   // int teacherId=rs.getInt("teacherId");
                    //T=new Teacher(teacherId,teacherName,teacherIC,teacherPosition,teacherContact);
                //}
                
                //statement = conn.prepareStatement("update class set teacherId=? where className=?");
                //statement.setInt(1, T.getTeacherId());
               // statement.setString(2, className);
                //rs = statement.executeQuery();
                
                

           // } catch (SQLException e) {
           //     System.out.println(e.getMessage());
           // }

           // return T;

      //  }
    
}
