package zifu;

import java.util.Scanner;

public class Zifu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		char c = 'a';
//		char d = (char)(c + 'A'-'a');
//		System.out.println(d);
//		System.out.println("abc\r123");
//		System.out.println(Character.toLowerCase('A'));
//		String s = new String("Hello");	//String的变量是对象的管理者而非所有者
//		System.out.println(s+(12+24));
//		String s;
		String h;
		h = in.next();	//读入一个单词
//		s = in.nextLine();	//读入一整行
//		System.out.println(s);
		System.out.println(h);
		System.out.println(h.equals("bye"));	//比较两个字符串是否相等不能用==，和基础类型不一样
		//==比较的是用一个，equals比较的是相同的东西
	}

}
