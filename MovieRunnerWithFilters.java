
/**
 * Write a description of MovieRunnerWithFilters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MovieRunnerWithFilters {
    public void printAverageRatings(){
        ThirdRatings TRobj = new ThirdRatings("ratings.csv");
        System.out.println("No. of ratings : "+TRobj.getRaterSize());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 35;
        ArrayList<Rating> avg = TRobj.getAverageRatings(minimalRaters);
        Collections.sort(avg);
        System.out.println("No. of movies with avg raters > minimal Raters : "+avg.size());
        for(Rating r : avg){
            String title = MovieDatabase.getTitle(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\t"+title);
        }
    }
    
    public void printAverageRatingsByYearsAfter(){
        ThirdRatings TRobj = new ThirdRatings("ratings.csv");
        System.out.println("No. of ratings : "+TRobj.getRaterSize());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 20;
        YearAfterFilter yf = new YearAfterFilter(2000);
        ArrayList<Rating> avg = TRobj.getAverageRatingsByFilter(minimalRaters,yf);
        Collections.sort(avg);
        System.out.println("No. of movies with avg raters > minimal Raters : "+avg.size());
        for(Rating r : avg){
            String title = MovieDatabase.getTitle(r.getItem());
            int year = MovieDatabase.getYear(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\t"+year+"\t"+title);
        }
    }
    
    public void printAverageRatingsByGenre(){
        ThirdRatings TRobj = new ThirdRatings("ratings.csv");
        System.out.println("No. of ratings : "+TRobj.getRaterSize());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 20;
        GenreFilter gf = new GenreFilter("Comedy");
        ArrayList<Rating> avg = TRobj.getAverageRatingsByFilter(minimalRaters,gf);
        Collections.sort(avg);
        System.out.println("No. of movies with avg raters > minimal Raters : "+avg.size());
        for(Rating r : avg){
            String title = MovieDatabase.getTitle(r.getItem());
            String genre = MovieDatabase.getGenres(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\t"+title);
            System.out.println("\t"+genre);
        }
    }
    
    public void printAverageRatingsByMinutes(){
        ThirdRatings TRobj = new ThirdRatings("ratings.csv");
        System.out.println("No. of ratings : "+TRobj.getRaterSize());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 5;
        MinutesFilter mf = new MinutesFilter(105,135);
        ArrayList<Rating> avg = TRobj.getAverageRatingsByFilter(minimalRaters,mf);
        Collections.sort(avg);
        System.out.println("No. of movies with avg raters > minimal Raters : "+avg.size());
        for(Rating r : avg){
            String title = MovieDatabase.getTitle(r.getItem());
            int minutes = MovieDatabase.getMinutes(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\tTime: "+minutes+"\t"+title);
        }
    }
    
    public void printAverageRatingsByDirectors(){
        ThirdRatings TRobj = new ThirdRatings("ratings.csv");
        System.out.println("No. of ratings : "+TRobj.getRaterSize());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 4;
        String directors = "Clint Eastwood,Joel Coen,Martin Scorsese,Roman Polanski,Nora Ephron,Ridley Scott,Sydney Pollack";
        DirectorFilters df = new DirectorFilters(directors);
        ArrayList<Rating> avg = TRobj.getAverageRatingsByFilter(minimalRaters,df);
        Collections.sort(avg);
        System.out.println("No. of movies with avg raters > minimal Raters : "+avg.size());
        for(Rating r : avg){
            String title = MovieDatabase.getTitle(r.getItem());
            String director = MovieDatabase.getDirector(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\t"+title);
            System.out.println("\t"+director);
        }
    }
    
    public void printAverageRatingsByYearAfterAndGenre(){
        ThirdRatings TRobj = new ThirdRatings("ratings.csv");
        System.out.println("No. of ratings : "+TRobj.getRaterSize());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 8;
        AllFilters af = new AllFilters();
        af.addFilter(new YearAfterFilter(1990));
        af.addFilter(new GenreFilter("Drama"));
        ArrayList<Rating> avg = TRobj.getAverageRatingsByFilter(minimalRaters,af);
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
    
    public void printAverageRatingsByDirectorsAndMinutes(){
        ThirdRatings TRobj = new ThirdRatings("ratings.csv");
        System.out.println("No. of ratings : "+TRobj.getRaterSize());
        MovieDatabase.initialize("ratedmoviesfull.csv");
        System.out.println("No. of movies : "+MovieDatabase.size());
        int minimalRaters = 3;
        AllFilters af = new AllFilters();
        af.addFilter(new MinutesFilter(90,180));
        String directors = "Clint Eastwood,Joel Coen,Tim Burton,Ron Howard,Nora Ephron,Sydney Pollack";
        af.addFilter(new DirectorFilters(directors));
        ArrayList<Rating> avg = TRobj.getAverageRatingsByFilter(minimalRaters,af);
        Collections.sort(avg);
        System.out.println("No. of movies with avg raters > minimal Raters : "+avg.size());
        for(Rating r : avg){
            String title = MovieDatabase.getTitle(r.getItem());
            int minutes = MovieDatabase.getMinutes(r.getItem());
            String director = MovieDatabase.getDirector(r.getItem());
            double avgRating = r.getValue();
            System.out.println(avgRating+"\tTime: "+minutes+"\t"+title);
            System.out.println("\t"+director);
        }
    }
}
