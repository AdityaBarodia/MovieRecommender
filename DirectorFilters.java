
/**
 * Write a description of DirectorFilters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class DirectorFilters implements Filter{
    private ArrayList<String> director = new ArrayList<String>();
    
    public DirectorFilters(String directors){
        int index=0;
        while(index<directors.length()){
            int commaIndex = directors.indexOf(",",index);
            if(commaIndex == -1) {
                String tempDir = directors.substring(index,directors.length());
                director.add(tempDir);
                break;
            }
            String tempDir = directors.substring(index,commaIndex);
            director.add(tempDir);
            index=commaIndex+1;
        }
    }
    
    @Override
	public boolean satisfies(String id) {
	    String directors = 	MovieDatabase.getDirector(id);
	    ArrayList<String> movieDirectorsFetched = new ArrayList<String>();
	    int index=0;
            while(index<directors.length()){
                int commaIndex = directors.indexOf(",",index);
                if(commaIndex == -1) {
                    String tempDir = directors.substring(index,directors.length());
                    movieDirectorsFetched.add(tempDir);
                    break;
                }
                String tempDir = directors.substring(index,commaIndex);
                movieDirectorsFetched.add(tempDir);
                index=commaIndex+2;  //, and space
            }   
            for(String dir : movieDirectorsFetched){
                if(director.contains(dir)){
                    return true;
                }
            }
	    return false;
	   }
}
