<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="MyPackage.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Probot Recommender</title>
    <link rel="icon" href="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Logo.png" type="image/icon type">
    <link rel="stylesheet" href="styles.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  </head>
  <body>
    <nav class="navbar">
      <img
        src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Logo.png"
        class="brand-logo"
        alt=""
      />
      <ul class="nav-links">
        <li class="nav-items"><a href="#">TV</a></li>
        <li class="nav-items"><a href="#">movies</a></li>
        <li class="nav-items"><a href="#">sports</a></li>
        <li class="nav-items"><a href="#">premium</a></li>
      </ul>

      <div class="right-container">
        <input type="text" class="search-box" placeholder="search" value=""/>
        <button class="sub-btn">search</button>
        <a href="index.jsp"><button class="btn2">home</button></a>
        <a href="FilterPage.jsp"><button class="btn2">filters</button></a>
      </div>
    </nav>
    
    
    <h1 class="title">Rate to get Personalized Recommendations...</h1>
    <div class="movies-list2">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      <form action="MyServlet" method="post">
      <div class="card-container2">
      <%
      RecommendationRunner r = new RecommendationRunner();
      ArrayList<String> chosenMovies = r.getItemsToRate();
      
      for(int i=0; i<chosenMovies.size(); i++){   		
    	  String title = MovieDatabase.getTitle(chosenMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(chosenMovies.get(i));
    	  String name = "r"+Integer.toString(i+1);
    	  String movieID = chosenMovies.get(i);
      %>
 
      <div class="card2">
          <img src="<% out.print(URL);%>" class="card-img2" alt="" /> 
          	<div class="card-body2">
            	<h2 class="name2"><% out.print(title); %></h2>   
            	
            	<div class="radio-container">
      				<div class="radio-tile-group">
       					<div class="input-container">
         				<input id="1" type="radio" name="<% out.print(name);%>" value="<% out.print("01"+movieID); %>">
          				<div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="1">1</label>
          				</div>
       					</div>
       					<div class="input-container">
          				<input id="2" type="radio" name="<% out.print(name);%>" value="<% out.print("02"+movieID); %>">
         				 <div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="2">2</label>
          				</div>
        				</div>
        				<div class="input-container">
          				<input id="3" type="radio" name="<% out.print(name);%>" value="<% out.print("03"+movieID); %>">
          				<div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="3">3</label>
          				</div>
        				</div>
       					<div class="input-container">
         				<input id="4" type="radio" name="<% out.print(name);%>" value="<% out.print("04"+movieID); %>">
          				<div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="4">4</label>
          				</div>
       					</div>
       					<div class="input-container">
          				<input id="5" type="radio" name="<% out.print(name);%>" value="<% out.print("05"+movieID); %>">
         				 <div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="5">5</label>
          				</div>
        				</div>
        				<div class="input-container">
          				<input id="6" type="radio" name="<% out.print(name);%>" value="<% out.print("06"+movieID); %>">
          				<div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="6">6</label>
          				</div>
        				</div> 
        				<div class="input-container">
         				<input id="7" type="radio" name="<% out.print(name);%>" value="<% out.print("07"+movieID); %>">
          				<div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="7">7</label>
          				</div>
       					</div>
       					<div class="input-container">
          				<input id="8" type="radio" name="<% out.print(name);%>" value="<% out.print("08"+movieID); %>">
         				 <div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="8">8</label>
          				</div>
        				</div>
        				<div class="input-container">
          				<input id="9" type="radio" name="<% out.print(name);%>" value="<% out.print("09"+movieID); %>">
          				<div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="9">9</label>
          				</div>
        				</div>
        				<div class="input-container">
          				<input id="10" type="radio" name="<% out.print(name);%>" value="<% out.print("10"+movieID); %>">
          				<div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="10">10</label>
          				</div>
        				</div>
        				<div class="input-container">
          				<input id="0" type="radio" name="<% out.print(name);%>" value="<% out.print("00"+movieID); %>" checked="" >
          				<div class="radio-tile">
            			<ion-icon name="star"></ion-icon>
            			<label for="0">None</label>
          				</div>
       					</div>
    				</div>
    			</div>
			</div>
		</div>
			
		
      <%} %>
      </div>
      </div>
    <div class="button-container">
		<button class="apply-btn" id="submitButton">Submit</button>
	</div>
	</form> 
	<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    <script src="RatingPageJS.js" async></script>
  </body>
</html>
