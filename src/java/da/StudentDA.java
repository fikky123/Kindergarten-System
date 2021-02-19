/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import db.dbconnect;
import domain.payment;
import domain.student;
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
public class StudentDA{
    
    private static Connection conn;
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException
    {
         student s = StudentDA.updateStudent("160505109829", "senah", "mad", 5, "lot 8, jalan lama", "kuala selangor",
                 "setia alam", "selangor", "48900", "Girl", "Malay", "senah", "05/05/2016", 2, "038299292", "eczema", 
                 "e", "ee", "eee", "eeee", "eeeee", "Denai Alam", "Morning", 61);
         System.out.print(s.getS_FNAME());
         //ArrayList<student> studList = StudentDA.getStud(61);//Edit
         //System.out.print(studList.get(0).getS_FNAME()); 
    }
    
        public static student getStudent(String MYKID) throws SQLException, NoSuchAlgorithmException
         {
             
            conn = dbconnect.getConnection();
            student s = null;
            StringBuffer sb = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("SELECT * FROM STUDENT where MYKID=?");
                statement.setString(1, MYKID);

                rs = statement.executeQuery();
                while (rs.next()) {
                    //String MYKID = rs.getString("MYKID");
                    //String EMAIL = rs.getString("EMAIL");
                    String S_FNAME = rs.getString("S_FNAME");
                    String S_LNAME = rs.getString("S_LNAME");
                    int S_AGE = rs.getInt("S_AGE");
                    String S_ADDRESS1 = rs.getString("S_ADDRESS1");
                    String S_ADDRESS2 = rs.getString("S_ADDRESS2");
                    String S_CITY = rs.getString("S_CITY");
                    String S_STATE = rs.getString("S_STATE");
                    String S_POSTCODE = rs.getString("S_POSTCODE");
                    String S_GENDER = rs.getString("S_GENDER");
                    String S_NATIONALITY = rs.getString("S_NATIONALITY");
                    String S_NAMETAG = rs.getString("S_NAMETAG");
                    String S_DATEOFBIRTH = rs.getString("S_DATEOFBIRTH");
                    int S_POSTINFAMILY = rs.getInt("S_POSTINFAMILY");
                    String S_HOMETEL = rs.getString("S_HOMETEL");
                    String S_HEALTHSURGERY = rs.getString("S_HEALTHSURGERY");
                    String S_HEALTHSURGERYPART = rs.getString("S_HEALTHSURGERYPART");
                    String S_HEALTHMINOROPERATION = rs.getString("S_HEALTHMINOROPERATION");
                    String S_HEALTHMINORPART = rs.getString("S_HEALTHMINORPART");
                    String S_HEALTHCONDITION = rs.getString("S_HEALTHCONDITION");
                    String S_OTHERHC = rs.getString("S_OTHERHC");
                    String CENTER_BRANCH = rs.getString("CENTER_BRANCH");
                    String SESSIONS = rs.getString("SESSIONS");
                    int PARENT_ID = rs.getInt("PARENT_ID");
                    s=new student(MYKID,S_FNAME,S_LNAME,S_AGE,S_ADDRESS1,S_ADDRESS2,S_CITY,
                    S_STATE,S_POSTCODE,S_GENDER,S_NATIONALITY,S_NAMETAG,S_DATEOFBIRTH,
                    S_POSTINFAMILY,S_HOMETEL,S_HEALTHSURGERY,S_HEALTHSURGERYPART,
                    S_HEALTHMINOROPERATION,S_HEALTHMINORPART,S_HEALTHCONDITION,S_OTHERHC
                    ,CENTER_BRANCH,SESSIONS,PARENT_ID);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return s;

        }
        
        public static ArrayList<student> getAllStudent() throws SQLException, NoSuchAlgorithmException
         {
             ArrayList<student> sList = new ArrayList<student>();
             
            conn = dbconnect.getConnection();
            student s = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("SELECT * FROM STUDENT");
                rs = statement.executeQuery();
                while (rs.next()) {
                    String MYKID = rs.getString("MYKID");
                    //String EMAIL = rs.getString("EMAIL");
                    String S_FNAME = rs.getString("S_FNAME");
                    String S_LNAME = rs.getString("S_LNAME");
                    int S_AGE = rs.getInt("S_AGE");
                    String S_ADDRESS1 = rs.getString("S_ADDRESS1");
                    String S_ADDRESS2 = rs.getString("S_ADDRESS2");
                    String S_CITY = rs.getString("S_CITY");
                    String S_STATE = rs.getString("S_STATE");
                    String S_POSTCODE = rs.getString("S_POSTCODE");
                    String S_GENDER = rs.getString("S_GENDER");
                    String S_NATIONALITY = rs.getString("S_NATIONALITY");
                    String S_NAMETAG = rs.getString("S_NAMETAG");
                    String S_DATEOFBIRTH = rs.getString("S_DATEOFBIRTH");
                    int S_POSTINFAMILY = rs.getInt("S_POSTINFAMILY");
                    String S_HOMETEL = rs.getString("S_HOMETEL");
                    String S_HEALTHSURGERY = rs.getString("S_HEALTHSURGERY");
                    String S_HEALTHSURGERYPART = rs.getString("S_HEALTHSURGERYPART");
                    String S_HEALTHMINOROPERATION = rs.getString("S_HEALTHMINOROPERATION");
                    String S_HEALTHMINORPART = rs.getString("S_HEALTHMINORPART");
                    String S_HEALTHCONDITION = rs.getString("S_HEALTHCONDITION");
                    String S_OTHERHC = rs.getString("S_OTHERHC");
                    String CENTER_BRANCH = rs.getString("CENTER_BRANCH");
                    String SESSIONS = rs.getString("SESSIONS");
                    int PARENT_ID = rs.getInt("PARENT_ID");
                    s=new student(MYKID,S_FNAME,S_LNAME,S_AGE,S_ADDRESS1,S_ADDRESS2,S_CITY,
                    S_STATE,S_POSTCODE,S_GENDER,S_NATIONALITY,S_NAMETAG,S_DATEOFBIRTH,
                    S_POSTINFAMILY,S_HOMETEL,S_HEALTHSURGERY,S_HEALTHSURGERYPART,
                    S_HEALTHMINOROPERATION,S_HEALTHMINORPART,S_HEALTHCONDITION,S_OTHERHC
                    ,CENTER_BRANCH,SESSIONS,PARENT_ID);
                    sList.add(s);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return sList;

        }
        
        
        public static student insertStudent(String MYKID,String S_FNAME,String S_LNAME,
                                                  int S_AGE,String S_ADDRESS1,String S_ADDRESS2,
                                                  String S_CITY,String S_STATE,String S_POSTCODE,
                                                  String S_GENDER,String S_NATIONALITY,
                                                  String S_NAMETAG,String S_DATEOFBIRTH,
                                                  int S_POSTINFAMILY,String S_HOMETEL,String S_HEALTHSURGERY,
                                                  String S_HEALTHSURGERYPART,String S_HEALTHMINOROPERATION,
                                                  String S_HEALTHMINORPART,String S_HEALTHCONDITION,
                                                  String S_OTHERHC,String CENTER_BRANCH,String SESSIONS,
                                                  int PARENT_ID) 
                                                  throws SQLException, NoSuchAlgorithmException
         {
             
            conn = dbconnect.getConnection();
            student s = null;
            StringBuffer sb = null;
            try {
                PreparedStatement statement;
                ResultSet rs;
                statement = conn.prepareStatement("INSERT into STUDENT(MYKID,S_FNAME,S_LNAME,S_AGE,S_ADDRESS1,S_ADDRESS2,S_CITY,\n" +
"                    S_STATE,S_POSTCODE,S_GENDER,S_NATIONALITY,S_NAMETAG,S_DATEOFBIRTH,\n" +
"                    S_POSTINFAMILY,S_HOMETEL,S_HEALTHSURGERY,S_HEALTHSURGERYPART,\n" +
"                    S_HEALTHMINOROPERATION,S_HEALTHMINORPART,S_HEALTHCONDITION,S_OTHERHC\n" +
"                    ,CENTER_BRANCH,SESSIONS,PARENT_ID) "
                        + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                statement.setString(1, MYKID);
                statement.setString(2, S_FNAME);
                statement.setString(3, S_LNAME);
                statement.setInt(4, S_AGE);
                statement.setString(5, S_ADDRESS1);
                statement.setString(6, S_ADDRESS2);
                statement.setString(7, S_CITY);
                statement.setString(8, S_STATE);
                statement.setString(9, S_POSTCODE);
                statement.setString(10, S_GENDER);
                statement.setString(11, S_NATIONALITY);
                statement.setString(12, S_NAMETAG);
                statement.setString(13, S_DATEOFBIRTH);
                statement.setInt(14, S_POSTINFAMILY);
                statement.setString(15, S_HOMETEL);
                statement.setString(16, S_HEALTHSURGERY);
                statement.setString(17, S_HEALTHSURGERYPART);
                statement.setString(18, S_HEALTHMINOROPERATION);
                statement.setString(19, S_HEALTHMINORPART);
                statement.setString(20, S_HEALTHCONDITION);
                statement.setString(21, S_OTHERHC);
                statement.setString(22, CENTER_BRANCH);
                statement.setString(23, SESSIONS);
                statement.setInt(24, PARENT_ID);
                //rs = statement.executeQuery();
                int success = statement.executeUpdate();
                if(success == 1){
                    s=new student(MYKID,S_FNAME,S_LNAME,S_AGE,S_ADDRESS1,S_ADDRESS2,S_CITY,
                    S_STATE,S_POSTCODE,S_GENDER,S_NATIONALITY,S_NAMETAG,S_DATEOFBIRTH,
                    S_POSTINFAMILY,S_HOMETEL,S_HEALTHSURGERY,S_HEALTHSURGERYPART,
                    S_HEALTHMINOROPERATION,S_HEALTHMINORPART,S_HEALTHCONDITION,S_OTHERHC
                    ,CENTER_BRANCH,SESSIONS,PARENT_ID);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return s;

        }
        
        //Edit
        public static student updateStudent(String MYKID,String S_FNAME,String S_LNAME,
                                                  int S_AGE,String S_ADDRESS1,String S_ADDRESS2,
                                                  String S_CITY,String S_STATE,String S_POSTCODE,
                                                  String S_GENDER,String S_NATIONALITY,
                                                  String S_NAMETAG,String S_DATEOFBIRTH,
                                                  int S_POSTINFAMILY,String S_HOMETEL,String S_HEALTHSURGERY,
                                                  String S_HEALTHSURGERYPART,String S_HEALTHMINOROPERATION,
                                                  String S_HEALTHMINORPART,String S_HEALTHCONDITION,
                                                  String S_OTHERHC,String CENTER_BRANCH,String SESSIONS,
                                                  int PARENT_ID) throws SQLException, NoSuchAlgorithmException
         {
             
            conn = dbconnect.getConnection();
            student s = null;
            StringBuffer sb = null;
            try {
               PreparedStatement statement;
               ResultSet rs;
               statement = conn.prepareStatement("update student set MYKID=?, S_FNAME=?, S_LNAME=?, S_AGE=?,"
                                               + "S_ADDRESS1=?, S_ADDRESS2=?, S_CITY=?, S_STATE=?, S_POSTCODE=?,"
                                               + "S_GENDER=?, S_NATIONALITY=?, S_NAMETAG=?, S_DATEOFBIRTH=?, "
                                               + "S_POSTINFAMILY=?, S_HOMETEL=?, S_HEALTHSURGERY=?, S_HEALTHSURGERYPART=?,"
                                               + "S_HEALTHMINOROPERATION=?, S_HEALTHMINORPART=?, S_HEALTHCONDITION=?,"
                                               + "S_OTHERHC=?, CENTER_BRANCH=?, SESSIONS=? where PARENT_ID=?");
                statement.setString(1, MYKID);
                statement.setString(2, S_FNAME);
                statement.setString(3, S_LNAME);
                statement.setInt(4, S_AGE);
                statement.setString(5, S_ADDRESS1);
                statement.setString(6, S_ADDRESS2);
                statement.setString(7, S_CITY);
                statement.setString(8, S_STATE);
                statement.setString(9, S_POSTCODE);
                statement.setString(10, S_GENDER);
                statement.setString(11, S_NATIONALITY);
                statement.setString(12, S_NAMETAG);
                statement.setString(13, S_DATEOFBIRTH);
                statement.setInt(14, S_POSTINFAMILY);
                statement.setString(15, S_HOMETEL);
                statement.setString(16, S_HEALTHSURGERY);
                statement.setString(17, S_HEALTHSURGERYPART);
                statement.setString(18, S_HEALTHMINOROPERATION);
                statement.setString(19, S_HEALTHMINORPART);
                statement.setString(20, S_HEALTHCONDITION);
                statement.setString(21, S_OTHERHC);
                statement.setString(22, CENTER_BRANCH);
                statement.setString(23, SESSIONS);
                statement.setInt(24, PARENT_ID);
                
                int success = statement.executeUpdate();
                if(success == 1){
                    s=new student(MYKID,S_FNAME,S_LNAME,S_AGE,S_ADDRESS1,S_ADDRESS2,S_CITY,
                    S_STATE,S_POSTCODE,S_GENDER,S_NATIONALITY,S_NAMETAG,S_DATEOFBIRTH,
                    S_POSTINFAMILY,S_HOMETEL,S_HEALTHSURGERY,S_HEALTHSURGERYPART,
                    S_HEALTHMINOROPERATION,S_HEALTHMINORPART,S_HEALTHCONDITION,S_OTHERHC
                    ,CENTER_BRANCH,SESSIONS,PARENT_ID);
                }
                
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
                
                

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return s;

        }
    
}
