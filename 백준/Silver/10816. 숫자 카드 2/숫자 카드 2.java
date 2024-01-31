import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] cnt = new int[20000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
			cnt[Integer.parseInt(st.nextToken())+10000000]++;
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<M;i++) {
			sb.append(cnt[Integer.parseInt(st.nextToken()) + 10000000]).append(" ");
		}
		
		System.out.println(sb);
	}
}