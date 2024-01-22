import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][N];
		int[] rank = new int[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			arr[0][i] = Integer.parseInt(st.nextToken());
			arr[1][i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<N;i++) {
			rank[i] = 1;
			for(int j=0;j<N;j++) {
				if(arr[0][i] < arr[0][j] && arr[1][i] < arr[1][j]) {
					rank[i]++;
				}
			}
			System.out.print(rank[i] + " ");
		}
	}
}