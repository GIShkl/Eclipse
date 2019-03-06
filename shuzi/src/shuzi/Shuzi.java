package shuzi;

import java.util.Scanner;

public class Shuzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
//		while( number > 0 )		//条件满足就执行循环，条件不满足就跳过
//		{						//循环体，循环体内要有改变条件的机会
//			number = number / 10;
//			count = count + 1;
//			System.out.println("number="+number+";"+"count="+count);
//		}
		do
		{						//循环体，循环体内要有改变条件的机会
			number = number / 10;
			count = count + 1;
			System.out.println("number="+number+";"+"count="+count);
		}while( number > 0 );	//do-while循环，执行完一轮循环再来检查条件是否满足		
		System.out.println(count);
		in.close();
	}

}
