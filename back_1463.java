package 다이나믹프로그래밍;

import java.io.*;

public class back_1463 {
	
	
	static Integer[] dp;
	
	public static void recursive(int n) {
		
		if( dp[n] == null) {
			if(n % 6 == 0) {

				dp[n] = Math.min(recursive(n - 1), Math.min(recursive(n / 3), recursive(n / 2))) + 1;
			}
			
			
		}
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
	}

}
