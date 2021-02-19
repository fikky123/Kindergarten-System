/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import da.StudentDA;
//import da.parentDA;
import da.paymentda;
//import domain.Student;
//import domain.Parent;
import domain.payment;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author
 */
@WebServlet(name = "insertpaymentcontroller", urlPatterns = {"/insertpaymentcontroller"})
public class insertpaymentcontroller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String EMAIL = request.getParameter("EMAIL");        
            String REG_DATE = request.getParameter("REG_DATE");
            String PAYMENT = request.getParameter("PAYMENT");
            int ADDPAY = Integer.parseInt(request.getParameter("ADDPAY"));
            int PRICE = Integer.parseInt(request.getParameter("RPRICE"));
            
            if(PAYMENT.equals("Registration")){
                ADDPAY =0;
            }
            else{
                PRICE =0;
            }
            
            
            try {
                //out.println(motherName);
                payment p = paymentda.insertPayment(REG_DATE,PAYMENT,EMAIL,PRICE,ADDPAY);
               // out.println(P.getMotherName());
                //out.println(motherName);
                //Student S = StudentDA.authenticateStudent(studName,studIC,studAge,studGender,studBirthCertificate,P.getParentId(),1);
                //out.println(S.getStudName());
                //Registration R = RegisterDA.authenticateRegistration(S.getStudId());
                //out.println(R.getRegistrationDate());
                //out.println(R.getRegistrationId());
                if(p==null)
                {
                    out.println("<script>window.alert('Unsuccessful Payment');"
                            + "window.location ='payment.jsp';"
                            + "</script>");
                }
                else 
                {
                    out.println("<script>window.alert('Successful Payment');"
                            + "window.location ='payment.jsp';"
                            + "</script>");
                    
                }
                //else
                //if(loginId>8)
                //{
                //    out.println("Successful!");
                //    response.sendRedirect("register2.jsp");
                //}
                //else 
                //{
                //    out.println("Successful!");
                //    response.sendRedirect("register2Admin.jsp");
                //}
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
