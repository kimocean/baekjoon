import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[][] arr = new int[15][15];
		for(int i=0;i<15;i++) {
			arr[i][1] = 1; // i층 1호
			arr[0][i] = i; // 0층 i호
		}
		
		for(int i=1;i<15;i++) { // 1~14층
			for(int j=2;j<15;j++) { // 2~14호
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		for(int i=0;i<T;i++) {
			int k = Integer.parseInt(br.readLine()); // 층
			int n = Integer.parseInt(br.readLine()); // 호
			
			sb.append(arr[k][n]).append("\n");
		}
		System.out.println(sb);
	}
}