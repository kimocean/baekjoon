import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		for(int i=0;i<t;i++) { // 테스트 케이스(줄의 개수)만큼 도는 거
		
			String temp = br.readLine();
			StringTokenizer st = new StringTokenizer(temp);
			int r = Integer.parseInt(st.nextToken()); // 문자 반복할 개수
			String s = st.nextToken(); // 문자
		
			for(int j=0;j<s.length();j++) { // 문자열의 각 문자를 전부 돌아야 해서 문자열의 길이만큼 for문 돌림
				for(int k=0;k<r;k++) { // 제시된 반복 횟수만큼 돌리기
					bw.write(s.charAt(j));
				}
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		
	}
}
