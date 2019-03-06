package search;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x= in.nextInt();
		int[] data = {3,5,7,10,11};
		boolean isExist = false;
		int loc = -1;
		for(int i = 0; i<data.length; i++)
		{
			if(x == data[i])
			{
				loc = i;
				break;
			}
		}
		for(int k : data)	//for-each循环，对数组进行遍历
		{
			if(k == x)
			{
				isExist = true;
				break;
			}
		}
		if (loc > -1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System.out.println(x+"不在其中");
		}
		System.out.println(isExist);
	}
}
