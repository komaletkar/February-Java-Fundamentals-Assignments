package Assignment17feb;

import java.util.Scanner;

public class convert_days_to_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour");
		
	    float	hour = sc.nextFloat();
		float days = (hour/24);
		System.out.println("The days is " +  days);
		double year =  (hour/8760);
		System.out.println("The year is " + year);

	}

}
