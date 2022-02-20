package Assignment17feb;

import java.util.Scanner;

public class convertTempToFeherhiet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		float fehrenheit = sc.nextInt();
		float celcius = ((fehrenheit-32)*5)/9;
		System.out.println("Temprerture in celcius is " + celcius);
	}

}
