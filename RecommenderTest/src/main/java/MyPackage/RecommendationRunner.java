package MyPackage;
/**
 * Write a description of RecommendationRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class RecommendationRunner implements Recommender{
	
	//giving out 20 random movies without any filter
    public ArrayList<String> getItemsToRate(){
        ArrayList<String> chosenMovies = new ArrayList<String>();
        ArrayList<String> movies = MovieDatabase.filterBy(new TrueFilter());
        for(int i=0; chosenMovies.size()<20; i++){
            Random seed = new Random();
            int randomInt = seed.nextInt(movies.size());
            String movieID = movies.get(randomInt);
            if(!chosenMovies.contains(movieID)){
                chosenMovies.add(movieID);
            }
        }
        return chosenMovies;
    }
    
    //new function added that gives 20 random movies of "Action" genre
    public ArrayList<String> getActionMovies(){
        ArrayList<String> actionMovies = new ArrayList<String>();
        ArrayList<String> movies = MovieDatabase.filterBy(new GenreFilter("Action"));
        for(int i=0; actionMovies.size()<20; i++){
            Random seed = new Random();
            int randomInt = seed.nextInt(movies.size());
            String movieID = movies.get(randomInt);
            if(!actionMovies.contains(movieID)){
                actionMovies.add(movieID);
            }
        }
        return actionMovies;
    }
    
  //new function added that gives 20 random movies of "Romance" genre
    public ArrayList<String> getRomanceMovies(){
        ArrayList<String> romanceMovies = new ArrayList<String>();
        ArrayList<String> movies = MovieDatabase.filterBy(new GenreFilter("Romance"));
        for(int i=0; romanceMovies.size()<20; i++){
            Random seed = new Random();
            int randomInt = seed.nextInt(movies.size());
            String movieID = movies.get(randomInt);
            if(!romanceMovies.contains(movieID)){
            	romanceMovies.add(movieID);
            }
        }
        return romanceMovies;
    }
    
    //new function added that gives 20 random movies of "Drama" genre
    public ArrayList<String> getDramaMovies(){
        ArrayList<String> dramaMovies = new ArrayList<String>();
        ArrayList<String> movies = MovieDatabase.filterBy(new GenreFilter("Drama"));
        for(int i=0; dramaMovies.size()<20; i++){
            Random seed = new Random();
            int randomInt = seed.nextInt(movies.size());
            String movieID = movies.get(randomInt);
            if(!dramaMovies.contains(movieID)){
            	dramaMovies.add(movieID);
            }
        }
        return dramaMovies;
    }
    
    //new function added that gives 20 random movies of "Horror" genre
    public ArrayList<String> getHorrorMovies(){
        ArrayList<String> horrorMovies = new ArrayList<String>();
        ArrayList<String> movies = MovieDatabase.filterBy(new GenreFilter("Horror"));
        for(int i=0; horrorMovies.size()<20; i++){
            Random seed = new Random();
            int randomInt = seed.nextInt(movies.size());
            String movieID = movies.get(randomInt);
            if(!horrorMovies.contains(movieID)){
            	horrorMovies.add(movieID);
            }
        }
        return horrorMovies;
    }
    
    //new function added that gives 20 random movies of "Documentary" genre
    public ArrayList<String> getDocumentaryMovies(){
        ArrayList<String> documentaryMovies = new ArrayList<String>();
        ArrayList<String> movies = MovieDatabase.filterBy(new GenreFilter("Documentary"));
        for(int i=0; documentaryMovies.size()<20; i++){
            Random seed = new Random();
            int randomInt = seed.nextInt(movies.size());
            String movieID = movies.get(randomInt);
            if(!documentaryMovies.contains(movieID)){
            	documentaryMovies.add(movieID);
            }
        }
        return documentaryMovies;
    }
    
    //new function added that gives 20 random movies which are from the year between 1990 and 1999
    public ArrayList<String> get90sMovies(){
    	ArrayList<String> ninetiesMovies = new ArrayList<String>();
        ArrayList<String> movies = MovieDatabase.filterBy(new YearBetweenFilter(1990,1999));
        for(int i=0; ninetiesMovies.size()<20; i++){
            Random seed = new Random();
            int randomInt = seed.nextInt(movies.size());
            String movieID = movies.get(randomInt);
            if(!ninetiesMovies.contains(movieID)){
            	ninetiesMovies.add(movieID);
            }
        }
        return ninetiesMovies;
    }
    
    //new function added that gives topRated Movies which has average rating above 8.0
    public ArrayList<String> getTopMovies(){
        SecondRatings SRobj = new SecondRatings("data/ratedmoviesfull.csv", "ratings.csv");
        int minimalRaters = 20;
        ArrayList<Rating> avg = SRobj.getAverageRatings(minimalRaters);
        ArrayList<String> topMovies = new ArrayList<String>();
        for(Rating r : avg){
            if(r.getValue()>8.0){
                topMovies.add(r.getItem());
            }
        }
        return topMovies;
    }
    
    public void printRecommendationsFor(String webRaterID){
    	RaterDatabase.initialize("ratings.csv");
        FourthRatings fr = new FourthRatings();
        
        ArrayList<Rating> recommendedMovies = fr.getSimilarRatings(webRaterID,20,5);
        int recommendedMoviesLength = recommendedMovies.size();
        System.out.println("<h2>Welcome to the Recommendation System</h2>");
        if(recommendedMoviesLength == 0){
            System.out.println("<h2> I'm sorry not recommendations at the moment...Try again</h2>");
        }
        else{
            /*ArrayList<String> movieToRate = this.getItemsToRate();
            ArrayList<Rating> outputIDs = new ArrayList<Rating>();*/
            String header = "<table> <tr> <th>Poster</th> <th> Movie Title </th>" +
                            "<th> Rating Value </th> <th> Genres </th>";
            String body= "";
            for(Rating r : recommendedMovies){
                body+= "<tr>" + "<td><img><img src=\""+MovieDatabase.getPoster(r.getItem())+"\" alt\"alternatetext\" style=\"width:104px;height:142px;\"></td>" 
                         + "<td>" + MovieDatabase.getTitle(r.getItem())
                         + "</td> <td>" + Double.toString(r.getValue())
                         + "</td> <td>" + MovieDatabase.getGenres(r.getItem())
                         + "</td> </tr>";
            }
            System.out.println(header + body + "</table>");
        }
    }
    
    //new function added that return an ArrayList of final Recommended movies for the Rater which the user will be from the frontend namely "ADIB"
    public ArrayList<Rating> finalSimilarMoviesRecommended(String webRaterID){
    	FourthRatings fr = new FourthRatings();
        ArrayList<Rating> recommendedMovies = fr.getSimilarRatings(webRaterID,20,5);
        return recommendedMovies;
    }
    
    //new function added that gives all the movies which satisfies all the filters selected from the filter page 
    public ArrayList<String> getFilteredMovies(String[] genres, String minMinutes, String maxMinutes, String minYear, String maxYear, String directors){
    	ArrayList<String> filteredMovies = new ArrayList();
    	int filterStatus = 0;
    	AllFilters af = new AllFilters();
    	if(genres != null) {
    		String genresSelecteD;
    		for(String s : genres) {
    			af.addFilter(new GenreFilter(s));
    		}
    		filterStatus = 1;
    	}
    	if(!(minMinutes.equals("0") && maxMinutes.equals("350"))) {
    		af.addFilter(new MinutesFilter(Integer.parseInt(minMinutes),Integer.parseInt(maxMinutes)));
    		filterStatus = 1;
    	}
    	if(!(minYear.equals("1916") && maxYear.equals("2015"))) {
    		af.addFilter(new YearBetweenFilter(Integer.parseInt(minYear),Integer.parseInt(maxYear)));
    		filterStatus = 1;
    	}
    	if(!directors.equals("")) {
    		af.addFilter(new DirectorFilters(directors));
    		filterStatus = 1;
    	}
    	if(filterStatus == 0) { //no filter is applied then showing all the movies
    		filteredMovies = MovieDatabase.filterBy(new TrueFilter());
    		return filteredMovies;
    	}
    	filteredMovies  = MovieDatabase.filterBy(af);
    	return filteredMovies;
    }
    
    public ArrayList<String> testRunner(){
    	ArrayList<String> list1 = new ArrayList();
    	list1.add("The Vow");
    	list1.add("I'm the Angel of Death: Pusher III");
    	list1.add("Young Adult");
    	list1.add("RED");
    	list1.add("Shaun of the Dead");
    	list1.add("The Thing");
    	return list1;
    }
}
