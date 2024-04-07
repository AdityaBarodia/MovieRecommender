
package MyPackage;
/**

 * Write a description of SecondRatings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class SecondRatings {
    private ArrayList<Movie> myMovies;
    private ArrayList<Rater> myRaters;
    
    public SecondRatings() {
        // default constructor
        this("ratedmoviesfull.csv", "ratings.csv");
    }
    
    public SecondRatings(String moviefile, String ratingsfile){
        FirstRatings FRobj = new FirstRatings();
        myMovies = FRobj.loadMovies(moviefile);
        myRaters = FRobj.loadRaters(ratingsfile);
    }
    
    public int getMovieSize(){
        return myMovies.size();   
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
        ArrayList<Rating> avg = new ArrayList();
        for(Movie m : myMovies){
            double avgRating = getAverageByID(m.getID(),minimalRaters);
            if(avgRating == 0.0) {
                continue;
            }
            Rating r = new Rating(m.getID(),avgRating);
            avg.add(r);
        }
        return avg;
    }
    
    public String getTitle(String id){
        for(Movie m : myMovies){
            if(m.getID().equals(id)){
                return m.getTitle();
            }
        }
        return "ID was not found";
    }
    
    public String getID(String title){
        for(Movie m : myMovies) {
            if(m.getTitle().equals(title)){
                return m.getID();
            }
        }
        return "NO SUCH TITLE";
    }
}
