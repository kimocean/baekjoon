import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int N = Integer.parseInt(st.nextToken()); // 세로
		int M = Integer.parseInt(st.nextToken()); // 가로
		int B = Integer.parseInt(st.nextToken()); // 인벤토리 내 블럭의 수
		int[][] arr = new int[N][M];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(min > arr[i][j]) {
					min = arr[i][j];
				} else if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		
		int time = Integer.MAX_VALUE;
		int high = 0;
		
		for(int i=min;i<=max;i++) { // i : 땅의 높이
			int newT = 0;
			int inven = B;
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(i > arr[j][k]) { // 기준이 되는 땅의 높이(i)보다 현재 칸(arr)이 더 낮으면 블록 올려 줌(1)
						newT += (i - arr[j][k]);
						inven -= (i - arr[j][k]);
					} else if(i < arr[j][k]) { // 기준이 되는 땅의 높이(i)보다 현재 칸(arr)이 더 높으면 블록 제거(2)
						newT += ((arr[j][k] - i) * 2);
						inven += (arr[j][k] - i);
					}
				}
			}
			if(inven < 0) {
				break;
			}
			if(newT <= time) {
				time = newT;
				high = i;
			}
		}
		
		System.out.println(time + " " + high);
		
	}
}