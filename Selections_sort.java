package 알고리즘;

import java.io.*;
import java.util.Arrays;

public class Selections_sort {

	public static void main(String[] args) throws IOException {
		
		//선택 정렬은 자리 하나하나 다 비교하는 정렬 방법입니다. 시간 복잡도는 O(n^2) 입니다.
		
		int[] arr = {1,3,4,5,6,2,6,7,8,9};
		int tmp = 0;
		for(int i = 0; i < arr.length-1; i ++) {
			for(int j = i+1 ; j < arr.length-2; j ++) {
				if(arr[i] > arr[j+1]) {
					tmp = arr[j];
					arr[i] = arr[j+1];
					arr[j+1] = tmp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
