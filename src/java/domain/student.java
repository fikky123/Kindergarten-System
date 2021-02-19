/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author 
 */
public class student {
    
    String MYKID;
    String S_FNAME;
    String S_LNAME;
    int S_AGE;
    String S_ADDRESS1;
    String S_ADDRESS2;
    String S_CITY;
    String S_STATE;
    String S_POSTCODE;
    String S_GENDER;
    String S_NATIONALITY;
    String S_NAMETAG;
    String S_DATEOFBIRTH;
    int S_POSTINFAMILY;
    String S_HOMETEL;
    String S_HEALTHSURGERY;
    String S_HEALTHSURGERYPART;
    String S_HEALTHMINOROPERATION;
    String S_HEALTHMINORPART;
    String S_HEALTHCONDITION;
    String S_OTHERHC;
    String CENTER_BRANCH;
    String SESSIONS;
    int PARENT_ID;

    public student(String MYKID,String S_FNAME, String S_LNAME, int S_AGE, String S_ADDRESS1, String S_ADDRESS2, String S_CITY, String S_STATE, 
            String S_POSTCODE, String S_GENDER, String S_NATIONALITY, String S_NAMETAG, String S_DATEOFBIRTH, int S_POSTINFAMILY, String S_HOMETEL,
            String S_HEALTHSURGERY, String S_HEALTHSURGERYPART, String S_HEALTHMINOROPERATION, String S_HEALTHMINORPART, String S_HEALTHCONDITION,
            String S_OTHERHC, String CENTER_BRANCH, String SESSIONS,int PARENT_ID) {
        this.MYKID = MYKID;
        this.S_FNAME = S_FNAME;
        this.S_LNAME = S_LNAME;
        this.S_AGE = S_AGE;
        this.S_ADDRESS1 = S_ADDRESS1;
        this.S_ADDRESS2 = S_ADDRESS2;
        this.S_CITY = S_CITY;
        this.S_STATE = S_STATE;
        this.S_POSTCODE = S_POSTCODE;
        this.S_GENDER = S_GENDER;
        this.S_NATIONALITY = S_NATIONALITY;
        this.S_NAMETAG = S_NAMETAG;
        this.S_DATEOFBIRTH = S_DATEOFBIRTH;
        this.S_POSTINFAMILY = S_POSTINFAMILY;
        this.S_HOMETEL = S_HOMETEL;
        this.S_HEALTHSURGERY = S_HEALTHSURGERY;
        this.S_HEALTHSURGERYPART = S_HEALTHSURGERYPART;
        this.S_HEALTHMINOROPERATION = S_HEALTHMINOROPERATION;
        this.S_HEALTHMINORPART = S_HEALTHMINORPART;
        this.S_HEALTHCONDITION = S_HEALTHCONDITION;
        this.S_OTHERHC = S_OTHERHC;
        this.CENTER_BRANCH = CENTER_BRANCH;
        this.SESSIONS = SESSIONS;
        this.PARENT_ID = PARENT_ID;
    }

    public String getMYKID() {
        return MYKID;
    }
    public String getS_FNAME() {
        return S_FNAME;
    }
    public String getS_LNAME() {
        return S_LNAME;
    }
    public int getS_AGE() {
        return S_AGE;
    }
    public String getS_ADDRESS1() {
        return S_ADDRESS1;
    }   
    public String getS_ADDRESS2() {
        return S_ADDRESS2;
    }   
    public String getS_S_CITY() {
        return S_CITY;
    }
    public String getS_S_STATE() {
        return S_STATE;
    }
    public String getS_POSTCODE() {
        return S_POSTCODE;
    }
    public String getS_GENDER() {
        return S_GENDER;
    }
    public String getS_NATIONALITY() {
        return S_NATIONALITY;
    }
    public String getS_NAMETAG() {
        return S_NAMETAG;
    }
    public String getS_DATEOFBIRTH() {
        return S_DATEOFBIRTH;
    }
    public int getS_POSTINFAMILY() {
        return S_POSTINFAMILY;
    }
    public String getS_HOMETEL() {
        return S_HOMETEL;
    }
    public String getS_HEALTHSURGERY() {
        return S_HEALTHSURGERY;
    }
    public String getS_HEALTHSURGERYPART() {
        return S_HEALTHSURGERYPART;
    }
    public String getS_HEALTHMINOROPERATION() {
        return S_HEALTHMINOROPERATION;
    }
    public String getS_HEALTHMINORPART() {
        return S_HEALTHMINORPART;
    }
    public String getS_HEALTHCONDITION() {
        return S_HEALTHCONDITION;
    }
    public String getS_OTHERHC() {
        return S_OTHERHC;
    }
    public String getCENTER_BRANCH() {
        return CENTER_BRANCH;
    }
    public String getSESSIONS() {
        return SESSIONS;
    }
    public int getPARENT_ID() {
        return PARENT_ID;
    }
}