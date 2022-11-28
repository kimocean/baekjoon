import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashSet<Integer> num = new HashSet<Integer>(); // 입력받은수

		for (int i = 0; i < 10; i++) {
			num.add(Integer.parseInt(bf.readLine()) % 42);
		}
		
		// hashset은 중복 걸러서 넣어 주는 콜렉션.

//		bw.write(num.toString() + "\n");
		bw.write(num.size() + "\n");
		bw.flush();
		bw.close();

	}
}
