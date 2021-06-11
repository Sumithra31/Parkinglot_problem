
public class Vechile {

	
	 int Id=0;
	    String name="";
	    int noOfHours;
	    Boolean hasMovieTicket=false;

	    Vechile(String name, int ID)
	    {
	        this.Id=ID;
	        this.name=name;
	        
	    }
	   
	    public void setMovies(Boolean hasMovieTicket) {
	    	this.hasMovieTicket=hasMovieTicket;
	    }
		public void setHours(int noOfHours2) {
			// TODO Auto-generated method stub
			this.noOfHours=noOfHours2;
			
		}
		public int getID() {
			return Id;
		}
}
