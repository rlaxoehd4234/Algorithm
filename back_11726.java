package 다이나믹프로그래밍;

import java.util.Scanner;

public class back_11726 {
	
	static int [] d = new int[1001];
	
	static int dp(int n) {
		
		if( n == 1) return 1;
		if( n == 2) return 2;
		if(d[n] != 0) return d[n];
		return d[n] = (dp(n - 1) + dp(n-2)) % 10007;
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(dp(n));

	}

}
