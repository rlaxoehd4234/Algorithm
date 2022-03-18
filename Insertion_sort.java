package 알고리즘;

import java.io.*;
import java.util.*;
public class Insertion_sort {

	public static void main(String[] args) throws IOException {
		
		//버블,인설션,셀렉션 3가지의 정렬 중에서 가장빠르다. 
		// 특정한 상황에서는 훨씬 더 빠르다. 시간 복잡도는 O(N^2) 이자만 3가지 정렬중에서는 속도가가장빠르다.
		
		int []arr = {1,10,5,8,6,4,3,2,9,7};
		int i,j;
		int tmp = 0;
		
		for(i = 0 ; i < 10; i ++) {
			j = i;
			while(arr[j] > arr[j+1]){
			tmp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = tmp;
			j--;
				}
			}
		
		System.out.println(Arrays.toString(arr));
	}

}
