import java.io.*;
import java.util.Arrays;

public class alpha_num {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		String keyword = br.readLine();
		int[]list = new int[26];
		
		for(int i = 0; i <keyword.length(); i++) {
			list[keyword.charAt(i)-97]++;
		}
		for(int i = 0; i<list.length; i++) {
			System.out.print(list[i]+" ");
			
		}
		
	}

}
