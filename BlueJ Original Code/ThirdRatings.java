
/**
 * Write a description of ThirdRatings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ThirdRatings {
    private ArrayList<Rater> myRaters;
    
    public ThirdRatings() {
        // default constructor
        this("ratings.csv");
    }
    
    public ThirdRatings(String ratingsfile){
        FirstRatings FRobj = new FirstRatings();
        myRaters = FRobj.loadRaters(ratingsfile);
    }
    
    
    public int getRaterSize(){
        return myRaters.size();
    }
    
    private double getAverageByID(String id, int minimalRaters) {
        double ratings = 0.0;
        int count = 0;
        for(Rater r : myRaters) {
            if(r.getRating(id)!=-1){
                ratings+=r.getRating(id);
                count++;
            }
        }
        if(count<minimalRaters){
            return 0.0;
        }
        else{
            return ratings/count;
        }
    }
    
    public ArrayList<Rating> getAverageRatings(int minimalRaters) {
        ArrayList<String> movies = MovieDatabase.filterBy(new TrueFilter());
        ArrayList<Rating> avg = new ArrayList();
        for(String id : movies){
            double avgRating = getAverageByID(id,minimalRaters);
            if(avgRating == 0.0) {
                continue;
            }
            Rating r = new Rating(id,avgRating);
            avg.add(r);
        }
        return avg;
    }
    
    public ArrayList<Rating> getAverageRatingsByFilter(int minimalRaters,Filter filterCriteria){
        ArrayList<String> movies = MovieDatabase.filterBy(filterCriteria);
        ArrayList<Rating> avg = new ArrayList();
        for(String id : movies){
            double avgRating = getAverageByID(id,minimalRaters);
            if(avgRating == 0.0) {
                continue;
            }
            Rating r = new Rating(id,avgRating);
            avg.add(r);
        }
        return avg;
    }
}
