package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double sum = 0;
		int cnt = in.nextInt();
		if(cnt > 0)
		{
			int[] numbers = new int[cnt];
			for(int i = 0; i<cnt; i++)
			{
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			double aver = sum/cnt;
			System.out.println(aver);
			for (int i = 0; i<numbers.length; i++)
			{
				if(numbers[i]>aver)
				{
					System.out.println(numbers[i]);
				}
			}
		}
	}
}
