import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int cnt[] = new int[10001];
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 카운팅 정렬
		// 1. 수의 범위 배열(cnt)에서 인덱스를 기준으로 하여 해당 수 인덱스 +1 함
		// arr에 1이 스캔되면 cnt[1]++ 하는 식
		// 어느 수가 몇 개 있는지 파악하는 용도
		for(int i=0;i<N;i++) {
			cnt[arr[i]]++;
		}
		
		// 누적합 구하고 result 배열에 재입력하는 대신 오름차순 정렬 위해 cnt 배열 스캔하며 출력함
		for(int i=1;i<10001;i++) {
			while(cnt[i] > 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		
		System.out.println(sb);
		
	}
}