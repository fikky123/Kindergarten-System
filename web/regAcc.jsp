<%-- 
    Document   : regAcc
    Created on : Sep 21, 2019, 11:13:56 AM
    Author     : admin
--%>
<%@page import="domain.login"%>
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
<nav class="w3-sidebar w3-white w3-collapse w3-top w3-large w3-padding" style="z-index:3;width:300px;font-weight:bold;" id="mySidebar"><br>
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-button w3-hide-large w3-display-topleft" style="width:100%;font-size:22px">Close Menu</a>
  <div class="w3-container">
    <h3 class="w3-padding-64"><b>TADIKA<br>ARIF<br>MINDA</b></h3>
  </div>
</nav>

<!-- Top menu on small screens -->
<header class="w3-container w3-top w3-hide-large w3-red w3-xlarge w3-padding">
  <a href="javascript:void(0)" class="w3-button w3-red w3-margin-right" onclick="w3_open()">☰</a>
  <span>TADIKA ARIF MINDA</span>
</header>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:340px;margin-right:40px">

  <!-- Header -->
    <!-- Header -->
  <div class="w3-container" style="margin-top:80px" id="showcase">
    <h1 class="w3-jumbo"><b>Register Account</b></h1>
  </div>
  <div class="w3-hide-large" style="margin-top:83px"></div>
  
    <form method="post" action="regparentcontroller">
    <table class="w3-table">
	<tr><td><b>Email</b></td>
        <td><input type="text" placeholder="Enter Email" name="EMAIL" required></td></tr>
        <tr><td><b>Password</b></td>
        <td><input type="password" placeholder="Enter Password" name="PASSWORD" required></td></tr>
        <tr><td class="w3-center" colspan="2"><b>Father Details</b></td></tr>
        <tr><td> First Name: </td><td><input name="F_FIRSTNAME" type="text" required></td></tr>
        <tr><td> Last Name: </td><td><input name="F_LASTNAME" type="text" required></td></tr>
        <tr><td> IC Number: </td><td><input name="F_IC" type="text" required></td></tr>
        <tr><td> Contact Number: </td><td><input name="F_CONTACTNUM" type="text" required></td></tr>
        <tr><td> Office Number</td><td><input name="F_OFFICENUMBER" type="text" required></td></tr>
        <tr><td> Races: </td><td><select name="F_RACES">
						 <option value="Malay">Malay</option>
						 <option value="Chinese">Chinese</option>
						 <option value="Indian">Indian</option>
						 <option value="Other">Other</option>
						 </select></td></tr>
        <tr><td> Religion: </td><td><select name="F_RELIGION">
						  	<option value="Islam">Islam</option>
						  	<option value="Hindu">Hindu</option>
						  	<option value="Buddha">Buddha</option>
						  	</select></td></tr>
        <tr><td> Job Sector: </td><td><input name="F_JOBSECTOR" type="radio" value="Government" >Government 
							  <input name="F_JOBSECTOR" type="radio" value="Non-Government" >Non-Government
							  <input name="F_JOBSECTOR" type="radio" value="Other" >Other</td></tr>
        <tr><td> Company Name: </td><td><input name="F_COMPANYNAME" type="text" required></td></tr>
        <tr><td class="w3-center" colspan="2"><b>Mother's Details</b></td></tr>
        <tr><td> First Name: </td><td><input name="M_FIRSTNAME" type="text" required></td></tr>
        <tr><td> Last Name: </td><td><input name="M_LASTNAME" type="text" required></td></tr>
        <tr><td> IC Number: </td><td><input name="M_IC" type="text" required></td></tr>
        <tr><td> Contact Number: </td><td><input name="M_CONTACTNUM" type="text" required></td></tr>
        <tr><td> Office Number</td><td><input name="M_OFFICENUMBER" type="text" required></td></tr>
        <tr><td> Races: </td><td><select name="M_RACES">
						 <option value="Malay">Malay</option>
						 <option value="Chinese">Chinese</option>
						 <option value="Indian">Indian</option>
						 <option value="Other">Other</option>
						 </select></td></tr>
        <tr><td> Religion: </td><td><select name="M_RELIGION">
						  	<option value="Islam">Islam</option>
						  	<option value="Hindu">Hindu</option>
						  	<option value="Buddha">Buddha</option>
						  	<option value="Other">Other</option>
						  	</select></td></tr>
        <tr><td> Job Sector: </td><td><input name="M_JOBSECTOR" type="radio" value="Government" >Government 
							  <input name="M_JOBSECTOR" type="radio" value="Non-Government" >Non-Government
							  <input name="M_JOBSECTOR" type="radio" value="Other" >Other</td></tr>
        <tr><td> Company Name: </td><td><input name="M_COMPANYNAME" type="text" required></td></tr>
	<tr><td colspan="2"><button type="submit">Register</button>
	<button onclick="window.location.href = 'login.jsp'" >Log in</button></td></tr>
	</table>
</form>
<!-- End page content -->	
</div>


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