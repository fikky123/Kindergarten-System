<%-- 
    Document   : logout
    Created on : Oct 31, 2019, 2:58:09 PM
    Author     : admin
--%>

<%
    session.invalidate();
        response.sendRedirect("index.jsp");
        %>