package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class b9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> stack = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<N; i++) {
			
			String[] str = br.readLine().split(""); 
//			String s = ")))";
//			String[] str = s.split("");
			
		
			
			
			for(int j=0;j<str.length;j++) {
				if(stack.size()==0) {
					stack.add(str[j]);
				}
				else {
					if(stack.get(stack.size()-1).equals(str[j])) {
						stack.add(str[j]);
						
					}
					else {
						if(stack.get(stack.size()-1).equals(")"))
							stack.add(str[j]);
						else
							stack.remove(stack.size()-1);
					}
				}
				
			}
			
			
			if(stack.size() == 0)
				System.out.println("YES");
			
			else
				System.out.println("NO");
			
			stack.clear();
			
			
		
		}
		
	}

}
