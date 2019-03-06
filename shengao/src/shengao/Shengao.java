package shengao;

import java.util.Scanner;

public class Shengao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		foot=(int)(30/3.0);		//强制类型转换
//		System.out.println(1.2-1.1);	//浮点数计算是有误差的 ，精确计算用整数
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch=in.nextDouble();
//		System.out.println(10.0/3);	//10和10.0是完全不同的数，10.0是浮点数
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((int)((foot+inch/12)*0.3048*100)+"厘米");	//类型转换
		in.close();
	}

}
