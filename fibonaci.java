package 다이나믹프로그래밍;

import java.util.Scanner;

public class fibonaci {
	
	static int [] d = new int [100];
	
	public static int dp(int x) {
		
		if(x == 1) return 1;
		if(x == 2) return 1;
		if( d[x] != 0  ) return d[x];
		return d[x] = dp(x -1) + dp ( x - 2);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int n = sc.nextInt();
		
		System.out.println( dp(n));
		
	}

}
