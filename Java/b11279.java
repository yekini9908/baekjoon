package baekjoon;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Collections;

public class b11279 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder()); // 기본 - 작은값부터 , Collections.reverseOrder()를 사용하면 큰값부터 제거 
		
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
