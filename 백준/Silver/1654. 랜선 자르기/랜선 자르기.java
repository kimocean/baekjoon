import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[K];
		
		long max = 0;
		
		for(int i=0;i<K;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		max++;
		
		long min = 0;
		long mid = 0;
		
		while(max > min) {
			int cnt = 0;
			mid = (min + max) / 2;
			for(int i=0;i<arr.length;i++) {
				cnt += arr[i] / mid;
			}
			if(cnt < N) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		System.out.println(max - 1);
	}
}