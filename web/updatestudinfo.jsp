<%-- 
    Document   : updatestudinfo
    Created on : Oct 10, 2019, 11:09:56 AM
    Author     : admin
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="domain.student"%>
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
    <h1 class="w3-jumbo"><b>UPDATE STUDENT INFORMATION</b></h1>
   
  </di>
  <table class="w3-table">
      <%
        student s = (student)session.getAttribute("student");
        
        //java.util.Date birthdate = new SimpleDateFormat("dd/mm/yyyy").parse(s.getS_DATEOFBIRTH());
        
         
        %>
        
      
                               
<form id="thisForm" action="updatestudentcontroller" method ="POST">
<table class="w3-table">
<tr><td class="w3-center" colspan="2"> Student Details </td></tr>
<tr><td> MYKID: </td><td><input name="MYKID" type="text" id ="MYKID" value="<% out.println(s.getMYKID()); %>" required></td></tr>
<tr><td> First Name: </td><td><input name="S_FNAME" type="text" id="S_FNAME" value="<% out.println(s.getS_FNAME()); %>" required></td></tr>
<tr><td> Last Name: </td><td><input name="S_LNAME" type="text" id="S_LNAME" value="<% out.println(s.getS_LNAME()); %>" required></td></tr>
<tr><td> Age: </td><td><input name="S_AGE" type="text" value="<% out.println(s.getS_AGE()); %>" required></td></tr>
<tr><td> Address: </td><td><input name="S_ADDRESS1" type="text" value="<% out.println(s.getS_ADDRESS1()); %>" required></td></tr>
<tr><td></td><td><input name="S_ADDRESS2" type="text" value="<% out.println(s.getS_ADDRESS2()); %>" required></td></tr>
<tr><td> City </td><td><input name="S_CITY" type="text" value="<% out.println(s.getS_S_CITY()); %>" required></td></tr>
<tr><td> State: </td><td><input name="S_STATE" type="text" value="<% out.println(s.getS_S_STATE()); %>" required></td></tr>
<tr><td> Post code: </td><td><input name="S_POSTCODE" type="text" value="<% out.println(s.getS_POSTCODE()); %>" required></td></tr>
<tr><td> Gender: </td><td><input name="S_GENDER" type="text" value="<% out.println(s.getS_GENDER()); %>" required></td></tr>
<tr><td> Nationality: </td><td><input name="S_NATIONALITY" type="text" value="<% out.println(s.getS_NATIONALITY()); %>" required</td></tr>
<tr><td> Nickname(for nametag): </td><td><input name="S_NAMETAG" type="text" value="<% out.println(s.getS_NAMETAG()); %>" required></td></tr>
<tr><td> Date of Birth: </td><td><input name="S_DATEOFBIRTH" data-date-format="yyyy-mm-dd" type="date" value="<% out.println(s.getS_DATEOFBIRTH()); %>"></td></tr>
<tr><td> Post in Family: </td><td><input name="S_POSTINFAMILY" type="text" value="<% out.println(s.getS_POSTINFAMILY()); %>" required></td></tr>
<tr><td> Telephone Number(home): </td><td><input name="S_HOMETEL" type="text" value="<% out.println(s.getS_HOMETEL()); %>" required></td></tr>
<tr><td> Surgery: </td><td><input type="text" name="S_HEALTHSURGERY" value="<% out.println(s.getS_HEALTHSURGERY()); %>" required></td></tr>
<tr><td> Surgery Part: </td><td><input name="S_HEALTHSURGERYPART" type="text" value="<% out.println(s.getS_HEALTHSURGERYPART()); %>" required></td></tr>
<tr><td> Minor Operation: </td><td><input name="S_HEALTHMINOROPERATION" type="text" value="<% out.println(s.getS_HEALTHMINOROPERATION()); %>" required></td></tr>
<tr><td> Minor Part: </td><td><input name="S_HEALTHMINORPART" type="text" value="<% out.println(s.getS_HEALTHMINORPART()); %>" required></td></tr>
<tr><td> Health Condition: </td><td><input name="S_HEALTHCONDITION" type="text" value="<% out.println(s.getS_HEALTHCONDITION()); %>" required></td></tr>
<tr><td> Other Health Condition: </td><td><input name="S_OTHERHC" type="text" value="<% out.println(s.getS_OTHERHC()); %>" required></td></tr>
<tr><td class="w3-center" colspan="2"> Center Details </td></tr>
<tr><td> Center: </td><td><input name="CENTER_BRANCH" type="text" value="<% out.println(s.getCENTER_BRANCH()); %>" required></td></tr>
<tr><td> Session: </td><td><input name="SESSIONS" type="text" value="<% out.println(s.getSESSIONS()); %>" required></td></tr>

<tr><td class="w3-center" colspan="2"><button type="submit" type="submit">UPDATE</button></td></tr>
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

