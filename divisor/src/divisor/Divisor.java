package divisor;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//辗转相除法计算最大公约数
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int oa = a;
		int ob = b;
		while(b != 0)
		{
			int r;
			r = a%b;
			System.out.println(a+","+b+","+r);
			a = b;
			b = r;
		}
		System.out.println(oa+"和"+ob+"的最大公约数是"+a);
	}

}
