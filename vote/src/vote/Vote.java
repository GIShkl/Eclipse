package vote;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		int[] numbers = new int[10];
		for(int i=0; i<numbers.length; i++)
		{
			System.out.print(numbers[i]+" ");
		}
		x = in.nextInt();
		while(x != -1)
		{
			if(x >= 0 && x <= 9)
			{
				numbers[x]++;
			}
			x = in.nextInt();
		}
		for(int i = 0; i<numbers.length; i++)
		{
			System.out.println(i+":"+numbers[i]);
		} 
		
	}

}
