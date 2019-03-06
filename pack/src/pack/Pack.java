package pack;

import java.util.Scanner;

public class Pack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		char[] zimu = new char[25];
		for ( int i = 0; i < zimu.length; i++)
		{
			zimu[i] = (char)(i+'A');
			System.out.print(zimu[i]+" "); 
		}
	}
}
