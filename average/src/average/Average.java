package average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int count=0;
		int sum=0;
//		number = in.nextInt();
//		while ( number != -1)
//		{
//			sum = sum + number;		//累加
//			count = count + 1;		//计数器
//			number = in.nextInt();
//		}
		do
		{
			number = in.nextInt();
			if ( number != -1)
			{
				sum = sum + number;		//累加
				count = count + 1;
			}
		}while ( number != -1);
		if ( count > 0 )
		{
			System.out.println("平均数="+(double)sum/count);
		}
	}

}
