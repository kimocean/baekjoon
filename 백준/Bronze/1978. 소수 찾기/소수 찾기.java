import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int num[] = new int[N];
		boolean arr[] = new boolean[1001]; // 소수 false, 소수 아니면 true
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		// 에라토스테네스의 체 - 소수 구하는 알고리즘
		arr[0] = arr[1] = true;
		
		for(int i=2;i*i<arr.length;i++) {
			// arr[i]가 소수라면
			if(!arr[i]) {
				// arr[j]는 소수가 아님..
				// 제곱부터 시작하는 이유 : 제곱 이하는 이미 처리함
				// ex. i가 2일 때 j는 4부터 6, 8, 10 ... 처리
				// i가 3일 때 9부터 시작하는데, 이때 6은 이미 2의 배수에서 처리됨
				for(int j=i*i;j<=arr.length-1;j+=i) {
					arr[j] = true;
				}
			}
		}
		
		int cnt = 0; // 소수 개수
		
		for(int i=0;i<N;i++) {
			if(!arr[num[i]]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}