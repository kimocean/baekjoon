import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean[][] arr;
	public static int min = 64;
	
	public static void find(int x, int y) {
		
		// 체스판 8*8이기 때문에
		int endX = x+8;
		int endY = y+8;
		int cnt = 0; // 몇 개 바꿔야 하는지 개수 셈
		
		boolean TF = arr[x][y]; // 첫 번째 칸의 색, x, y가 왼쪽 위 - 초기값임
				
		for(int i=x;i<endX;i++) {
			for(int j=y;j<endY;j++) {
				if(arr[i][j] != TF) {
					cnt++;
				}
				TF = !TF; // 다음으로 넘어가면 색이 바뀌므로
			}
			TF = !TF; // 줄이 바뀌면 색이 그대로인데 j for문에서 TF를 바꿔 줌. 그러므로 한 번 더 바꿔서 원래대로 변경
		}
		
		cnt = Math.min(cnt, 64-cnt); // 처음 경우 63개인데 색 리버스 하면 1개일 수가 있으므로
		
		min = Math.min(cnt, min);
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 행의 개수
		int M = Integer.parseInt(st.nextToken()); // 열의 개수
		
		// 제공받은 체스판(자르기 전)
		arr = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				// white = true, black = false
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		// -7 하는 이유 : 체스판 자를 때 10 13이면 가능한 시작점이 row 기준 0~3, col 기준 0~6임.
		// 만약 row 4부터 자르면 4 5 6 7 8 9 10 (11) / col 7 시작 7 8 9 10 11 12 13 (14) 으로 삐져나오는 부분 있음
		// 따라서 가능한 시작점 지정해 줌.. row col은 각각 지정 가능한 마지노선임
		int row = N-7;
		int col = M-7;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				find(i, j);
			}
		}
		
		System.out.println(min);
		
	}
}