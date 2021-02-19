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
public class Staff {
    
    int STAFF_ID;
    String PASSWORD;
   // String BRANCHNAME;
   // int CENTREDID;
    

    public Staff(int STAFF_ID,String PASSWORD) {
        this.STAFF_ID = STAFF_ID;
        this.PASSWORD = PASSWORD;
       // this.BRANCHNAME = BRANCHNAME;
       // this.CENTREDID = CENTREDID;
    }

    public int getSTAFF_ID() {
        return STAFF_ID;
    }
    public String getPASSWORD() {
        return PASSWORD;
    }
   // public String getBRANCHNAME() {
   //     return BRANCHNAME;
   // }
   // public int getCENTREDID() {
   //     return CENTREDID;
   // }
}