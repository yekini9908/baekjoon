package baekjoon;

import java.io.*;
import java.util.PriorityQueue;

public class b11286 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> 
        	Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));
		// 절대값비교로 함수 변경 
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(br.readLine());
			if(x==0) {
				if(heap.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(heap.poll()); 
				}
			}
			else {
				heap.add(x);
			}
		}

	}

}
