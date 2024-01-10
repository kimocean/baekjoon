import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int del = (int)Math.round((double)n * 15 / 100); // 절삭할 사람 수, 한쪽 기준이라 위아래 하려면 * 2
		int people = n - del*2; // 실제로 계산할 사람 수
		
		for(int i=0;i<del;i++) {
			arr[i] = 0;
		}
		for(int i=n-1;i>n-1-del;i--) {
			arr[i] = 0;
		}
		
		int result = 0;
		for(int i=0;i<n;i++) {
			result += arr[i];
		}
		
		System.out.println((int)Math.round((double)result / (double)people));
				
	}
}