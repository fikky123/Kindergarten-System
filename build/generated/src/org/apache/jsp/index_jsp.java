package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>TADIKA ARIF MINDA</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("html,body,h1,h2,h3,h4 {font-family:\"Lato\", sans-serif}\n");
      out.write(".mySlides {display:none}\n");
      out.write(".w3-tag, .fa {cursor:pointer}\n");
      out.write(".w3-tag {height:15px;width:15px;padding:0;margin-top:6px}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Links (sit on top) -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-row w3-large w3-pale-red\">\n");
      out.write("    <div class=\"w3-col s3\">\n");
      out.write("      <a href=\"#\" class=\"w3-button w3-block\">Home</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col s3\">\n");
      out.write("      <a href=\"#about\" class=\"w3-button w3-block\">About us</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col s3\">\n");
      out.write("      <a href=\"#programmes\" class=\"w3-button w3-block\">Programmes</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col s3\">\n");
      out.write("      <a href=\"loginchoice.jsp\" class=\"w3-button w3-block\">Log In</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Content -->\n");
      out.write("<div class=\"w3-content\" style=\"max-width:1100px;margin-top:80px;margin-bottom:80px\">\n");
      out.write("\n");
      out.write("  <div class=\"w3-panel\">\n");
      out.write("    <h1><b>TADIKA ARIF MINDA</b></h1>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Slideshow -->\n");
      out.write("  <div class=\"w3-container\">\n");
      out.write("    <div class=\"w3-display-container mySlides\">\n");
      out.write("      <img src=\"picture/budak1.jpg\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("    <div class=\"w3-display-container mySlides\">\n");
      out.write("      <img src=\"picture/budak3.jpg\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("    <div class=\"w3-display-container mySlides\">\n");
      out.write("      <img src=\"picture/camp_9.jpg\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <!-- Slideshow next/previous buttons -->\n");
      out.write("    <div class=\"w3-container w3-dark-grey w3-padding w3-xlarge\">\n");
      out.write("      <div class=\"w3-left\" onclick=\"plusDivs(-1)\"><i class=\"fa fa-arrow-circle-left w3-hover-text-teal\"></i></div>\n");
      out.write("      <div class=\"w3-right\" onclick=\"plusDivs(1)\"><i class=\"fa fa-arrow-circle-right w3-hover-text-teal\"></i></div>\n");
      out.write("    \n");
      out.write("      <div class=\"w3-center\">\n");
      out.write("        <span class=\"w3-tag demodots w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(1)\"></span>\n");
      out.write("        <span class=\"w3-tag demodots w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(2)\"></span>\n");
      out.write("        <span class=\"w3-tag demodots w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(3)\"></span>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("     <div class=\"w3-container w3-content w3-center w3-padding-64\" style=\"max-width:800px\" id=\"about\">\n");
      out.write("\t<h2 class=\"w3-wide\">BACKGROUND</h2>\n");
      out.write("    <p class=\"w3-justify\">\n");
      out.write("\t\t  Tadika Arif Minda was established in January 2006 to cater the need of a good quality preschool education. We are committed to give young learners wonderful and effective learning experiences, by using the best practices in early childhood education. It is also our goal to prepare the children to become righteous slave of Allah, caliph of Allah and ummah of Nabi Muhammad S.A.W. Tadika Arif Minda appeal to the communities who want their children to be well educated in both religion and academic area.<br>\n");
      out.write("\t\t  Currently, we have 5 centres including 2 centres in Seksyen 27, Shah Alam, 2 centres in Bandar Saujana Putra and 1 centre in Denai Alam.  We have produced thousands of graduates throughout 11 years of educating young khalifah of Allah.<br>\n");
      out.write("\t<h2 class=\"w3-wide\">VISION AND MISSION</h2>\n");
      out.write("    <p class=\"w3-justify\">\n");
      out.write("\t\t  Arif Minda learning program is designed for children aged 3-6 years old. The curriculum follows the Kurikulum Pra Sekolah Kebangsaan (KSPK) by Ministry of Education Malaysia. Islamic studies are integrated into every topic within all subjects taught in the curriculum as children need a lot of exposures and opportunities to learn.<br>\n");
      out.write("\t\t  <p class=\"w3-opacity\"><i>OUR VISION</i></p>\n");
      out.write("\t\t  <p class=\"w3-justify\">\n");
      out.write("\t\t  - To be the leading preschool and child enrichment centre focusing in developing the Islamic values with the emphasis of English as a medium of communication<br>\n");
      out.write("\t\t  <p class=\"w3-opacity\"><i>OUR MISSION</i></p>\n");
      out.write("\t\t  <p class=\"w3-justify\">\n");
      out.write("\t\t  - To contribute and provide an integrated pre-school educational program suitable for the early development of the child that produce a wholly practicing Muslim<br>\n");
      out.write("\t\t  - To nurture the growth of children in all areas of development with Islamic values<br>\n");
      out.write("\t\t  - To develop and prepare the children to be Muslims of excellent character who are highly motivated to learn, and superior academically<br>\n");
      out.write("\t\t  - To generate sense of security, trust, responsibility and independence in the child<br>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <!-- Grid -->  \n");
      out.write("     <div class=\"w3-container w3-content w3-center w3-padding-64\" style=\"max-width:800px\" id=\"\">\n");
      out.write("    <h2 class=\"w3-wide\">FOUNDERS</h2>\n");
      out.write("  <div class=\"w3-row-padding w3-padding-16 w3-center\" id=\"food\">\n");
      out.write("    <div class=\"w3-quarter\">\n");
      out.write("      <img src=\"picture/En_Izhar.png\" alt=\"Sandwich\" style=\"width:100%\">\n");
      out.write("\t   <p>ENCIK IZHAR MOHD NOOR</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-quarter\">\n");
      out.write("      <img src=\"picture/Pn_Nora.png\" alt=\"Steak\" style=\"width:100%\">\n");
      out.write("\t  <p>PUAN NORAFEIDAH MOKHTAR</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-quarter\">\n");
      out.write("      <img src=\"picture/Pn_Hasisah.png\" alt=\"Cherries\" style=\"width:100%\">\n");
      out.write("\t  <p>PUAN NOOR HASISAH RAJAK</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-quarter\">\n");
      out.write("      <img src=\"picture/En_Firdaus.png\" alt=\"Pasta and Wine\" style=\"width:100%\">\n");
      out.write("\t  <p>ENCIK MUHAMAD FIRDAUS ABDULLAH</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Grid -->\n");
      out.write(" <div class=\"w3-container w3-content w3-center w3-padding-64\" style=\"max-width:800px\" id=\"programmes\">\n");
      out.write("    <h2 class=\"w3-wide\">PROGRAMMES</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col l3 m6 w3-container w3-padding-16\">\n");
      out.write("      <h3>SUBJECT TAUGHTS</h3>\n");
      out.write("      <p>Bahasa Malaysia</p>\n");
      out.write("      <p>English</p>\n");
      out.write("      <p>Bahasa Arab</p>\n");
      out.write("      <p>Mathematics</p>\n");
      out.write("      <p>Science</p>\n");
      out.write("      <p>Agama Islam</p>\n");
      out.write("      <p>Jawi</p>\n");
      out.write("      <p>Art and Craft</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"w3-col l3 m6 w3-container w3-padding-16\">\n");
      out.write("      <h3>HAFAZAN</h3>\n");
      out.write("      <p>Surah Lazim</p>\n");
      out.write("      <p>Daily Du'as</p>\n");
      out.write("      <p>Practical Solat and Wudu'</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"w3-col l3 m6 w3-container w3-padding-16\">\n");
      out.write("      <h3>ACTIVITIES</h3>\n");
      out.write("      <p>Physical Exercise(PE)</p>\n");
      out.write("      <p>Water Play</p>\n");
      out.write("      <p>Gardening</p>\n");
      out.write("      <p>Birthday Celebration</p>\n");
      out.write("      <p>Music Appreciation</p>\n");
      out.write("      <p>Story Telling</p>\n");
      out.write("      <p>Educational CD Program</p>\n");
      out.write("      <p>Cooking</p>\n");
      out.write("      <p> </p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"w3-col l3 m6 w3-container w3-padding-16\">\n");
      out.write("      <h3>EVENTS</h3>\n");
      out.write("      <p>Registration Day</p>\n");
      out.write("      <p>Orintation Week</p>\n");
      out.write("      <p>Mid year and year end progress assesment</p>\n");
      out.write("      <p>Annual Sports Day/Graduation Day</p>\n");
      out.write("      <p>Parents Day</p>\n");
      out.write("      <p>Field Day</p>\n");
      out.write("      <p>Photo Day</p>\n");
      out.write("      <p> </p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-padding-32 w3-pale-red w3-center\">\n");
      out.write("  <h4></h4>\n");
      out.write("  <a href=\"#\" class=\"w3-button w3-black w3-margin\"><i class=\"fa fa-arrow-up w3-margin-right\"></i>To the top</a>\n");
      out.write("  <div class=\"w3-xlarge w3-section\">\n");
      out.write("    <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("  </div>\n");
      out.write("  <p>TADIKA ARIF MINDA 2019</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Slideshow\n");
      out.write("// Automatic Slideshow - change image every 4 seconds\n");
      out.write("var myIndex = 0;\n");
      out.write("carousel();\n");
      out.write("\n");
      out.write("function carousel() {\n");
      out.write("  var i;\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("    x[i].style.display = \"none\";  \n");
      out.write("  }\n");
      out.write("  myIndex++;\n");
      out.write("  if (myIndex > x.length) {myIndex = 1}    \n");
      out.write("  x[myIndex-1].style.display = \"block\";  \n");
      out.write("  setTimeout(carousel, 3000);    \n");
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
