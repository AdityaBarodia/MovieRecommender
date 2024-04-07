package MyPackage;


/**
 * Write a description of Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Test {
   public static void main(String[] args){
      RecommendationRunner r = new RecommendationRunner();
      ArrayList<String> chosenMovies = r.getItemsToRate();
      for(String key : chosenMovies){
          System.out.println(MovieDatabase.getTitle(key));
        }
       r.printRecommendationsFor("65");
    }
}
