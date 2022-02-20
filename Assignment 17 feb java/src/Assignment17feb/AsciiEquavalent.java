package Assignment17feb;

import java.util.Scanner;

public class AsciiEquavalent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		int res =ch+3;
		ch=(char) res;
		
		System.out.println(ch);
		
		

	}

}
