import java.util.HashMap;

public class ParkingArea {

	
	 final static int maxCarSlots=300;
	    final static int maxBikeSlots=200;

	   

	  
	    int  BikeSlots(HashMap<Integer,Vechile> hm)
	    {
	        int noOfBikes=0;
	        for (Vechile v : hm.values()) 
	        {
	           if(v.name.equals("bike"))
	                noOfBikes++;
	        }
	        return noOfBikes;
	    }

	    int CarSlots(HashMap<Integer,Vechile> hm)
	    {
	        int noOfCars=0;
	        for (Vechile v : hm.values()) 
	        {
	           if(v.name.equals("car"))
	                noOfCars++;
	        }
	        return noOfCars;
	    }

	    int vacantFreeSlots(HashMap<Integer,Vechile> hm)
	    {
	        int current=hm.size();
	        return maxBikeSlots+maxCarSlots-current;
	    }


}
