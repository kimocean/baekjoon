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

		String sen = br.readLine();
		sen = sen.trim();
		
		StringTokenizer st = new StringTokenizer(sen);
		String[] sens = sen.split(" ");
		
//		bw.write(Arrays.toString(sens));
		
		if(sens[0].isEmpty()) { // 아무것도 입력 안 하거나 공백일 때 체크
			bw.write(0 + "");
		} else {
			bw.write(sens.length + "");
		}
		
		bw.flush();
		bw.close();
		
	}
}
