import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine()); // 문제(라인 개수)

		for (int x = 0; x < num; x++) {

			int cnt = 0; // O 연속 개수 셀 거
			int sum = 0; // 총점 담을 거

			String test = br.readLine();
			st = new StringTokenizer(test);
			String[] tests = test.split(""); // 배열에 문제 하나씩 넣었음

			for (int i = 0; i < tests.length; i++) {
				if (tests[i].charAt(0) == 'O') { // O면 카운트 증가...
					cnt++;
				} else { // 아니면(X면) 0점부터 시작
					cnt = 0;
				}
				sum += cnt;
			}
			
//			bw.write(Arrays.toString(tests) + "\n");
			bw.write(sum + "\n");
		}

		bw.flush();
		bw.close();

	}
}
