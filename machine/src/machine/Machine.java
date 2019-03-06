package machine;

import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			初始化
//		double	a=1.0;
//		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;		//浮点计算有误差
//		System.out.println(b);
////		System.out.println(a==b);
//		System.out.println(Math.abs(a-b)<1e-6);  	//两个浮点数比较用差值
		Scanner in = new Scanner(System.in);
		int balance = 0;
		while(true)
		{
		//			读入投币金额
				System.out.print("请投币：");
				int amount = in.nextInt();
		//		System.out.println(amount);
		//		System.out.println(amount>=10);		//比较
				balance = balance + amount;
				if ( balance >= 10 )
				{
			//			打印车票
					System.out.println("***************");
					System.out.println("*Java城际铁路专线*");
					System.out.println("* 无指定座位票 *");
					System.out.println("*  票价 10元  *");
					System.out.println("**************");
			//			计算并打印找零
					System.out.println("找零："+(balance-10));
					balance = 0;
				}
			}
		}

}
