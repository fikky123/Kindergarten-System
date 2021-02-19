<%-- 
    Document   : index
    Created on : Sep 21, 2019, 11:18:52 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>TADIKA ARIF MINDA</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4 {font-family:"Lato", sans-serif}
.mySlides {display:none}
.w3-tag, .fa {cursor:pointer}
.w3-tag {height:15px;width:15px;padding:0;margin-top:6px}
</style>

<body>

<!-- Links (sit on top) -->
<div class="w3-top">
  <div class="w3-row w3-large w3-pale-red">
    <div class="w3-col s3">
      <a href="#" class="w3-button w3-block">Home</a>
    </div>
    <div class="w3-col s3">
      <a href="#about" class="w3-button w3-block">About us</a>
    </div>
    <div class="w3-col s3">
      <a href="#programmes" class="w3-button w3-block">Programmes</a>
    </div>
    <div class="w3-col s3">
      <a href="loginchoice.jsp" class="w3-button w3-block">Log In</a>
    </div>
  </div>
</div>

<!-- Content -->
<div class="w3-content" style="max-width:1100px;margin-top:80px;margin-bottom:80px">

  <div class="w3-panel">
    <h1><b>TADIKA ARIF MINDA</b></h1>
  </div>

  <!-- Slideshow -->
  <div class="w3-container">
    <div class="w3-display-container mySlides">
      <img src="budak1.jpg" style="width:100%">
      </div>
    <div class="w3-display-container mySlides">
      <img src="budak3.jpg" style="width:100%">
      </div>
    <div class="w3-display-container mySlides">
      <img src="camp_9.jpg" style="width:100%">
      </div>
	</div>

    <!-- Slideshow next/previous buttons -->
    <div class="w3-container w3-dark-grey w3-padding w3-xlarge">
      <div class="w3-left" onclick="plusDivs(-1)"><i class="fa fa-arrow-circle-left w3-hover-text-teal"></i></div>
      <div class="w3-right" onclick="plusDivs(1)"><i class="fa fa-arrow-circle-right w3-hover-text-teal"></i></div>
    
      <div class="w3-center">
        <span class="w3-tag demodots w3-border w3-transparent w3-hover-white" onclick="currentDiv(1)"></span>
        <span class="w3-tag demodots w3-border w3-transparent w3-hover-white" onclick="currentDiv(2)"></span>
        <span class="w3-tag demodots w3-border w3-transparent w3-hover-white" onclick="currentDiv(3)"></span>
      </div>
    </div>
  
     <div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px" id="about">
	<h2 class="w3-wide">BACKGROUND</h2>
    <p class="w3-justify">
		  Tadika Arif Minda was established in January 2006 to cater the need of a good quality preschool education. We are committed to give young learners wonderful and effective learning experiences, by using the best practices in early childhood education. It is also our goal to prepare the children to become righteous slave of Allah, caliph of Allah and ummah of Nabi Muhammad S.A.W. Tadika Arif Minda appeal to the communities who want their children to be well educated in both religion and academic area.<br>
		  Currently, we have 5 centres including 2 centres in Seksyen 27, Shah Alam, 2 centres in Bandar Saujana Putra and 1 centre in Denai Alam.  We have produced thousands of graduates throughout 11 years of educating young khalifah of Allah.<br>
	<h2 class="w3-wide">VISION AND MISSION</h2>
    <p class="w3-justify">
		  Arif Minda learning program is designed for children aged 3-6 years old. The curriculum follows the Kurikulum Pra Sekolah Kebangsaan (KSPK) by Ministry of Education Malaysia. Islamic studies are integrated into every topic within all subjects taught in the curriculum as children need a lot of exposures and opportunities to learn.<br>
		  <p class="w3-opacity"><i>OUR VISION</i></p>
		  <p class="w3-justify">
		  - To be the leading preschool and child enrichment centre focusing in developing the Islamic values with the emphasis of English as a medium of communication<br>
		  <p class="w3-opacity"><i>OUR MISSION</i></p>
		  <p class="w3-justify">
		  - To contribute and provide an integrated pre-school educational program suitable for the early development of the child that produce a wholly practicing Muslim<br>
		  - To nurture the growth of children in all areas of development with Islamic values<br>
		  - To develop and prepare the children to be Muslims of excellent character who are highly motivated to learn, and superior academically<br>
		  - To generate sense of security, trust, responsibility and independence in the child<br>
    </div>
  
    <!-- Grid -->  
     <div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px" id="">
    <h2 class="w3-wide">FOUNDERS</h2>
  <div class="w3-row-padding w3-padding-16 w3-center" id="food">
    <div class="w3-quarter">
      <img src="En_Izhar.png" alt="Sandwich" style="width:100%">
	   <p>ENCIK IZHAR MOHD NOOR</p>
    </div>
    <div class="w3-quarter">
      <img src="Pn_Nora.png" alt="Steak" style="width:100%">
	  <p>PUAN NORAFEIDAH MOKHTAR</p>
    </div>
    <div class="w3-quarter">
      <img src="Pn_Hasisah.png" alt="Cherries" style="width:100%">
	  <p>PUAN NOOR HASISAH RAJAK</p>
    </div>
    <div class="w3-quarter">
      <img src="En_Firdaus.png" alt="Pasta and Wine" style="width:100%">
	  <p>ENCIK MUHAMAD FIRDAUS ABDULLAH</p>
    </div>
  </div>

  <!-- Grid -->
 <div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px" id="programmes">
    <h2 class="w3-wide">PROGRAMMES</h2>
    </div>
    <div class="w3-col l3 m6 w3-container w3-padding-16">
      <h3>SUBJECT TAUGHTS</h3>
      <p>Bahasa Malaysia</p>
      <p>English</p>
      <p>Bahasa Arab</p>
      <p>Mathematics</p>
      <p>Science</p>
      <p>Agama Islam</p>
      <p>Jawi</p>
      <p>Art and Craft</p>
    </div>

    <div class="w3-col l3 m6 w3-container w3-padding-16">
      <h3>HAFAZAN</h3>
      <p>Surah Lazim</p>
      <p>Daily Du'as</p>
      <p>Practical Solat and Wudu'</p>
    </div>

    <div class="w3-col l3 m6 w3-container w3-padding-16">
      <h3>ACTIVITIES</h3>
      <p>Physical Exercise(PE)</p>
      <p>Water Play</p>
      <p>Gardening</p>
      <p>Birthday Celebration</p>
      <p>Music Appreciation</p>
      <p>Story Telling</p>
      <p>Educational CD Program</p>
      <p>Cooking</p>
      <p> </p>
    </div>

    <div class="w3-col l3 m6 w3-container w3-padding-16">
      <h3>EVENTS</h3>
      <p>Registration Day</p>
      <p>Orintation Week</p>
      <p>Mid year and year end progress assesment</p>
      <p>Annual Sports Day/Graduation Day</p>
      <p>Parents Day</p>
      <p>Field Day</p>
      <p>Photo Day</p>
      <p> </p>
    </div>
  </div>
  </div>
<!-- Footer -->
<footer class="w3-container w3-padding-32 w3-pale-red w3-center">
  <h4></h4>
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  <div class="w3-xlarge w3-section">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
  </div>
  <p>TADIKA ARIF MINDA 2019</p>
</footer>


<script>
// Slideshow
// Automatic Slideshow - change image every 4 seconds
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 3000);    
}
</script>

</body>
</html>