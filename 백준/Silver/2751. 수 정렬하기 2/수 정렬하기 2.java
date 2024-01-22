import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(br.readLine());
		
		// 수가 중복되지 않아서 없으면 false(기본값) 있으면 true
		// 0 : 1,000,000
		boolean arr[] = new boolean[2000001];
		
		for(int i=0;i<N;i++) {
			// 입력값을 바로 arr의 인덱스로 잡아 줌
			// 1을 입력받으면 arr[1000001] = true
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}

		// 어차피 인덱스 오름차순으로 순차 탐색하기 때문에 자동 오름차순 정렬으로 출력
		for(int i=0;i<arr.length;i++) {
			if(arr[i]) {
				sb.append(i-1000000).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}