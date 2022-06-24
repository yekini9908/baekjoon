package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b1927 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> heap = new PriorityQueue<>(); // 마지막에 들어온 것을 먼저 삭제하는게 아니고 가장 작은 값을 먼저 삭
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(br.readLine());
			if(x==0) {
				if(heap.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(heap.poll()); //poll 삭제 
				}
			}
			else {
				heap.add(x);
			}
		}

	}

}
