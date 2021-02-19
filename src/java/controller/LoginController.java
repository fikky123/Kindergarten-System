/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import da.StudentDA;
import da.loginDA;
import da.parentDA;
import domain.student;
import domain.login;
import domain.parent;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 
 */
public class LoginController extends HttpServlet {

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
            
            String EMAIL = request.getParameter("EMAIL");
            out.println("\n"+EMAIL);
            String PASSWORD = request.getParameter("PASSWORD");
            out.println("\n"+PASSWORD);
            //String MYKID = request.getParameter("MYKID");
            try {
                out.println("1");
                
                login l = loginDA.authenticateLogin(EMAIL, PASSWORD);
                //student s = StudentDA.getStudent(MYKID);
                //login L = loginDA.authenticateLogin(p.getPARENT_ID(),PASSWORD); tak payah authenticate dua kali
                if(l==null)
                {
                    out.println("<script>window.alert('Unsuccessful Login');"
                            + "window.location ='login.jsp';"
                            + "</script>"); 
                }
                else
                {
                    parent p = parentDA.authenticateParent(l.getEMAIL());
                    request.getSession().setAttribute("EMAIL",p.getEMAIL());
                    request.getSession().setAttribute("PARENT_ID",p.getPARENT_ID());
                    //request.getSession().setAttribute("MYKID",s.getMYKID());
                    //response.sendRedirect("home.jsp");
                    out.println("<script>window.alert('Successful Login');"
                            + "window.location ='home.jsp';"
                            + "</script>");
                    //request.getSession().setAttribute("teacherPosition",T.getTeacherPosition());
                    //request.setAttribute("teacherId",T.getTeacherId());
                    //if(T.getTeacherPosition().equals("Admin"))
                    //{
                        //request.getRequestDispatcher("homeAdmin.jsp").forward(request, response);
                        //request.getRequestDispatcher("homeAdmin.jsp").forward(request, response);
                        //response.sendRedirect("homeAdmin.jsp");
                    //}
                    //else
                    //{
                        //request.getRequestDispatcher("homeStaff.jsp").forward(request, response);
                        //request.getRequestDispatcher("homeStaff.jsp").forward(request, response);
                        //response.sendRedirect("homeStaff.jsp");
                   // }
                    //response.sendRedirect("homeStaff.jsp");
                    
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