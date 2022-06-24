package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class b1158 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		
		String[] str = br.readLine().split(" ");
		int N  = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]); 
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=0;j<K;j++) {
				if(j==K-1)
					sb.append(q.poll() + ", ");
				else
					q.add(q.poll());
			}
		}
		
		System.out.println((sb.substring(0, sb.length()-2) + ">").toString());
		
		
		
	}
}
