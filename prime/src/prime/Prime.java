package prime;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		ou:		//标号 -->break ou
		for (int n=2; n<100; n++)	//多重循环
		{
			boolean isPrime = true;
			for ( int i = 2; i<n; i++)
			{
				if (n % i == 0)
				{
					isPrime = false;
//					System.out.println(n+"不是素数,i="+i);
					break;	//跳出循环
				}
			}
			if( isPrime )
			{
				System.out.print(n+" ");
			}
			else
			{
//				System.out.println(n+"不是素数");
			}
		}
	}

}
