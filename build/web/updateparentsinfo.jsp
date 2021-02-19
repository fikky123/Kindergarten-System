<%-- 
    Document   : updateparentsinfo
    Created on : Oct 10, 2019, 11:09:39 AM
    Author     : admin
--%>

<%@page import="domain.parent"%>
<%@page import="db.dbconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*;"%>
<%@ page language="java" import="java.sql.*"%>
<%@ page import="java.util.Random"%>
<!DOCTYPE html>
<html lang="en">
<title>TADIKA ARIF MINDA</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
<style>
body,h1,h2,h3,h4,h5 {font-family: "Poppins", sans-serif}
body {font-size:16px;}
.w3-half img{margin-bottom:-6px;margin-top:16px;opacity:0.8;cursor:pointer}
.w3-half img:hover{opacity:1}
input[type=text], input[type=password] {
  width: 80%;
  padding: 12px 30px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
</style>
<body>

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding" style="z-index:3;width:300px;font-weight:bold;" id="mySidebar"><br>
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-button w3-hide-large w3-display-topleft" style="width:100%;font-size:22px">Close Menu</a>
  <div class="w3-container">
    <h3 class="w3-padding-64"><b>TADIKA<br>ARIF<br>MINDA</b></h3>
  </div>
  <div class="w3-bar-block">
    <a href="home.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">HOME</a> 
    <a href="registerstud.jsp" onclick="w3_close" class="w3-bar-item w3-button w3-hover-white">REGISTER STUDENT INFORMATION</a>
    <a href="payment.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white"> MAKE PAYMENT</a> 
    <a href="updateparentsinfo.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white"> UPDATE PARENT INFORMATION</a>
    <a href="viewupdate.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white"> UPDATE STUDENT INFORMATION</a>
    <a href="logout.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">LOG OUT</a>
  </div>
</nav>

<!-- Top menu on small screens -->
<header class="w3-container w3-top w3-hide-large w3-red w3-xlarge w3-padding">
  <a href="javascript:void(0)" class="w3-button w3-red w3-margin-right" onclick="w3_open()">?</a>
  <span>TADIKA ARIF MINDA</span>
</header>
 <%
        String EMAIL = (String)session.getAttribute("EMAIL");
	if (EMAIL == null)
        {
            response.sendRedirect("login.jsp");
        }
        request.getSession().setAttribute("EMAIL",EMAIL);
        %>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:340px;margin-right:40px">

  <!-- Header -->
  <div class="w3-container" style="margin-top:80px" >
    <h1 class="w3-jumbo"><b>UPDATE PARENT INFORMATION</b></h1>
  </div>
      
                    <%
                    try {
                            try {
                                Class.forName("oracle.jdbc.OracleDriver");
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }

                            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "arifminda", "arifminda"); //attempting to connect to MySQL database
                            PreparedStatement statement;
                            ResultSet rs;
                            int no=1;
                            statement = conn.prepareStatement("SELECT * FROM PARENTS where EMAIL=?");
                            statement.setString(1, EMAIL);
                            rs = statement.executeQuery();
                            while(rs.next()) 
                            {
                        
                       %>
          <form method="post" action="updateparentcontroller">
  <table class="w3-table">
        <tr><td class="w3-center" colspan="2"><b>Father Details</b></td></tr>
        <tr><td> First Name: </td><td><input name="F_FIRSTNAME" type="text" value="<%= rs.getString("F_FIRSTNAME")%>" required></td></tr>
        <tr><td> Last Name: </td><td><input name="F_LASTNAME" type="text" value="<%= rs.getString("F_LASTNAME")%>" required></td></tr>
        <tr><td> IC Number: </td><td><input name="F_IC" type="text" value="<%= rs.getString("F_IC")%>" required></td></tr>
        <tr><td> Contact Number: </td><td><input name="F_CONTACTNUM" type="text" value="<%= rs.getString("F_CONTACTNUM")%>" required></td></tr>
        <tr><td> Office Number</td><td><input name="F_OFFICENUMBER" type="text" value="<%= rs.getString("F_OFFICENUMBER")%>" required></td></tr>
        <tr><td> Races: </td><td><input name="F_RACES" type="text" value="<%= rs.getString("F_RACES")%>" required></td></tr>
        <tr><td> Religion: </td><td><input name="F_RELIGION" type="text" value="<%= rs.getString("F_RELIGION")%>" required></td></tr>
        <tr><td> Job Sector: </td><td><input name="F_JOBSECTOR" type="text" value="<%= rs.getString("F_JOBSECTOR")%>" required></td></tr>
        <tr><td> Company Name: </td><td><input name="F_COMPANYNAME" type="text" value="<%= rs.getString("F_COMPANYNAME")%>" required></td></tr>
        <tr><td class="w3-center" colspan="2"><b>Mother's Details</b></td></tr>
        <tr><td> First Name: </td><td><input name="M_FIRSTNAME" type="text" value="<%= rs.getString("M_FIRSTNAME")%>" required></td></tr>
        <tr><td> Last Name: </td><td><input name="M_LASTNAME" type="text" value="<%= rs.getString("M_LASTNAME")%>" required></td></tr>
        <tr><td> IC Number: </td><td><input name="M_IC" type="text" value="<%= rs.getString("M_IC")%>" required></td></tr>
        <tr><td> Contact Number: </td><td><input name="M_CONTACTNUM" type="text" value="<%= rs.getString("M_CONTACTNUM")%>" required></td></tr>
        <tr><td> Office Number</td><td><input name="M_OFFICENUMBER" type="text" value="<%= rs.getString("M_OFFICENUMBER")%>" required></td></tr>
        <tr><td> Races: </td><td><input name="M_RACES" type="text" value="<%= rs.getString("M_RACES")%>" required></td></tr>
        <tr><td> Religion: </td><td><input name="M_RELIGION" type="text" value="<%= rs.getString("M_RELIGION")%>" required></td></tr>
        <tr><td> Job Sector: </td><td><input name="M_JOBSECTOR" type="text"  value="<%= rs.getString("M_JOBSECTOR")%>"></td></tr>
        <tr><td> Company Name: </td><td><input name="M_COMPANYNAME" type="text" value="<%= rs.getString("M_COMPANYNAME")%>" required></td></tr>
        <tr><td class="w3-center" colspan="2"><button type="submit" onclick="updateParent(<%=rs.getInt("PARENT_ID")%>);">Update</button></td></tr>
                  
                  <%    no++;}
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                    %>
                </table>
  </form>

<!-- End page content -->	
</div>

<!-- W3.CSS Container -->
<div class="w3-pale-yellow w3-container w3-padding-32" style="margin-top:75px;padding-right:58px"><p class="w3-right">TADIKA ARIF MINDA 2019</p></div>

<script>
// Script to open and close sidebar
function w3_open() {
  document.getElementById("mySidebar").style.display = "block";
  document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
  document.getElementById("mySidebar").style.display = "none";
  document.getElementById("myOverlay").style.display = "none";
}
</script>

</body>
</html>

