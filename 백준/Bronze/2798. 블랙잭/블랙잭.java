import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 카드의 개수
		int M = Integer.parseInt(st.nextToken()); // 가까워져야 하는 수(블랙잭의 21)
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				for(int k=j+1;k<N;k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(sum <= M && sum > max) {
						max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}