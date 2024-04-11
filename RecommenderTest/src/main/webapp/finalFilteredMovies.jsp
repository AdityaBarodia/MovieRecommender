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
        <a href="RatingPage.jsp"><button class="btn2">recommend Movies</button></a>
      </div>
    </nav>
    <h1 class="title">Your personalized suggestions...</h1>
    <div class="movies-list2">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      <div class="card-container2">
      
	<%
		ArrayList<String> filteredMovies = (ArrayList<String>)request.getAttribute("filteredMovies"); 
	if(filteredMovies.size()!=0){
	for(int i=0; i<filteredMovies.size(); i++){
  	  String title = MovieDatabase.getTitle(filteredMovies.get(i));
  	  String URL = MovieDatabase.getStoredPoster(filteredMovies.get(i));
	  String genres = MovieDatabase.getGenres(filteredMovies.get(i));
	  String year = Integer.toString(MovieDatabase.getYear(filteredMovies.get(i)));
	  String minutes = Integer.toString(MovieDatabase.getMinutes(filteredMovies.get(i)))+" min(s)";
	  String description = MovieDatabase.getMovieDescription(filteredMovies.get(i));
	  String country = MovieDatabase.getCountry(filteredMovies.get(i));
	  String directors = MovieDatabase.getDirector(filteredMovies.get(i));
	%>
	<div class="card2">
          <img src="<% out.print(URL);%>" class="card-img2" alt="" /> 
          <div class="card-body2">
            	<h2 class="name2"><% out.print(title); %></h2> 
            	<h3 class="des2"><% out.print(genres); %></h3>
            	<h3 class="des2"><% out.print(country); %></h3>
            	<h3 class="des2"><% out.print(year); %></h3>
            	<h3 class="des2"><% out.print(minutes); %></h3>
            	<h3 class="des2"><% out.print(directors); %></h3>
            	<a href="<% out.print(description); %>">
            		<button class="watchlist-btn2">Watch now...</button>
            	</a>
          </div>
        </div>
        
      <% } }
	else{
	  %>
	  <h1 class="title"> No movies found satisfying all your filters o_O</h1>
	  <% } %>
      </div>
      </div>
	<script src="RatingPageJS.js" async></script>
</body>
</html>