import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		int[] rank = new int[N];
		
		for(int i=0;i<N;i++) {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<N-1;i++) {
			for(int j=i;j<N;j++) {
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
					rank[j]++;
				} else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			sb.append(rank[i]+1).append(" ");
		}
		
		System.out.println(sb);
		
	}
	
}