<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
    
    
    <h1 class="title">Popular Genres</h1>
    <div class="genre-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <form action="FilterServlet" method="post">
      
      <div class="genre-container">
    	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Romance">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Romance.png" alt="Romance"
        			class="genre-card-image">
      	</label>	
   		 <label class="genre-card">
    		<input type="checkbox" name="Genres" value="Action">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Action.png" alt="Action"
        			class="genre-card-image">
      	</label>	
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Crime">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Crime.png" alt="Crime"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Adventure">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Adventure.png" alt="Adventure"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Comedy">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Comedy.png" alt="Comedy"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Horror">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Horror.png" alt="Horror"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Drama">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Drama.png" alt="Drama"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Thriller">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Thriller.png" alt="Thriller"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Animation">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Animation.png" alt="Animation"
        			class="genre-card-image">
      	</label><label class="genre-card">
    		<input type="checkbox" name="Genres" value="Mystery">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Mystery.png" alt="Mystery"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Family">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Family.png" alt="Family"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Sci-Fi">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Sci-Fi.png" alt="Sci-Fi"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Documentary">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Documentary.png" alt="Documentary"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="History">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/History.png" alt="History"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Fantasy">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Fantasy.png" alt="Fantasy"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Musical">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Musical.png" alt="Musical"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Biography">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Biography.png" alt="Biography"
        			class="genre-card-image">
      	</label>
      	<label class="genre-card">
    		<input type="checkbox" name="Genres" value="Sports">
        		<img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/Sports.png" alt="Sports"
        			class="genre-card-image">
      	</label>
      </div>
    </div>

	<h1 class="title">Minutes long...</h1>
    <div class="MINcontainer">
  		<div class="MINmin-value numberVal">
    		<input type="number" min="0" max="350" value=""  placeholder="0" disabled>
    	</div>
      	&nbsp;-
      	<div class="MINrange-slider">
        	<div class="MINprogress"></div>
        		<input type="range" class="MINrange-min" min="0" max="350" value="0" name="minMinutes">
        		<input type="range" class="MINrange-max" min="0" max="350" value="350" name="maxMinutes">
      	</div>
      	- &nbsp;
      	<div class="MINmax-value numberVal">
        	<input type="number" min="0" max="350" value=""  placeholder="350" disabled>
      	</div>
	</div>
	
	
	<h1 class="title">Year between...</h1>
    <div class="YRcontainer">
  		<div class="YRmin-value numberVal2">
    		<input type="number" min="1916" max="2015" value=""  placeholder="1916" disabled>
    	</div>
      	&nbsp;-
      	<div class="YRrange-slider">
        	<div class="YRprogress"></div>
        		<input type="range" class="YRrange-min" min="1916" max="2015" value="1916" name="minYear">
        		<input type="range" class="YRrange-max" min="1916" max="2015" value="2015" name="maxYear">
      	</div>
      	- &nbsp;
      	<div class="YRmax-value numberVal2">
        	<input type="number" min="1916" max="2015" value=""  placeholder="2015" disabled>
      	</div>
	</div>

	
	<h1 class="title">Directors</h1>
	<div class="search-box-container">
	<input type="text" class="search-box2" placeholder="Christopher Nolan,Zoya Akhtar,Steven Spielberg,Sanjay Leela Bhansali,Farah Khan ......" value="" name="directors"/>
	</div>
	
	<div class="button-container">
		<button class="apply-btn">Apply Filters</button>
	</div>
	</form>
    <script src="FilterPage.js" async></script>
  </body>
  
</html>
    
    