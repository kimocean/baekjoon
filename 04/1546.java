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

		double sub = Integer.parseInt(br.readLine()); // 과목 수. 처음 받는 숫자
		String score[] = new String[(int) sub];
		String scores = br.readLine();
		st = new StringTokenizer(scores);
		score = scores.split(" ");
		double max = 0.0;
		double sum = 0.0;
		
		for(int i=0;i<sub;i++) {
			if(Integer.parseInt(score[i]) > max) {
				max = Integer.parseInt(score[i]);
			}
			sum += Integer.parseInt(score[i]);
		}
		
		double avg = sum / max * 100 / sub;

//		bw.write(Arrays.toString(score) + "\n");
//		bw.write(sum + "\n");
//		bw.write(max + "\n");
		bw.write(avg + "\n");
		bw.flush();
		bw.close();

	}
}
