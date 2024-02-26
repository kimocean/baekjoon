import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] cnt = new int[10001];
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			cnt[arr[i]]++;
		}
		
		for(int i=0;i<10001;i++) {
			while(cnt[i] != 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		System.out.println(sb);
	}
}