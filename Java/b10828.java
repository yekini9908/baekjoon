package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class b10828 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> stack = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			
			if(str.contains("push")) {
				String[] arr = str.split(" ");
				stack.add(Integer.parseInt(arr[1]));
			}
			else if(str.contains("pop")) {
				if(stack.size()!=0) {
					System.out.println(stack.remove(stack.size()-1));
				}
				else
					System.out.println(-1);
				
			}
			else if(str.contains("size")) {
				System.out.println(stack.size());
				
			}
			else if(str.contains("empty")) {
				if(stack.size()!=0) {
					System.out.println(0);
				}
				else
					System.out.println(1);
			}
			else if(str.contains("top")) {
				if(stack.size()!=0) {
					System.out.println(stack.get(stack.size()-1));
				}
				else
					System.out.println(-1);
			}
		}
		
		
		
	}
	
	

}
