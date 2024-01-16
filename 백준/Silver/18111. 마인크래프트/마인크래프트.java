import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 세로
		int M = Integer.parseInt(st.nextToken()); // 가로
		int B = Integer.parseInt(st.nextToken()); // 인벤토리에 있는 블록의 개수
		int arr[][] = new int[N][M];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > max) {
					max = arr[i][j];
				} else if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		
		int time = 99999999; // 최소 시간 구별하기 위한 변수
		int floor = 0;
		
		for(int i=min;i<=max;i++) {
			int cnt = 0; // 한 층 돌릴 때의 시간
			int block = B; // 한 층 돌릴 때 블록 수
			
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(i < arr[j][k]) { // 만들 층보다 현재 층이 높으면
						cnt += (arr[j][k] - i) * 2; // 블록 제거 - 2초라 *2 함 
						block += arr[j][k] - i; // 제거 == 인벤토리에 넣는 거라 + 함
					} else if(i > arr[j][k]) {
						cnt += i - arr[j][k]; // 블록 추가
						block -= i - arr[j][k];
					}
				}
			}
			
			// 블록의 개수가 음수면 반복문 종료
			if(block < 0) {
				break;
			}
			
			// 기존 시간보다 for문 돌린 시간이 작거나 같으면 대입
			if(time >= cnt) {
				time = cnt;
				floor = i;
			}
		}
		
		System.out.println(time + " " + floor);
		
	}
}