

/**
 * Write a description of MovieRunnerAverage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MovieRunnerAverage {
    public void printAverageRatings(){
        SecondRatings SRobj = new SecondRatings(/*"ratedmovies_short.csv","ratings_short.csv"*/);
        System.out.println("No. of movies : "+SRobj.getMovieSize());
        System.out.println("No. of ratings : "+SRobj.getRaterSize());
        int minimalRaters = 12;
        ArrayList<Rating> avg = SRobj.getAverageRatings(minimalRaters);
        for(Rating r : avg){
            String title = SRobj.getTitle(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\t"+title);
        }
    }
    
    public void getAverageRatingOneMovie(){
        SecondRatings SRobj = new SecondRatings(/*"ratedmovies_short.csv","ratings_short.csv"*/);
        String movieTitle = "Vacation";
        int minimalRaters = 1;
        double avgRating = 0.0;
        ArrayList<Rating> avg = SRobj.getAverageRatings(minimalRaters);
        for(Rating r : avg){
            String title = SRobj.getTitle(r.getItem());
            if(title.equals(movieTitle)){
                avgRating = r.getValue();
            }
        }
        System.out.println(avgRating+"\t"+movieTitle);
    }
}
