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
        <a href="RatingPage.jsp"><button class="btn2">recommend Movies</button></a>
        <a href="FilterPage.jsp"><button class="btn2">filters</button></a>
      </div>
      <div class="carousel-container">
        <div class="carousel"></div>
      </div>
    </nav>
    <div class="video-card-container">
      <div class="video-card">
        <img
          src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/disney.PNG"
          class="video-card-image"
          alt=""
        />
        <video src="videos/disney.mp4" muted loop class="card-video"></video>
      </div>
      <div class="video-card">
        <img
          src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pixar.PNG"
          class="video-card-image"
          alt=""
        />
        <video src="videos/pixar.mp4" muted loop class="card-video"></video>
      </div>
      <div class="video-card">
        <img
          src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/marvel.PNG"
          class="video-card-image"
          alt=""
        />
        <video src="videos/marvel.mp4" muted loop class="card-video"></video>
      </div>
      <div class="video-card">
        <img
          src="https://raw.githubusercontent.com/Pranav-8bit/hotstar/main/images/star-wars.PNG"
          class="video-card-image"
          alt=""
        />
        <video src="videos/star-war.mp4" muted loop class="card-video"></video>
      </div>
      <div class="video-card">
        <img
          src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/geographic.PNG"
          class="video-card-image"
          alt=""
        />
        <video
          src="videos/geographic.mp4"
          muted
          loop
          class="card-video"
        ></video>
      </div>
    </div>
    <% RecommendationRunner r1 = new RecommendationRunner(); %>
    <h1 class="title">Trending Right Now...</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%201.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Loki</h2>
            <h6 class="des">Action, Adventure, Fantasy, Sci-Fi</h6>
            <a href="https://www.imdb.com/title/tt9140554/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%202.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Mulan</h2>
            <h6 class="des">Action, Adventure, Drama, Fantasy</h6>
            <a href="https://www.imdb.com/title/tt4566758/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>

        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%203.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">The Falcon and the Winter Soldier</h2>
            <h6 class="des">Action, Adventure, Drama, Sci-Fi</h6>
            <a href="https://www.imdb.com/title/tt9208876/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>

        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%204.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Avengers: Endgame</h2>
            <h6 class="des">Action, Adventure, Drama, Sci-Fi</h6>
            <a href="https://www.imdb.com/title/tt4154796/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>

        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%205.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Thor: Ragnarok</h2>
            <h6 class="des">Action, Adventure, Comedy, Fantasy, Sci-Fi</h6>
            <a href="https://www.imdb.com/title/tt3501632/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%206.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">The Avengers</h2>
            <h6 class="des">Action, Sci-Fi</h6>
            <a href="https://www.imdb.com/title/tt0848228/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%207.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Pirates of the Caribbean: Dead Men Tell No Tales</h2>
            <h6 class="des">Action, Adventure, Fantasy</h6>
            <a href="https://www.imdb.com/title/tt1790809/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%208.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Soul</h2>
            <h6 class="des">Animation, Adventure, Comedy, Drama, Family, Fantasy, Music</h6>
            <a href="https://www.imdb.com/title/tt2948372/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%209.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Raya and the Last Dragon</h2>
            <h6 class="des">Animation, Action, Adventure, Comedy, Drama, Family, Fantasy</h6>
            <a href="https://www.imdb.com/title/tt5109280/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%2010.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Luca</h2>
            <h6 class="des">Animation, Adventure, Comedy, Drama, Family, Fantasy</h6>
            <a href="https://www.imdb.com/title/tt12801262/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
        <div class="card">
          <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/poster%2011.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Ford v Ferrari</h2>
            <h6 class="des">Action, BioGraphy, Drama, Sport</h6>
            <a href="https://www.imdb.com/title/tt1950186/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
        <div class="card">
          <img src="https://raw.githubusercontent.com/Pranav-8bit/hotstar/main/images/poster%2012.png" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name">Dark Phoenix</h2>
            <h6 class="des">Action, Adventure, Sci-Fi</h6>
            <a href="https://www.imdb.com/title/tt6565702/">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        </div>
      </div>
    <h1 class="title">Recommendations for you</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
       
      
      <%
      //RecommendationRunner r = new RecommendationRunner();
      ArrayList<String> chosenMovies = r1.getItemsToRate();

      for(int i=0; i<chosenMovies.size(); i++){
    	  String title = MovieDatabase.getTitle(chosenMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(chosenMovies.get(i));
    	  String genre = MovieDatabase.getGenres(chosenMovies.get(i));
    	  String description = MovieDatabase.getMovieDescription(chosenMovies.get(i));
      %>
      
      <div class="card">
          <img src="<% out.print(URL);%>" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name"><% out.print(title); %></h2>
            <h6 class="des"><% out.print(genre); %></h6>
            <a href="<% out.print(description); %>">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
      <%} %>
      </div>
      </div>
    <h1 class="title">Dive into 90s</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
       
      
      <%
      //RecommendationRunner r2 = new RecommendationRunner();
      ArrayList<String> ninetiesMovies = r1.get90sMovies();

      for(int i=0; i<ninetiesMovies.size(); i++){
    	  String title = MovieDatabase.getTitle(ninetiesMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(ninetiesMovies.get(i));
    	  String genre = MovieDatabase.getGenres(ninetiesMovies.get(i));
    	  String description = MovieDatabase.getMovieDescription(ninetiesMovies.get(i));
      %>
      
      <div class="card">
          <img src="<% out.print(URL);%>" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name"><% out.print(title); %></h2>
            <h6 class="des"><% out.print(genre); %></h6>
            <a href="<% out.print(description); %>">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
      <%} %>
      </div>
      </div>
      
      <h1 class="title">Top Rated on IMDb</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
       
      
      <%
      //RecommendationRunner r3 = new RecommendationRunner();
      ArrayList<String> topMovies = r1.getTopMovies();

      for(int i=0; i<topMovies.size(); i++){
    	  String title = MovieDatabase.getTitle(topMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(topMovies.get(i));
    	  String genre = MovieDatabase.getGenres(topMovies.get(i));
    	  String description = MovieDatabase.getMovieDescription(topMovies.get(i));
      %>
      
      <div class="card">
          <img src="<% out.print(URL);%>" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name"><% out.print(title); %></h2>
            <h6 class="des"><% out.print(genre); %></h6>
            <a href="<% out.print(description); %>">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
      <%} %>
      </div>
      </div>
      
      <h1 class="title">Horror Stories</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
       
      
      <%
      //RecommendationRunner r4 = new RecommendationRunner();
      ArrayList<String> horrorMovies = r1.getHorrorMovies();

      for(int i=0; i<horrorMovies.size(); i++){
    	  String title = MovieDatabase.getTitle(horrorMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(horrorMovies.get(i));
    	  String genre = MovieDatabase.getGenres(horrorMovies.get(i));
    	  String description = MovieDatabase.getMovieDescription(horrorMovies.get(i));
      %>
      
      <div class="card">
          <img src="<% out.print(URL);%>" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name"><% out.print(title); %></h2>
            <h6 class="des"><% out.print(genre); %></h6>
            <a href="<% out.print(description); %>">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
      <%} %>
      </div>
      </div>
      
      <h1 class="title">Love Bites</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
       
      
      <%
      //RecommendationRunner r5 = new RecommendationRunner();
      ArrayList<String> romanceMovies = r1.getRomanceMovies();

      for(int i=0; i<romanceMovies.size(); i++){
    	  String title = MovieDatabase.getTitle(romanceMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(romanceMovies.get(i));
    	  String genre = MovieDatabase.getGenres(romanceMovies.get(i));
    	  String description = MovieDatabase.getMovieDescription(romanceMovies.get(i));
      %>
      
      <div class="card">
          <img src="<% out.print(URL);%>" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name"><% out.print(title); %></h2>
            <h6 class="des"><% out.print(genre); %></h6>
            <a href="<% out.print(description); %>">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
      <%} %>
      </div>
      </div>
      
      <h1 class="title">Original Documentaries</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
       
      
      <%
      //RecommendationRunner r5 = new RecommendationRunner();
      ArrayList<String> documentaryMovies = r1.getDocumentaryMovies();

      for(int i=0; i<documentaryMovies.size(); i++){
    	  String title = MovieDatabase.getTitle(documentaryMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(documentaryMovies.get(i));
    	  String genre = MovieDatabase.getGenres(documentaryMovies.get(i));
    	  String description = MovieDatabase.getMovieDescription(documentaryMovies.get(i));
      %>
      
      <div class="card">
          <img src="<% out.print(URL);%>" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name"><% out.print(title); %></h2>
            <h6 class="des"><% out.print(genre); %></h6>
            <a href="<% out.print(description); %>">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
      <%} %>
      </div>
      </div>
      
      
      <h1 class="title">Best in Action</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
       
      
      <%
      //RecommendationRunner r5 = new RecommendationRunner();
      ArrayList<String> actionMovies = r1.getActionMovies();

      for(int i=0; i<actionMovies.size(); i++){
    	  String title = MovieDatabase.getTitle(actionMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(actionMovies.get(i));
    	  String genre = MovieDatabase.getGenres(actionMovies.get(i));
    	  String description = MovieDatabase.getMovieDescription(actionMovies.get(i));
      %>
      
      <div class="card">
          <img src="<% out.print(URL);%>" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name"><% out.print(title); %></h2>
            <h6 class="des"><% out.print(genre); %></h6>
            <a href="<% out.print(description); %>">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
      <%} %>
      </div>
      </div>
      
      
      <h1 class="title">Drama Delights</h1>
    <div class="movies-list">
      <button class="pre-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/pre.png" alt="" />
      </button>
      <button class="nxt-btn" title="btn">
        <img src="https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/nxt.png" alt="" />
      </button>
      
      <div class="card-container">
       
      
      <%
      //RecommendationRunner r5 = new RecommendationRunner();
      ArrayList<String> dramaMovies = r1.getDramaMovies();

      for(int i=0; i<dramaMovies.size(); i++){
    	  String title = MovieDatabase.getTitle(dramaMovies.get(i));
    	  String URL = MovieDatabase.getStoredPoster(dramaMovies.get(i));
    	  String genre = MovieDatabase.getGenres(dramaMovies.get(i));
    	  String description = MovieDatabase.getMovieDescription(dramaMovies.get(i));
      %>
      
      <div class="card">
          <img src="<% out.print(URL);%>" class="card-img" alt="" />
          <div class="card-body">
            <h2 class="name"><% out.print(title); %></h2>
            <h6 class="des"><% out.print(genre); %></h6>
            <a href="<% out.print(description); %>">
            	<button class="watchlist-btn">Watch now...</button>
            </a>
          </div>
        </div>
        
      <%} %>
      </div>
      </div>
    <script src="index.js" async></script>
  </body>
</html>
