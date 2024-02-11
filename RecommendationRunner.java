
/**
 * Write a description of RecommendationRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class RecommendationRunner implements Recommender{
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
}
