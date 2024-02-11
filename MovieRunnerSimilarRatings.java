
/**
 * Write a description of MovieRunnerSimilarRatings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MovieRunnerSimilarRatings {
    public void printAverageRatings(){
        FourthRatings FRobj = new FourthRatings();
        RaterDatabase.initialize("ratings.csv");
        System.out.println("No. of ratings : "+RaterDatabase.size());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 35;
        ArrayList<Rating> avg = FRobj.getAverageRatings(minimalRaters);
        Collections.sort(avg);
        System.out.println("No. of movies with avg raters > minimal Raters : "+avg.size());
        for(Rating r : avg){
            String title = MovieDatabase.getTitle(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\t"+title);
        }
    }
    
    public void printAverageRatingsByYearAfterAndGenre(){
        FourthRatings FRobj = new FourthRatings();
        RaterDatabase.initialize("ratings.csv");
        System.out.println("No. of ratings : "+RaterDatabase.size());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 8;
        AllFilters af = new AllFilters();
        af.addFilter(new YearAfterFilter(1990));
        af.addFilter(new GenreFilter("Drama"));
        ArrayList<Rating> avg = FRobj.getAverageRatingsByFilter(minimalRaters,af);
        Collections.sort(avg);
        System.out.println("No. of movies with avg raters > minimal Raters : "+avg.size());
        for(Rating r : avg){
            String title = MovieDatabase.getTitle(r.getItem());
            int year = MovieDatabase.getYear(r.getItem());
            String genre = MovieDatabase.getGenres(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\t"+year+"\t"+title);
            System.out.println("\t"+genre);
        }
    }
    
    public void printSimilarRatings(){
        FourthRatings FRobj = new FourthRatings();
        RaterDatabase.initialize("ratings.csv");
        /*System.out.println("No. of ratings : "+RaterDatabase.size());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());*/
        String id = "71";
        int numSimilarRaters = 20;
        int minimalRaters = 5;
        ArrayList<Rating> similarRatingsOfMovie = FRobj.getSimilarRatings(id,numSimilarRaters,minimalRaters);
        for(Rating r : similarRatingsOfMovie){
            String title = MovieDatabase.getTitle(r.getItem());
            double similarity = r.getValue();
            System.out.println(title+"\t"+similarity);
        }
    }
    
    public void printSimilarRatingsByGenre(){
        FourthRatings FRobj = new FourthRatings();
        RaterDatabase.initialize("ratings.csv");
        System.out.println("No. of ratings : "+RaterDatabase.size());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        String id = "964";
        int numSimilarRaters = 20;
        int minimalRaters = 5;
        String genre = "Mystery";
        GenreFilter gf = new GenreFilter(genre);
        ArrayList<Rating> similarRatingsOfMovie = FRobj.getSimilarRatingsByFilter(id,numSimilarRaters,minimalRaters,gf);
        for(Rating r : similarRatingsOfMovie){
            String title = MovieDatabase.getTitle(r.getItem());
            double similarity = r.getValue();
            System.out.println(title+"\t"+similarity);
        }
    }
    
    public void printSimilarRatingsByDirector(){
        FourthRatings FRobj = new FourthRatings();
        RaterDatabase.initialize("ratings.csv");
        System.out.println("No. of ratings : "+RaterDatabase.size());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        String id = "120";
        int numSimilarRaters = 10;
        int minimalRaters = 2;
        String directors = "Clint Eastwood,J.J. Abrams,Alfred Hitchcock,Sydney Pollack,David Cronenberg,Oliver Stone,Mike Leigh";
        DirectorFilters df = new DirectorFilters(directors);
        ArrayList<Rating> similarRatingsOfMovie = FRobj.getSimilarRatingsByFilter(id,numSimilarRaters,minimalRaters,df);
        for(Rating r : similarRatingsOfMovie){
            String title = MovieDatabase.getTitle(r.getItem());
            double similarity = r.getValue();
            System.out.println(title+"\t"+similarity);
        }
    }
    
    public void printSimilarRatingsByGenreAndMinutes(){
        FourthRatings FRobj = new FourthRatings();
        RaterDatabase.initialize("ratings.csv");
        System.out.println("No. of ratings : "+RaterDatabase.size());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        String id = "168";
        int numSimilarRaters = 10;
        int minimalRaters = 3;
        String genre = "Drama";
        GenreFilter gf = new GenreFilter(genre);
        MinutesFilter mf = new MinutesFilter(80,160);
        AllFilters af = new AllFilters();
        af.addFilter(gf);
        af.addFilter(mf);
        ArrayList<Rating> similarRatingsOfMovie = FRobj.getSimilarRatingsByFilter(id,numSimilarRaters,minimalRaters,af);
        for(Rating r : similarRatingsOfMovie){
            String title = MovieDatabase.getTitle(r.getItem());
            double similarity = r.getValue();
            System.out.println(title+"\t"+similarity);
        }
    }
    
    public void printSimilarRatingsYearAfterAndMinutes(){
        FourthRatings FRobj = new FourthRatings();
        RaterDatabase.initialize("ratings.csv");
        System.out.println("No. of ratings : "+RaterDatabase.size());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        String id = "314";
        int numSimilarRaters = 10;
        int minimalRaters = 5;
        YearAfterFilter yf = new YearAfterFilter(1975);
        MinutesFilter mf = new MinutesFilter(70,200);
        AllFilters af = new AllFilters();
        af.addFilter(yf);
        af.addFilter(mf);
        ArrayList<Rating> similarRatingsOfMovie = FRobj.getSimilarRatingsByFilter(id,numSimilarRaters,minimalRaters,af);
        for(Rating r : similarRatingsOfMovie){
            String title = MovieDatabase.getTitle(r.getItem());
            double similarity = r.getValue();
            System.out.println(title+"\t"+similarity);
        }
    }
}
