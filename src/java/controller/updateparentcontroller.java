/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import da.loginDA;
import da.parentDA;
//import domain.login;
import domain.parent;
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
@WebServlet(name = "updateparentcontroller", urlPatterns = {"updateparentcontroller"})
public class updateparentcontroller extends HttpServlet {

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
            //out.println("1");
            String F_FIRSTNAME = request.getParameter("F_FIRSTNAME");
            String F_LASTNAME = request.getParameter("F_LASTNAME");
            String F_IC = request.getParameter("F_IC");
            String F_CONTACTNUM = request.getParameter("F_CONTACTNUM");  
            String F_OFFICENUMBER = request.getParameter("F_OFFICENUMBER");
            String F_RACES = request.getParameter("F_RACES");
            String F_RELIGION = request.getParameter("F_RELIGION");
            String F_JOBSECTOR = request.getParameter("F_JOBSECTOR");
            String F_COMPANYNAME = request.getParameter("F_COMPANYNAME");
            String M_FIRSTNAME = request.getParameter("M_FIRSTNAME");
            String M_LASTNAME = request.getParameter("M_LASTNAME");
            String M_IC = request.getParameter("M_IC");
            String M_CONTACTNUM = request.getParameter("M_CONTACTNUM");
            String M_OFFICENUMBER = request.getParameter("M_OFFICENUMBER");
            String M_RACES = request.getParameter("M_RACES");
            String M_RELIGION = request.getParameter("M_RELIGION");
            String M_JOBSECTOR = request.getParameter("M_JOBSECTOR");
            String M_COMPANYNAME = request.getParameter("M_COMPANYNAME");
            //out.println("2");
            int PARENT_ID = (int)request.getSession().getAttribute("PARENT_ID");
            String EMAIL = (String)request.getSession().getAttribute("EMAIL");
            //out.println("3");
            //out.println("\n"+loginPassword);
            
            try {
                parent p = parentDA.updateParent(PARENT_ID,EMAIL,F_FIRSTNAME,F_LASTNAME,F_IC,F_CONTACTNUM,
                    F_OFFICENUMBER,F_RACES,F_RELIGION,F_JOBSECTOR,F_COMPANYNAME,M_FIRSTNAME,
                    M_LASTNAME,M_IC,M_CONTACTNUM,M_OFFICENUMBER,M_RACES,M_RELIGION,M_JOBSECTOR,M_COMPANYNAME);
                //out.println("3");
                if(p==null)
                {
                    out.println("<script>window.alert('Unsuccessful Update');"
                            + "window.location ='updateparentsinfo.jsp';"
                            + "</script>");
                }
                else 
                {
                    out.println("<script>window.alert('Successful Update');"
                            + "window.location ='updateparentsinfo.jsp';"
                            + "</script>");
                    
                }
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
