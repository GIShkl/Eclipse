package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你好");
		Scanner in  = new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
//		System.out.println(2+3+"=2+3="+(2+3));
		int amount=100;	//常量
		int price=0;	//定义变量,初始化
//		System.out.println(price);
		System.out.print("请输入票面：");
		amount = in.nextInt();
		System.out.print("请输入金额：");
		price = in.nextInt();	//赋值，表达式
		System.out.println(amount+"-"+price+"="+(amount-price));
		in.close();
	}

}
