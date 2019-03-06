package caizi;

import java.util.Scanner;

public class Caizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = (int)Math.random()*100+1; //产生[0,1)的随机数-->[0,100)-->[1,100]
		int a;
		int count = 0;
		do
		{
			a = in.nextInt();
			count = count + 1;
			if ( a > number)
			{
				System.out.println("偏大");
			}
			else if( a < number)
			{
				System.out.println("偏小");
			}
		}while( a != number);
		System.out.println("恭喜你猜对了，你猜了"+count+"次");
	}

}
