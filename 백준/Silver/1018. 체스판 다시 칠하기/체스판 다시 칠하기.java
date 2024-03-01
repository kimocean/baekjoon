import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
//		String[][] arr = new String[N][M]; // 입력받은 체스판
		boolean[][] arr = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
//			arr[i] = str.split("");
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<M;j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N-7;i++) {
			for(int j=0;j<M-7;j++) {
				int num = chess(i, j, arr);
//				System.out.println(num);
				if(num < min) {
					min = num;
				}
			}
		}
		
		System.out.println(min);
		
	}
	
	// true : w, false : b
	public static int chess(int n, int m, boolean arr[][]) {
		int cnt = 0;
		boolean flag = true;
		
		for(int i=n;i<n+8;i++) {
			for(int j=m;j<m+8;j++) {
//				System.out.println(flag + " " + arr[i][j]);
				if(flag != arr[i][j]) {
					cnt++;
				}
				flag = !flag;
			}
			flag = !flag;
		}
		return (int)Math.min(cnt, 64-cnt);
	}

}