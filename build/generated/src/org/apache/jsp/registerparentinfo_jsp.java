package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.parent;
import db.dbconnect;
import java.util.*;;
import java.sql.*;
import java.util.Random;

public final class registerparentinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<title>TADIKA ARIF MINDA</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins\">\n");
      out.write("<style>\n");
      out.write("body,h1,h2,h3,h4,h5 {font-family: \"Poppins\", sans-serif}\n");
      out.write("body {font-size:16px;}\n");
      out.write(".w3-half img{margin-bottom:-6px;margin-top:16px;opacity:0.8;cursor:pointer}\n");
      out.write(".w3-half img:hover{opacity:1}\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 80%;\n");
      out.write("  padding: 12px 30px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Sidebar/menu -->\n");
      out.write("<nav class=\"w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding\" style=\"z-index:3;width:300px;font-weight:bold;\" id=\"mySidebar\"><br>\n");
      out.write("  <a href=\"javascript:void(0)\" onclick=\"w3_close()\" class=\"w3-button w3-hide-large w3-display-topleft\" style=\"width:100%;font-size:22px\">Close Menu</a>\n");
      out.write("  <div class=\"w3-container\">\n");
      out.write("    <h3 class=\"w3-padding-64\"><b>TADIKA<br>ARIF<br>MINDA</b></h3>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-bar-block\">\n");
      out.write("    <a href=\"home.jsp\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-hover-white\">HOME</a> \n");
      out.write("    <a href=\"searchreg.jsp\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-hover-white\">SEARCH</a> \n");
      out.write("    <a href=\"registerstud.jsp\" onclick=\"w3_close\" class=\"w3-bar-item w3-button w3-hover-white\">REGISTER STUDENT INFORMATION</a>\n");
      out.write("    <a href=\"registerparentinfo.jsp\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-hover-white\">REGISTER PARENT INFORMATION</a> \n");
      out.write("    <a href=\"payment.jsp\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-hover-white\"> MAKE PAYMENT</a> \n");
      out.write("    <a href=\"logout.jsp\" onclick=\"w3_close()\" class=\"w3-bar-item w3-button w3-hover-white\">LOG OUT</a>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- Top menu on small screens -->\n");
      out.write("<header class=\"w3-container w3-top w3-hide-large w3-red w3-xlarge w3-padding\">\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"w3-button w3-red w3-margin-right\" onclick=\"w3_open()\">?</a>\n");
      out.write("  <span>TADIKA ARIF MINDA</span>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("<div class=\"w3-overlay w3-hide-large\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<div class=\"w3-main\" style=\"margin-left:340px;margin-right:40px\">\n");
      out.write("\n");
      out.write("  <!-- Header -->\n");
      out.write("  <div class=\"w3-container\" style=\"margin-top:80px\" >\n");
      out.write("    <h1 class=\"w3-jumbo\"><b>REGISTRATION 2020</b></h1>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("<form method=\"post\" action=\"regparentcontroller\">\n");
      out.write("<table class=\"w3-table\">\n");
      out.write("<tbody>\n");
      out.write("<tr><td class=\"w3-center\" colspan=\"2\"><b>Father Details</b></td></tr>\n");
      out.write("<tr><td> First Name: </td><td><input name=\"F_FIRSTNAME\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Last Name: </td><td><input name=\"F_LASTNAME\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Email: </td><td><input name=\"EMAIL\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> IC Number: </td><td><input name=\"F_IC\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Contact Number: </td><td><input name=\"F_CONTACTNUM\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Office Number</td><td><input name=\"F_OFFICENUMBER\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Races: </td><td><select name=\"F_RACES\">\n");
      out.write("\t\t\t\t\t\t <option value=\"Malay\">Malay</option>\n");
      out.write("\t\t\t\t\t\t <option value=\"Chinese\">Chinese</option>\n");
      out.write("\t\t\t\t\t\t <option value=\"Indian\">Indian</option>\n");
      out.write("\t\t\t\t\t\t <option value=\"Other\">Other</option>\n");
      out.write("\t\t\t\t\t\t </select></td></tr>\n");
      out.write("<tr><td> Religion: </td><td><select name=\"F_RELIGION\">\n");
      out.write("\t\t\t\t\t\t  \t<option value=\"Islam\">Islam</option>\n");
      out.write("\t\t\t\t\t\t  \t<option value=\"Hindu\">Hindu</option>\n");
      out.write("\t\t\t\t\t\t  \t<option value=\"Buddha\">Buddha</option>\n");
      out.write("\t\t\t\t\t\t  \t</select></td></tr>\n");
      out.write("<tr><td> Job Sector: </td><td><input name=\"F_JOBSECTOR\" type=\"radio\" value=\"Government\" >Government \n");
      out.write("\t\t\t\t\t\t\t  <input name=\"F_JOBSECTOR\" type=\"radio\" value=\"Non-Government\" >Non-Government\n");
      out.write("\t\t\t\t\t\t\t  <input name=\"F_JOBSECTOR\" type=\"radio\" value=\"Other\" >Other</td></tr>\n");
      out.write("<tr><td> Company Name: </td><td><input name=\"F_COMPANYNAME\" type=\"text\"></td></tr>\n");
      out.write("<tr><td class=\"w3-center\" colspan=\"2\"><b>Mother's Details</b></td></tr>\n");
      out.write("<tr><td> First Name: </td><td><input name=\"M_FIRSTNAME\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Last Name: </td><td><input name=\"M_LASTNAME\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> IC Number: </td><td><input name=\"M_IC\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Contact Number: </td><td><input name=\"M_CONTACTNUM\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Office Number</td><td><input name=\"M_OFFICENUMBER\" type=\"text\"></td></tr>\n");
      out.write("<tr><td> Races: </td><td><select name=\"M_RACES\">\n");
      out.write("\t\t\t\t\t\t <option value=\"Malay\">Malay</option>\n");
      out.write("\t\t\t\t\t\t <option value=\"Chinese\">Chinese</option>\n");
      out.write("\t\t\t\t\t\t <option value=\"Indian\">Indian</option>\n");
      out.write("\t\t\t\t\t\t <option value=\"Other\">Other</option>\n");
      out.write("\t\t\t\t\t\t </select></td></tr>\n");
      out.write("<tr><td> Religion: </td><td><select name=\"M_RELIGION\">\n");
      out.write("\t\t\t\t\t\t  \t<option value=\"Islam\">Islam</option>\n");
      out.write("\t\t\t\t\t\t  \t<option value=\"Hindu\">Hindu</option>\n");
      out.write("\t\t\t\t\t\t  \t<option value=\"Buddha\">Buddha</option>\n");
      out.write("\t\t\t\t\t\t  \t<option value=\"Other\">Other</option>\n");
      out.write("\t\t\t\t\t\t  \t</select></td></tr>\n");
      out.write("<tr><td> Job Sector: </td><td><input name=\"M_JOBSECTOR\" type=\"radio\" value=\"Government\" >Government \n");
      out.write("\t\t\t\t\t\t\t  <input name=\"M_JOBSECTOR\" type=\"radio\" value=\"Non-Government\" >Non-Government\n");
      out.write("\t\t\t\t\t\t\t  <input name=\"M_JOBSECTOR\" type=\"radio\" value=\"Other\" >Other</td></tr>\n");
      out.write("<tr><td> Company Name: </td><td><input name=\"M_COMPANYNAME\" type=\"text\"></td></tr>\n");
      out.write("<tr><td class=\"w3-center\" colspan=\"2\"><button type=\"submit\">Save</button></td></tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- End page content -->\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- W3.CSS Container -->\n");
      out.write("<div class=\"w3-pale-yellow w3-container w3-padding-32\" style=\"margin-top:75px;padding-right:58px\"><p class=\"w3-right\">TADIKA ARIF MINDA 2019</p></div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Script to open and close sidebar\n");
      out.write("function w3_open() {\n");
      out.write("  document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("  document.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("}\n");
      out.write(" \n");
      out.write("function w3_close() {\n");
      out.write("  document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("  document.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
