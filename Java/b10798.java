package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b10798 { // 제출할 때는 항상 Main class로!

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [][] ch = new char[5][15];
		int max = 0;
		for(int i=0;i<ch.length; i++) {
			String str = br.readLine();
			if(max < str.length())
				max = str.length();
			for(int j=0;j<str.length();j++) {
				ch[i][j] = str.charAt(j);
			
			}
			
		}
		StringBuilder sb = new StringBuilder(); // 여러번 출력해야 하는 경우에는 StringBUilder 사
		for (int i=0;i<max;i++) {
			for(int j=0;j<5;j++) {
				if(ch[j][i] =='\0')
					continue;
				sb.append(ch[j][i]);
				
			}
		}
		System.out.println(sb);
	};

}
