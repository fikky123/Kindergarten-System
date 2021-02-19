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
public class payment {
    
    int PAYMENT_ID;
    String REG_DATE;
    String PAYMENT;
    String EMAIL;
    int RPRICE;
    int ADDPAY;
    
    public payment(int PAYMENT_ID,String REG_DATE, String PAYMENT, 
            String EMAIL,int RPRICE, int ADDPAY) {
        this.PAYMENT_ID = PAYMENT_ID;
        this.REG_DATE = REG_DATE;
        this.PAYMENT = PAYMENT;
        this.EMAIL = EMAIL;
        this.RPRICE = RPRICE;
        this.ADDPAY = ADDPAY;
    }
    
     public payment(String REG_DATE, String PAYMENT, 
            String EMAIL,int RPRICE, int ADDPAY) {
        this.REG_DATE = REG_DATE;
        this.PAYMENT = PAYMENT;
        this.EMAIL = EMAIL;
        this.RPRICE = RPRICE;
        this.ADDPAY = ADDPAY;
    }

    public int getPAYMENT_ID() {
        return PAYMENT_ID;
    }
    public String getREG_DATE() {
        return REG_DATE;
    }
    public String getPAYMENT() {
        return PAYMENT;
    }
    public String getEMAIL() {
        return EMAIL;
    }
    public int getRPRICE() {
        return RPRICE;
    }
    public int getADDPAY() {
        return ADDPAY;
    }
}