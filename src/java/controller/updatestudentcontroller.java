/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import da.loginDA;
import da.StudentDA;
//import domain.login;
import domain.student;
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
@WebServlet(name = "updatestudentcontroller", urlPatterns = {"updatestudentcontroller"})
public class updatestudentcontroller extends HttpServlet {

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
            out.println("1");
            //String MYKID = (String)request.getSession().getAttribute("MYKID");
            String MYKID = request.getParameter("MYKID");
            String S_FNAME = request.getParameter("S_FNAME");
            String S_LNAME = request.getParameter("S_LNAME");
            int S_AGE = Integer.parseInt(request.getParameter("S_AGE"));
            String S_ADDRESS1 = request.getParameter("S_ADDRESS1");
            String S_ADDRESS2 = request.getParameter("S_ADDRESS2");
            String S_CITY = request.getParameter("S_CITY");
            String S_STATE = request.getParameter("S_STATE");
            String S_POSTCODE = request.getParameter("S_POSTCODE");
            String S_GENDER = request.getParameter("S_GENDER");
            String S_NATIONALITY = request.getParameter("S_NATIONALITY");
            String S_NAMETAG = request.getParameter("S_NAMETAG");
            String S_DATEOFBIRTH = request.getParameter("S_DATEOFBIRTH");
            int S_POSTINFAMILY = Integer.parseInt(request.getParameter("S_POSTINFAMILY"));
            String S_HOMETEL = request.getParameter("S_HOMETEL");
            String S_HEALTHSURGERY = request.getParameter("S_HEALTHSURGERY");
            String S_HEALTHSURGERYPART = request.getParameter("S_HEALTHSURGERYPART");
            String S_HEALTHMINOROPERATION = request.getParameter("S_HEALTHMINOROPERATION");
            String S_HEALTHMINORPART = request.getParameter("S_HEALTHMINORPART");
            String S_HEALTHCONDITION = request.getParameter("S_HEALTHCONDITION");
            String S_OTHERHC = request.getParameter("S_OTHERHC");
            String CENTER_BRANCH = request.getParameter("CENTER_BRANCH");
            String SESSIONS = request.getParameter("SESSIONS");
            int PARENT_ID = (int)request.getSession().getAttribute("PARENT_ID");
            //out.println("3");
            
            try {
                student s = StudentDA.updateStudent(MYKID,S_FNAME,S_LNAME,S_AGE,S_ADDRESS1,S_ADDRESS2,S_CITY,
                    S_STATE,S_POSTCODE,S_GENDER,S_NATIONALITY,S_NAMETAG,S_DATEOFBIRTH,
                    S_POSTINFAMILY,S_HOMETEL,S_HEALTHSURGERY,S_HEALTHSURGERYPART,
                    S_HEALTHMINOROPERATION,S_HEALTHMINORPART,S_HEALTHCONDITION,S_OTHERHC
                    ,CENTER_BRANCH,SESSIONS,PARENT_ID);
                //out.println("4");
                
                if(s==null)
                {
                    out.println("<script>window.alert('Unsuccessful Update');"
                            + "window.location ='updatestudinfo.jsp';"
                            + "</script>");
                }
                else 
                {
                     request.getSession().setAttribute("student", s);
                    out.println("<script>window.alert('Successful Update');"
                            + "window.location ='updatestudinfo.jsp';"
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
