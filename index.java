import java.util.HashMap;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
	       ParkingArea p=new ParkingArea();
	       Collection c=new Collection();
	       
	        HashMap<Integer,Vechile>hm=new HashMap<Integer,Vechile>();


	       int ch=0;

	       do{
	            System.out.println("Enter the choice");
	            System.out.println("1. Add Vechile");
	            System.out.println("2. Remove Vechile");
	            System.out.println("3. See total occupied bike slots");
	            System.out.println("4. See total occupied car slots");
	            System.out.println("5. See vacant slots");
	            System.out.println("6. See bike collection");
	            System.out.println("7. See car collection");
	            System.out.println("8. See total collection");
	            System.out.println("9. Exit");
	             ch=sc.nextInt();

	            switch(ch)
	            {
	                case 1: {
	                	
	                         System.out.println("Enter name of vechile");
	                         String name=sc.next();

	                         System.out.println("Enter ID of vechile");
	                         int ID=sc.nextInt();

	                        

	                         Vechile v=new Vechile(name,ID);

	                         hm.put(ID, v);

	                         //p.VechileEntered(name,ID,hasMovieTicket,noOfHours);

	                         break;
	                         
	                }
	                case 2:{

	                            System.out.println("Enter ID of vechile");
	                           
	                            int ID=sc.nextInt();
	                            
	                            System.out.println(("Enter if vechile has a movie ticket"));
		                         Boolean hasMovieTicket=sc.nextBoolean();
		                         
		                         System.out.println("Enter no. of hours for parking");
		                         int noOfHours=sc.nextInt();
		                         Vechile v= hm.get(ID);
		                         Vechile v1=new Vechile(v.name,v.Id);
		                         System.out.println(v.Id+v.name);

		                         v1.setHours(noOfHours);
		                         v1.setMovies(hasMovieTicket);
		                         hm.put(ID, v1);
		                         System.out.println(c.Fee(hm,ID));
		                         hm.remove(ID);
	                            
	                            break;

	                        
	                }
	               case 3:{
	                   System.out.println("total occupied bike slots = "+p.BikeSlots(hm));
	                   break;
	               }

	               case 4: {
	                System.out.println("total occupied car slots = "+p.CarSlots(hm));
	                break;
	               }
	               case 5:{
	                   System.out.println("total vacant slots = "+p.vacantFreeSlots(hm));
	                   break;
	               }
	               case 6:{
	                  // System.out.println("" + c.bikeFee(hm));
	                   break;
	               }
	               case 7:{
	                  // System.out.println("total car collection" + c.carFee());
	                   break;
	               }
	               case 8:{
	                   System.out.println(("total collection " + c.totalCollection()));
	                   break;
	               }
	               case 9:{
	                   System.exit(0);
	               }
	                default:{
	                    System.out.println("wrong i/p");
	                    break;
	                }
	            }
	       }while(ch!=10);
	      

	 



	       sc.close();
	}

}
