package zsfjie;

import java.util.Scanner;

public class Zsfjie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		System.out.println(3%10);
		int number;
		number = in.nextInt();
		int result = 0;
		do
		{
			int digit = number % 10;
			result = result*10 + digit;
			System.out.print(digit);
			number = number / 10;
		}while( number > 0);
		System.out.println();
		System.out.println(result); 
	}

}
