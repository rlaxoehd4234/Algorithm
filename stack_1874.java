import java.io.*;
import java.util.*;
public class stack_1874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		
		
		int line = Integer.parseInt(br.readLine());
		int start = 0;
		
		
		while(line --> 0) {
			
			
			int num = Integer.parseInt(br.readLine());
			
			if(num > start) {
				for(int i = start + 1; i <=num; i ++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = num;
				
			}
			else if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n');
			
		}
		
		
		System.out.println(sb);
		
	}

}
