import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean arr[] = new boolean[1000001]; // true면 소수 아님, false면 소수
		
		arr[0] = arr[1] = true;
		
		for(int i=2;i<(int)Math.sqrt(arr.length);i++) {
			if(!arr[i]) {
				for(int j=i*i;j<arr.length;j+=i) {
					arr[j] = true;
				}
			}
		}
		
		for(int i=M;i<=N;i++) {
			if(!arr[i]) {
//				sb.append(i).append("\n");
				System.out.println(i);
			}
		}
//		System.out.println(sb);
	}
}