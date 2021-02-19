<%-- 
    Document   : report
    Created on : Sep 25, 2019, 1:40:47 AM
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
    <%
        student S = (student)request.getSession().getAttribute("student"); 
        %>

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding" style="z-index:3;width:300px;font-weight:bold;" id="mySidebar"><br>
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-button w3-hide-large w3-display-topleft" style="width:100%;font-size:22px">Close Menu</a>
  <div class="w3-container">
    <h3 class="w3-padding-64"><b>TADIKA<br>ARIF<br>MINDA</b></h3>
  </div>
  <div class="w3-bar-block"> 
    <a href="viewreport.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">STUDENT REPORT</a> 
    <a href="viewpaymentreport.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">PAYMENT REPORT</a>
    <a href="logout.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">LOG OUT</a>
  </div>
</nav>

<!-- Top menu on small screens -->
<header class="w3-container w3-top w3-hide-large w3-red w3-xlarge w3-padding">
  <a href="javascript:void(0)" class="w3-button w3-red w3-margin-right" onclick="w3_open()">â°</a>
  <span>TADIKA ARIF MINDA</span>
</header>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:340px;margin-right:40px">

  <!-- Header -->
  <div class="w3-container" style="margin-top:80px" id="showcase">
    <h1 class="w3-jumbo"><b>STUDENT DETAILS</b></h1>
    
    <table class="w3-table">
        <tr><td>MYKID: </td><td><% out.println(S.getMYKID()); %></td></tr>
        <tr><td>Name </td><td><% out.println(S.getS_FNAME() + " " + S.getS_LNAME()); %></td></tr>
        <tr><td>Age </td><td><% out.println(S.getS_AGE()); %></td></tr>
        <tr><td>Address </td><td><% out.println(S.getS_ADDRESS1() + " " + S.getS_ADDRESS2()); %></td></tr>
        <tr><td>City: </td><td><% out.println(S.getS_S_CITY()); %></td></tr>
        <tr><td>State: </td><td><% out.println(S.getS_S_STATE()); %></td></tr>
        <tr><td>Postcode: </td><td><% out.println(S.getS_POSTCODE()); %></td></tr>
        <tr><td>Nationality: </td><td><% out.println(S.getS_NATIONALITY()); %></td></tr>
        <tr><td>Nickname (for nametag): </td><td><% out.println(S.getS_NAMETAG()); %></td></tr>
        <tr><td>Date of Birth: </td><td><% out.println(S.getS_DATEOFBIRTH()); %></td></tr>
        <tr><td>Post in Family: </td><td><% out.println(S.getS_POSTINFAMILY()); %></td></tr>
        <tr><td>Telephone(home): </td><td><% out.println(S.getS_HOMETEL()); %></td></tr>
        <tr><td>Surgery: </td><td><% out.println(S.getS_HEALTHSURGERY()); %></td></tr>
        <tr><td>Surgery Part: </td><td><% out.println(S.getS_HEALTHSURGERYPART()); %></td></tr>
        <tr><td>Minor Operation: </td><td><% out.println(S.getS_HEALTHMINOROPERATION()); %></td></tr>
        <tr><td>Minor Part: </td><td><% out.println(S.getS_HEALTHMINORPART()); %></td></tr>
        <tr><td>Health Condition: </td><td><% out.println(S.getS_HEALTHCONDITION()); %></td></tr>
        <tr><td>Other: </td><td><% out.println(S.getS_OTHERHC()); %></td></tr>
        <tr><td>Branch: </td><td><% out.println(S.getCENTER_BRANCH()); %></td></tr>
        <tr><td>Session: </td><td><% out.println(S.getSESSIONS()); %></td></tr>
    </table>
  </div>
  
  <div id="live_data"></div>

  <button onclick="myFunction()">Print this Page</button>
<!-- End page content -->	
</div>

<!-- W3.CSS Container -->
<div class="w3-pale-yellow w3-container w3-padding-32" style="margin-top:75px;padding-right:58px"><p class="w3-right">TADIKA ARIF MINDA 2019</p></div>
<script>
function myFunction() {
  window.print();
}
</script>
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
fetch_data();

function fetch_data() {
    $.ajax({
    url: "viewreportcontroller",
    method: "POST",
    datatype: "text",
    success: function (data) {
    $(live_data).html(data);
    console.log(data);
    }
    });
    }

