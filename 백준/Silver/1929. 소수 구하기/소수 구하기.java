import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[N+1];
		
		arr[0] = arr[1] = true; // 소수면 false
		
		for(int i=2;i*i<=N;i++) {
			if(!arr[i]) {
				for(int j=i+i;j<=N;j+=i) {
					arr[j] = true;
				}
			}
		}
		
		for(int i=M;i<=N;i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
		
	}
}