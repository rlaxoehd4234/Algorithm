package 알고리즘;

import java.io.*;
import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) throws IOException {
		
		//버블정렬은 바로 옆의 숫자와 비교해서 정렬을 계속 진행 방법입니다.
		//또한 시간 복잡도는 O(N^2)입니다.
		int []arr = {4,3,2,1,5,6,8,7,9,10};
		int tmp = 0; 
		
		for(int i = 0 ; i < 10 ; i ++) {
			for(int j = 0; j < 9 - i; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
