package 다이나믹프로그래밍;

import java.io.*;

public class back_14852 {
	static long [][]d = new long [1000001][2];
	
	
	static long dp(long n ) {
		
		d[0][0] = 0;
		d[1][0] = 2;
		d[2][0] = 7;
		d[2][1] = 1;
		
		
		
		for(int i = 3; i <=n; i ++) {
			d[i][1] = (d[i-3][0] + d[i-1][1]) % 1000000007;
			d[i][0] = (3 * d[i -2][0] + 2 * d[i-1][0] + 2*d[i][1]) % 1000000007;
			 
		}
		return (int) d[(int) n][0];
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		
		long n = Integer.parseInt(br.readLine());
		
		System.out.println(dp(n));
		
		

	}

}
