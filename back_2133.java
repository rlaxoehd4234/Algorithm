package 다이나믹프로그래밍;

import java.util.Scanner;

public class back_2133 {
	static int [] d = new int[1001];
	
	
	static int dp(int n) {
		
		if(n == 0) return 1;
		if(n == 1) return 0;
		if(n == 2) return 3;
		
		if(d[n] != 0) return d[n];
		int result = 3 * dp(n-2);
		for(int i = 3; i <=n; i ++) {
			if(n % 2 == 0) {
				result += (2* dp(n -i));
			}
			
		}
		
		
		
		return d[n] = result;
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(dp(n));
		

	}

}
