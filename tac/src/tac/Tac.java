package tac;

import java.util.Scanner;

public class Tac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int Size = 3;
		int[][] board = new int[Size][Size];
		boolean gotResult = false;
		int num0fx = 0;
		int num0fo = 0;
		
		//读入矩阵
		for(int i = 0; i<board.length; i++)
		{
			for (int j = 0; j<board[i].length; j++)
			{
				board[i][j] = in.nextInt();
				System.out.println(board[i][j]+" ");
			}
			
			
		}
		
		//检查行
		
	}

}
