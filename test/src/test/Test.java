package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean[] isPrimes = new boolean[100];
		for (int i = 0; i<isPrimes.length; i++)
		{
			isPrimes[i] = true;
		}
		for (int i = 2; i < isPrimes.length; i++)
		{
			if(isPrimes[i])
			{
				for( int k = 2; i*k<isPrimes.length; k++)
				{
					isPrimes[i*k] = false;
				}
			}
		}
		for(int i = 2; i<isPrimes.length; i++)
		{
			if(isPrimes[i])
			{
				System.out.print(i+" ");
			}
		}
//		int[] primes = new int[50];
//		primes[0] = 2;
//		int cnt = 1;
//		Main_loop:
//		for(int x = 3; cnt < 50; x++)
//		{
//			for (int i = 0; i < cnt; i++)	//已知的素数
//			{
//				if (x % primes[i] == 0)
//				{
//					continue Main_loop;
//				}
//			}
//			primes[cnt++] = x;
//		}
//		for (int k:primes)
//		{
//			System.out.print(k+" ");
//		}
	}

}
