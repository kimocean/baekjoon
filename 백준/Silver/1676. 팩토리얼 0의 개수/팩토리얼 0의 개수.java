import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		while(N > 0) {
			if(N / 5 > 0) {
				cnt += (N / 5);
			}
			N /= 5;
		}
		
		System.out.println(cnt);
	}
}