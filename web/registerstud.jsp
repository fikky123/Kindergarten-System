<%-- 
    Document   : registerstud
    Created on : Sep 21, 2019, 11:12:31 AM
    Author     : admin
--%>
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
input[type=text], input[radio]{
  width: 80%;
  padding: 12px 30px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
</style>
<body>
      <%
        String EMAIL = (String)session.getAttribute("EMAIL");
	if (EMAIL == null)
        {
            response.sendRedirect("login.jsp");
        }
        request.getSession().setAttribute("EMAIL",EMAIL);
        %>
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
  <a href="javascript:void(0)" class="w3-button w3-red w3-margin-right" onclick="w3_open()"></a>
  <span>TADIKA ARIF MINDA</span>
</header>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:340px;margin-right:40px">

  <!-- Header -->
  <div class="w3-container" style="margin-top:80px">
    <h1 class="w3-jumbo"><b>REGISTRATION 2020</b></h1>
  </div>
  
<form method="post" action="regstudcontroller">
<table class="w3-table">
<tr><td class="w3-center" colspan="2"> Student Details </td></tr>
<tr><td> MYKID: </td><td><input name="MYKID" type="text" required></td></tr>
<tr><td> First Name: </td><td><input name="S_FNAME" type="text" required></td></tr>
<tr><td> Last Name: </td><td><input name="S_LNAME" type="text" required></td></tr>
<tr><td> Age: </td><td><select name="S_AGE">
			<option value="4">4 years old</option>
			<option value="5">5 years old</option>
			<option value="6">6 years old</option>
			</select></td></tr>
<tr><td> Address: </td><td><input name="S_ADDRESS1" type="text" required></td></tr>
<tr><td></td><td><input name="S_ADDRESS2" type="text" required></td></tr>
<tr><td> City </td><td><input name="S_CITY" type="text" required></td></tr>
<tr><td> State: </td><td><input name="S_STATE" type="text" required></td></tr>
<tr><td> Post code: </td><td><input name="S_POSTCODE" type="text" required></td></tr>
<tr><td> Gender: </td><td><input name="S_GENDER" type="radio" value="Boy">Boy
                           <input name="S_GENDER" type="radio" value="Girl">Girl</td></tr>
<tr><td> Nationality: </td><td><select name="S_NATIONALITY">
                                <option value="Malaysian">Malaysian</option>
				<option value="Other">Other</option>
				</select></td></tr>
<tr><td> Nickname(for nametag): </td><td><input name="S_NAMETAG" type="text"></td></tr>
<tr><td> Date of Birth: </td><td><input name="S_DATEOFBIRTH" data-date-format="DD/MM/yy" type="date" required></td></tr>
<tr><td> Post in Family: </td><td><select name="S_POSTINFAMILY" required>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
                        <option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
                        <option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
                        <option value="10">10</option>
			</select></td></tr>
<tr><td> Telephone Number(home): </td><td><input name="S_HOMETEL" type="text" required></td></tr>
<tr><td> Surgery: </td><td><input type="radio" name="S_HEALTHSURGERY" value="YES"> YES
                           <input type="radio" name="S_HEALTHSURGERY" value="NO"> NO </td></tr>
<tr><td> Surgery Part: </td><td><input name="S_HEALTHSURGERYPART" type="text" required></td></tr>
<tr><td> Minor Operation: </td><td><input name="S_HEALTHMINOROPERATION" type="text" required></td></tr>
<tr><td> Minor Part: </td><td><input name="S_HEALTHMINORPART" type="text" required></td></tr>
<tr><td> Health Condition: </td><td><input name="S_HEALTHCONDITION" type="radio" value="Asthmatic">Asthmatic
                                     <input name="S_HEALTHCONDITION" type="radio" value="Eczema">Eczema
                                     <input name="S_HEALTHCONDITION" type="radio" value="Heart Problem">Heart Problem
                                     <input name="S_HEALTHCONDITION" type="radio" value="Tantrums">Tantrums</td></tr>
<tr><td> Other Health Condition: </td><td><input name="S_OTHERHC" type="text" required></td></tr>
<tr><td class="w3-center" colspan="2"> Center Details </td></tr>
<tr><td> Center: </td><td><select name="CENTER_BRANCH">
                          <option value="Shah Alam">Shah Alam</option>
                          <option value="Bandar Saujana Putra (SP 3)">Bandar Saujana Putra (SP 3)</option>
                          <option value="Bandar Saujana Putra (SP 9)">Bandar Saujana Putra (SP 9)</option>
                          <option value="Denai Alam">Denai Alam</option>
                          </select></td></tr>
<tr><td> Session: </td><td><select name="SESSIONS">
                           <option value="Morning">Morning</option>
                           <option value="Afternoon">Afternoon</option>
                           </select></td></tr>

<tr><td class="w3-center" colspan="2"><button type="submit">Save</button></td></tr>
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
