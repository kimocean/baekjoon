import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		boolean[] cnt = new boolean[2000001]; // 0 : 1000001
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			cnt[arr[i]+1000000] = true;
		}
		
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]) {
				sb.append(i-1000000).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
	
}