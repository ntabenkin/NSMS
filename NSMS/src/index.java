

import java.util.*;

public class index {

	
	public void menu() { 
		
		System.out.println("Welcome to The NSMS only classes available at the moment are location and Sports Definition \n\n"); 
		System.out.println("Location Menu ---- 1");
		System.out.println("Sports Definition Menu ---- 2");
		
	}
	public static void addLocation()
	{

		Scanner scan = new Scanner(System.in);
		Locations[] locations = new Locations[100];
		System.out.println("Location Menu ---- 1");
		System.out.println("Add Location Please Enter/n");
		System.out.println("Location Code: ");
		int code = scan.nextInt();
		System.out.println("Location Name");
		String name = scan.next();
		locations[0] = new Locations(code,name);
		
		System.out.println(locations.toString());
		
		
	}
	
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1: 
		  addLocation();
		  
		break;
		
		case 2: 
			System.out.println("Sports Definition Menu ---- 2");
		break;
		
		default:
			
		}
		
	
		
		
		
		
		
		
		
		
	}
}
