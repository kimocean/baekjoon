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
		int cnt = 1;
		int num = 666;
		
		while(cnt != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(num);
		
	}
}