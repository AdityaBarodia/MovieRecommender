package MyPackage;

public class YearBetweenFilter implements Filter{
	//new variables for applying filters in this range
		private int startYear, endYear;
	
		public YearBetweenFilter(int startYear, int endYear) {
			this.endYear = endYear;
			this.startYear = startYear;
		}
		
		//new function added that filters movies which are from the time between startYear and endYear
		@Override
		public boolean satisfies(String id) {
			return (MovieDatabase.getYear(id) >= startYear && MovieDatabase.getYear(id) <= endYear);
		}
		
}
