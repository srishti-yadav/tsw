<%-- 
    Document   : submit
    Created on : 14-Jul-2018, 01:39:25
    Author     : Naman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    		<link rel="stylesheet" href="assets/css/main.css" />
    <style>
       
      .image-icon{
         width: 100px;
         height: 100px;
         border-radius: 50%;
             margin: 0px;
            text-decoration: none;
        }
        
        .main{
            padding: 25px;
        }
        
       
        .bdy{
            padding-top: 30px;
            width: 700px;
            
        }
        
    </style>
    </head>
    
    <body>
    
        <section id="two" class="main style2">
				<div class="container">
                    <center>
                    <div class="major" id="linkss">
                          <img class="image-icon" src ="images/tsw-icon.jpg"/>
								
                    </div>
                    <p> 
Hi, 
<%= request.getAttribute("name") %> 
</p>
					<div class="bdy">
                        Submit your write up here.
                     
                        <input style="height: 100px" name='sub'  type="text" placeholder="Type / Copy your submission">
                        
                        <br>
                        
                     
                        <input style="height: 40px" name='pen'  type="text" placeholder="Enter your pen-name over here">
                        
                        <br>
                        
                         <form action="#" onsubmit="if(document.getElementById('agree').checked) { return true; } else { alert('Please confirm that all your work is original.'); return false; }">

                             <input type="checkbox" name="checkbox" value="check" id="agree" /> <label style="color: white" for="agree">I hereby declare that my submission is my original work.</label>
<input type="submit" name="submit" value="submit" />

</form>
                        <a href="voli.html">Become a volunteer</a>
                    
                        


				</div>
                    </center>
            </div>
                    
			</section>
        
        <section id="footer">
				<ul class="icons">
					
					<li><a href="https://www.facebook.com/thesoulwithin2017/" target="_blank" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
					<li><a href="https://www.instagram.com/the_soulwithin/?hl=en" target="_blank" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
					<li><a href="https://www.youtube.com/channel/UC844x6ZH2X0Te_lxX0UKxIg" target="_blank" class="icon alt fa-youtube-play"><span class="label">Youtube</span></a></li>
				</ul>
				<ul class="copyright">
					<li>&copy; Copyright:TSW reserves all rights to the content and media of our team/events.
We however, aren't liable to the authenticity of content provided by external sources.</li>
                    <li>&copy; Developers: Naman Agrawal & Srishti Yadav</li>
				</ul>
			</section>
    </body>
</html>
