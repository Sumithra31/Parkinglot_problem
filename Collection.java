import java.util.HashMap;

public class Collection  {

	 final static float bikeCost=20;
	    final static float carCost=40;
	    final static float discount=(float)10/100;


	    static float bikeCollection=0;
	    static float carCollection=0;
	    float price=0;

	    HashMap<Integer,Vechile>list_v;

	    void p()
	    {
	        
	    }

	    public float Fee(HashMap<Integer,Vechile> list_v,int ID)
	    {
	    	

	    	
	    	this.list_v=list_v;
	        for (Vechile v : list_v.values()) {
	            if(v.Id==ID) 
	            {
	    	       

	            if(v.name.equals("bike"))
	            {
	    	        System.out.println(v.name+v.noOfHours+v.Id+v.hasMovieTicket);

	    	        price=bikeCost*v.noOfHours;
	                bikeCollection+=bikeCost*v.noOfHours;
	                if(v.hasMovieTicket==true)
	                {
		    	        price=price-discount*bikeCost*v.noOfHours;

	                    bikeCollection=bikeCollection-discount*bikeCost*v.noOfHours;
	                 }
	                return price;
	            }
	            else
	            {
	    	        price=carCost*v.noOfHours;

	            	 carCollection+=carCost*v.noOfHours;
		                if(v.hasMovieTicket==true)
		                {
			    	        price=price-discount*carCost*v.noOfHours;

		                    carCollection=carCollection-discount*carCost*v.noOfHours;
		                }
		                return price;

	            }
	            
	            
	            
	            }
	            
	        }
			return 0;
	       
	    }


	    float totalCollection()
	    {
	    	System.out.println(bikeCollection+carCollection);
	        return bikeCollection+carCollection;
	    }

}
