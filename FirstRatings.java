
/**
 * Write a description of FirstRatings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
import org.apache.commons.csv.*;
public class FirstRatings {
    public ArrayList<Movie> loadMovies(String filename) {
           ArrayList<Movie> output = new ArrayList();
           FileResource fr = new FileResource(/*"data\\"+*/filename);
           CSVParser parser = fr.getCSVParser();
           for (CSVRecord record : parser) {
                Movie m = new Movie(record.get("id"),record.get("title"),record.get("year"),
                                    record.get("genre"),record.get("director"),record.get("country"),
                                    record.get("poster"),Integer.parseInt(record.get("minutes")));
                output.add(m);                    
            }
           return output; 
    }
    
    public void testloadMovies() {
           //FileResource f = new FileResource("ratedmovies_short.csv");
           ArrayList<Movie> data = new ArrayList();
           data=loadMovies("ratedmoviesfull.csv");
           HashMap<String,Integer> directedCount = new HashMap<String,Integer>();
           int max=0;
           int genreCount=0;
           int minLength=0;
           for(int i=0; i<data.size(); i++) {
               //System.out.println(data.get(i));
               if(data.get(i).getGenres().contains("Comedy")) {
                   genreCount++;
               }
               if(data.get(i).getMinutes()>150) {
                   minLength++;  
                }
               if(directedCount.containsKey(data.get(i).getDirector())) {
                   directedCount.put(data.get(i).getDirector(),directedCount.get(data.get(i).getDirector())+1);  
               }
               else {
                   directedCount.put(data.get(i).getDirector(),1);   
                }
            }   
           System.out.println("No. of movies "+data.size());
           System.out.println("Comedy Count "+genreCount); 
           System.out.println("Length>150 Count "+minLength);
           for(Map.Entry<String,Integer> entry: directedCount.entrySet()) {
               if(entry.getValue() > max) {
                   max = entry.getValue();
                }
            }
           System.out.println("Directors:"+max);
           
           for(Map.Entry<String,Integer> entry: directedCount.entrySet()) {
               if(entry.getValue() == max) {
                   System.out.println(""+entry);
                }
            }
        }
        
        
    public ArrayList<Rater> loadRaters(String filename) {
        FileResource fr = new FileResource("data\\"+filename);
        CSVParser raterparser = fr.getCSVParser();
        ArrayList<Rater> ratingList = new ArrayList(); 
        for(CSVRecord recRater : raterparser){
            String raterId =recRater.get("rater_id");
            String movieId = recRater.get("movie_id");
            double rating = Double.parseDouble(recRater.get("rating"));
            if(ratingList.size()==0) {
                Rater rater = new EfficientRater(raterId);
                rater.addRating(movieId,rating);
                ratingList.add(rater);
                continue;
            }
            int contains=0;
            for(int i=0; i<ratingList.size(); i++) {
                if(ratingList.get(i).getID().equals(raterId)){
                    ratingList.get(i).addRating(movieId,rating);  
                    contains=1;
                }
            }
            if(contains==0) {
                 Rater rater = new PlainRater(raterId);
                 rater.addRating(movieId,rating);
                 ratingList.add(rater);  
            }
        }
        return ratingList;
       }
      
    
    public void testLoadRaters() {
           ArrayList<Rater> data = new ArrayList();
           data=loadRaters("ratings.csv");
           System.out.println("No. of raters "+data.size());
           for(int i=0; i<data.size(); i++) {
               System.out.println("RaterId: "+data.get(i).getID()+ ", No. of ratings: "+data.get(i).numRatings());
               ArrayList<String> list = new ArrayList<String>();
               list = data.get(i).getItemsRated();
               for(int j=0; j<list.size(); j++) {
                   System.out.println(list.get(j) + " "+data.get(i).getRating(list.get(j)));   
                }
            }
           
           int rater_id=193;
           int max=0;
           for(int i=0; i<data.size(); i++) {
               if(Integer.parseInt(data.get(i).getID())==rater_id) {
                  System.out.println("Number of ratings by raterId: "+rater_id+" is "+data.get(i).numRatings());  
                }
               if(data.get(i).numRatings()>max) {
                  max = data.get(i).numRatings();  
                } 
            }
           int raterCount=0;
           String movie_id="1798709";
           int ratingCount=0;
           ArrayList<String> uniqueMovies = new ArrayList();
           for(int i=0; i<data.size(); i++) {
               if(data.get(i).numRatings()==max) {
                   raterCount++;
                   System.out.println("Rater with max no of ratings: "+data.get(i).getID()+" count: "+max);
                }
               if(data.get(i).hasRating(movie_id)){
                   ratingCount++;
                }
               
               ArrayList<String> ratings = new ArrayList();
               ratings = data.get(i).getItemsRated();
               for(int j=0; j<ratings.size(); j++){
                   if(!uniqueMovies.contains(ratings.get(j))) {
                       uniqueMovies.add(ratings.get(j));
                   }
                }
            }
           System.out.println("No of raters with max numRatings "+raterCount);
           System.out.println("No of ratings for movie: "+movie_id+" is "+ratingCount);
           System.out.println("No of unique movies rated: "+uniqueMovies.size());
    }
}
