package swicase;

import java.util.Scanner;

public class Swicase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//级联的用法
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		switch ( type )		//括号内只能为整型
		{
		case 1:
			System.out.println("早上好");
			break;
		case 2:
			System.out.println("中午好");
			break;
		case 3:
			System.out.println("晚上好");
			break;
		case 4:
			System.out.println("再见");
			break;
		default:
			System.out.println("啊，什么啊？");
			break;
		}
		in.close();
	}
}
