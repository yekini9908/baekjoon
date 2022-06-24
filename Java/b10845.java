package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class b10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> queue = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			
			if(str.contains("push")) {
				String[] arr = str.split(" ");
				queue.add(Integer.parseInt(arr[1]));
			}
			else if(str.contains("pop")) {
				if(queue.size()!=0) {
					System.out.println(queue.remove(0));
				}
				else
					System.out.println(-1);
				
			}
			else if(str.contains("size")) {
				System.out.println(queue.size());
				
			}
			else if(str.contains("empty")) {
				if(queue.size()!=0) {
					System.out.println(0);
				}
				else
					System.out.println(1);
			}
			else if(str.contains("front")) {
				if(queue.size()!=0) {
					System.out.println(queue.get(0));
				}
				else
					System.out.println(-1);
			}
			else if(str.contains("back")) {
				if(queue.size()!=0) {
					System.out.println(queue.get(queue.size()-1));
				}
				else
					System.out.println(-1);
			}
	}

}
}
