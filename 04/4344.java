import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner br = new Scanner(System.in);
		StringTokenizer st;

		double num = Double.parseDouble(br.nextLine()); // 테스트 케이스의 개수
//		double num = Double.parseDouble(br.readLine()); // 테스트 케이스의 개수

		for (int x = 0; x < num; x++) {

			double avg = 0.0;
			double sum = 0.0;
			int cnt = 0; // 평균 넘는 사람 수
			double answer = 0.0;

			String line = br.nextLine();
			st = new StringTokenizer(line);
			String[] lines = line.split(" "); // 배열 처음 건 문제 수, 그 뒤부터는 점수

			for(int i=1;i<lines.length;i++) {
				sum += Double.parseDouble(lines[i]);
			}
			
			avg = sum / Double.parseDouble(lines[0]); // 평균 구하기
			
			for(int i=1;i<lines.length;i++) {
				if(Double.parseDouble(lines[i]) > avg) {
					cnt++;
				}
			}
			
			answer = cnt / Double.parseDouble(lines[0]) * 100;
			
//			bw.write(Arrays.toString(lines) + "\n");
//			bw.write(sum + "\n");
//			bw.write(avg + "\n");
//			bw.write(cnt + "\n");
//			bw.write(Math.round(answer*1000)/1000.0 + "%\n");
			System.out.printf("%.3f", answer);
			System.out.println("%");
		}

//		bw.flush();
//		bw.close();
		
		/*
		 * 테스트 케이스 개수 num // 이게 제일 큰 for문
		 * 학생의 수가 처음, 그 뒤는 점수 - for문으로 배열에 담기?
		 * 평균이 넘는 학생의 비율
		 * 1. 평균 구하기 avg
		 * 2. 평균을 넘는 사람의 수 구하기
		 * 3. 비율을 어떻게 구하더라... 넘는 사람 수 / 5 * 100
		 * double형으로
		 */

	}
}
