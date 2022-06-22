package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2490 {
	public static void main(String[] args) throws IOException{
		// 윷 정답이 담긴 배열을 만든다
		// index를 사용해서 
		// 한 줄 씩 읽고 출력하고 
		// arrayList로 읽어와서 1의 개수를 세는게 나을까.. 어떻게 1의 개수를 세면 좋을까
		// 개수에 따라 만약 1의 개수가 1개면 1-1 해서 0ㅈ번째 index를 출력!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char [] ch = new char[] {'A','B','C','D','E'};
		
		for(int i=0;i<3;i++) {
			String str = br.readLine();
			//String str = "0 0 0 0";
			
			int count = str.length() - str.replace(String.valueOf("0"), "").length();
			if(count == 0)
				System.out.println(ch[4]);
			else
				System.out.println(ch[count-1]);
			
		}
		
		
		
		
		
	}

}
