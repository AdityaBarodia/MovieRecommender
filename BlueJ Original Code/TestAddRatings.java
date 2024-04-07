
/**
 * Write a description of TestAddRatings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TestAddRatings {
    public void testFunction(){
        RecommendationRunner r = new RecommendationRunner();
        ArrayList<String> chosenMovies = r.getItemsToRate();
        String newWebRaterID = "ADIB";
        RaterDatabase.initialize("ratings.csv");
        for(String movieID : chosenMovies){
            RaterDatabase.addRaterRating(newWebRaterID,movieID,8);
        }
        r.printRecommendationsFor(newWebRaterID);
    }
}
