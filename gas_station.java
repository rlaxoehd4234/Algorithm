package greedi;

import java.io.*;
import java.util.*;

public class gas_station {
	//그리디 알고리즘 주유소 문제 
	//각 주유소의 기름가격이 내림차순일 경우에만 곱해준다. 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int []meter = new int[n-1];
		int []price = new int[n];
		
		
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i< meter.length; i++) {
			meter[i] = Integer.parseInt(st.nextToken());
			
		}
		
		st= new StringTokenizer(br.readLine());
		for(int i = 0; i<price.length; i++) {
			price[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int sum = 0; 
		int minPrice = price[0];
		
		for(int i = 0; i < n-1; i ++) {
			
			if(minPrice > price[i] ) {
				minPrice = price[i];}
			
			sum += (minPrice * meter[i]);
		}
		
		
		System.out.println(sum);
		

	}

}
