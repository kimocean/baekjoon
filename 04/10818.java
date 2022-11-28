import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine()); // 배열 개수
		
		String sarr = bf.readLine();
		StringTokenizer st = new StringTokenizer(sarr);
		String arr[] = sarr.split(" "); // 정수 배열
		
		int min = 1000000;
		int max = -1000000;
		
		for(int i=0;i<n;i++) {
			if(Integer.parseInt(arr[i]) > max) {
				max = Integer.parseInt(arr[i]);
			}
			if(Integer.parseInt(arr[i]) < min) {
				min = Integer.parseInt(arr[i]);
			}
		}
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
		
	}
}
