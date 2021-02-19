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
public class parent {
    
    int PARENT_ID;
    String EMAIL;
    String F_FIRSTNAME;
    String F_LASTNAME;
    String F_IC;
    String F_CONTACTNUM;
    String F_OFFICENUMBER;
    String F_RACES;
    String F_RELIGION;
    String F_JOBSECTOR;
    String F_COMPANYNAME;
    String M_FIRSTNAME;
    String M_LASTNAME;
    String M_IC;
    String M_CONTACTNUM;
    String M_OFFICENUMBER;
    String M_RACES;
    String M_RELIGION;
    String M_JOBSECTOR;
    String M_COMPANYNAME;
    

    public parent(int PARENT_ID,String EMAIL, String F_FIRSTNAME, String F_LASTNAME, String F_IC, String F_CONTACTNUM,
            String F_OFFICENUMBER, String F_RACES, String F_RELIGION, String F_JOBSECTOR, String F_COMPANYNAME,
            String M_FIRSTNAME, String M_LASTNAME, String M_IC, String M_CONTACTNUM, String M_OFFICENUMBER,
            String M_RACES, String M_RELIGION, String M_JOBSECTOR, String M_COMPANYNAME) {
        this.PARENT_ID = PARENT_ID;
        this.EMAIL = EMAIL;
        this.F_FIRSTNAME = F_FIRSTNAME;
        this.F_LASTNAME = F_LASTNAME;
        this.F_IC = F_IC;
        this.F_CONTACTNUM = F_CONTACTNUM;
        this.F_OFFICENUMBER = F_OFFICENUMBER;
        this.F_RACES = F_RACES;
        this.F_RELIGION = F_RELIGION;
        this.F_JOBSECTOR = F_JOBSECTOR;
        this.F_COMPANYNAME = F_COMPANYNAME;
        this.M_FIRSTNAME = M_FIRSTNAME;
        this.M_LASTNAME = M_LASTNAME;
        this.M_IC = M_IC;
        this.M_CONTACTNUM = M_CONTACTNUM;
        this.M_OFFICENUMBER = M_OFFICENUMBER;
        this.M_RACES = M_RACES;
        this.M_RELIGION = M_RELIGION;
        this.M_JOBSECTOR = M_JOBSECTOR;
        this.M_COMPANYNAME = M_COMPANYNAME;
    }

         public parent(String EMAIL, String F_FIRSTNAME, String F_LASTNAME, String F_IC, String F_CONTACTNUM,
            String F_OFFICENUMBER, String F_RACES, String F_RELIGION, String F_JOBSECTOR, String F_COMPANYNAME,
            String M_FIRSTNAME, String M_LASTNAME, String M_IC, String M_CONTACTNUM, String M_OFFICENUMBER,
            String M_RACES, String M_RELIGION, String M_JOBSECTOR, String M_COMPANYNAME) {
        this.EMAIL = EMAIL;
        this.F_FIRSTNAME = F_FIRSTNAME;
        this.F_LASTNAME = F_LASTNAME;
        this.F_IC = F_IC;
        this.F_CONTACTNUM = F_CONTACTNUM;
        this.F_OFFICENUMBER = F_OFFICENUMBER;
        this.F_RACES = F_RACES;
        this.F_RELIGION = F_RELIGION;
        this.F_JOBSECTOR = F_JOBSECTOR;
        this.F_COMPANYNAME = F_COMPANYNAME;
        this.M_FIRSTNAME = M_FIRSTNAME;
        this.M_LASTNAME = M_LASTNAME;
        this.M_IC = M_IC;
        this.M_CONTACTNUM = M_CONTACTNUM;
        this.M_OFFICENUMBER = M_OFFICENUMBER;
        this.M_RACES = M_RACES;
        this.M_RELIGION = M_RELIGION;
        this.M_JOBSECTOR = M_JOBSECTOR;
        this.M_COMPANYNAME = M_COMPANYNAME;
    }
    public int getPARENT_ID() {
        return PARENT_ID;
    }    
    public String getEMAIL() {
        return EMAIL;
    }
    public String getF_FIRSTNAME() {
        return F_FIRSTNAME;
    }
    public String getF_LASTNAME() {
        return F_LASTNAME;
    }
    public String getF_IC() {
        return F_IC;
    }
    public String getF_CONTACTNUM() {
        return F_CONTACTNUM;
    }
    public String getF_OFFICENUMBER() {
        return F_OFFICENUMBER;
    }
    public String getF_RACES() {
        return F_RACES;
    }
    public String getF_RELIGION() {
        return F_RELIGION;
    }
    public String getF_JOBSECTOR() {
        return F_JOBSECTOR;
    }
    public String getF_COMPANYNAME() {
        return F_COMPANYNAME;
    }
    public String getM_FIRSTNAME() {
        return M_FIRSTNAME;
    }
    public String getM_LASTNAME() {
        return M_LASTNAME;
    }
    public String getM_IC() {
        return M_IC;
    }
    public String getM_CONTACTNUM() {
        return M_CONTACTNUM;
    }
    public String getM_OFFICENUMBER() {
        return M_OFFICENUMBER;
    }
    public String getM_RACES() {
        return M_RACES;
    }
    public String getM_RELIGION() {
        return M_RELIGION;
    }
    public String getM_JOBSECTOR() {
        return M_JOBSECTOR;
    }
    public String getM_COMPANYNAME() {
        return M_COMPANYNAME;
    }
}