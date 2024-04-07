package MyPackage;
/**
 * Write a description of ForthRatings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class FourthRatings {
    
    private double getAverageByID(String id, int minimalRaters) {
        ArrayList <Rater> myRaters = new ArrayList<Rater>();
        myRaters = RaterDatabase.getRaters();
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
    
    private double dotProduct(Rater me, Rater r) {
        //MovieDatabase.initialize("ratedmoviesfull.csv");
        ArrayList<String> movies = MovieDatabase.filterBy(new TrueFilter());
        double dotProduct = 0.0;
        for(String id : movies){
            if(me.hasRating(id) && r.hasRating(id)){
                dotProduct+=(me.getRating(id)-5)*(r.getRating(id)-5);
            }
        }
        return dotProduct;
    }
    
    public ArrayList<Rating> getSimilarities(String id){
        ArrayList<Rating> similarRaters = new ArrayList<Rating>();
        //RaterDatabase.initialize("ratings.csv");
        Rater me = RaterDatabase.getRater(id);
        ArrayList<Rater> raters = RaterDatabase.getRaters();
        for(Rater r : raters){
            if(r.getID().equals(id)){    
                continue;
            }
            double dotProductReturn = dotProduct(me,r);
            if(dotProductReturn < 0){
                continue;
            }
            Rating ratingObj = new Rating(r.getID(),dotProductReturn);
            similarRaters.add(ratingObj);
        }
        Collections.sort(similarRaters,Collections.reverseOrder());
        return similarRaters;
    }
    
    public ArrayList<Rating> getSimilarRatings(String id, int numSimilarRaters, int minimalRaters){
        ArrayList<Rating> similarRatingsOfMovie = new ArrayList<Rating>();
        ArrayList<Rating> similarRaters = getSimilarities(id);  //raterID And Similarity
        //Rater me = RaterDatabase.getRater(id);
        ArrayList<String> movies = MovieDatabase.filterBy(new TrueFilter());
        for(String movieID : movies){
            int count = 0;
            double weightedRatings = 0.0;
            for(int i=0; i<numSimilarRaters; i++){
                Rating r = similarRaters.get(i);
                String raterID = r.getItem();
                double similarity = r.getValue();
                Rater raterObj = RaterDatabase.getRater(raterID);
                if(raterObj.hasRating(movieID)){
                    double movieRating = raterObj.getRating(movieID);
                    weightedRatings+=(movieRating*similarity);
                    count++;
                }
            }
            if(count>=minimalRaters){
                 double weightedAverageRatings = weightedRatings/count;
                 Rating movieRatingObj = new Rating(movieID,weightedAverageRatings);
                 similarRatingsOfMovie.add(movieRatingObj);
            }
        }
        Collections.sort(similarRatingsOfMovie,Collections.reverseOrder());
        return similarRatingsOfMovie;
    }
    
    public ArrayList<Rating> getSimilarRatingsByFilter(String id, int numSimilarRaters, int minimalRaters, Filter filterCriteria){
        ArrayList<Rating> similarRatingsOfMovie = new ArrayList<Rating>();
        ArrayList<Rating> similarRaters = getSimilarities(id);  //raterID And Similarity
        Rater me = RaterDatabase.getRater(id);
        ArrayList<String> movies = MovieDatabase.filterBy(filterCriteria);
        for(String movieID : movies){
            int count = 0;
            double weightedRatings = 0.0;
            for(int i=0; i<numSimilarRaters; i++){
                Rating r = similarRaters.get(i);
                String raterID = r.getItem();
                double similarity = r.getValue();
                Rater raterObj = RaterDatabase.getRater(raterID);
                if(raterObj.hasRating(movieID)){
                    double movieRating = raterObj.getRating(movieID);
                    weightedRatings+=(movieRating*similarity);
                    count++;
                }
            }
            if(count >= minimalRaters){
                 double weightedAverageRatings = weightedRatings/count;
                 Rating movieRatingObj = new Rating(movieID,weightedAverageRatings);
                 similarRatingsOfMovie.add(movieRatingObj);
            }
        }
        Collections.sort(similarRatingsOfMovie,Collections.reverseOrder());
        return similarRatingsOfMovie;
    }
}
