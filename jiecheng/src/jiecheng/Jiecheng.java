package jiecheng;

import java.util.Scanner;

public class Jiecheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		int i = 1;
		int factor = 1;
//		while(i <= n)
//		{
//			factor = factor*i;
//			i = i + 1;
//		}
		for( int i=1; i<=n; i=i+1)	//for( 初始化; 条件(先验); 单步动作){}
									//for中的每一个表达式都是可以省略的，但;不可省
									//for(;条件;) == while(条件)
		{
			System.out.println(i);
			factor = factor*i;
		}
		System.out.println(factor);
	}
	/*Tips for loops
	 * 如果有固定次数，用for
	 * 如果必须执行一次，用do-while
	 * 其他情况用while                                      
	 */

}
