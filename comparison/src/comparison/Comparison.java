package comparison;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int z;
		
		System.out.print("请输入x的值：");
		x = scan.nextInt();
		
		System.out.print("请输入y的值：");
		y = scan.nextInt();
		
		System.out.print("请输入z的值：");
		z = scan.nextInt();
		
		int max = 0;
		if (x > y)		//else总是和最近的那个if相匹配
						//永远在else和if后面加上一个大括号
		{				//条件嵌套和级联
			if(x > z)
			{
				max = x;
			}
			else
			{
				max = z;
			}
		}
		else
		{
			if(y > z)
			{
				max = y;
			}
			else 
			{
				max = z;
			}
		}
		System.out.println(max);	//单一出口
		scan.close();
}
}