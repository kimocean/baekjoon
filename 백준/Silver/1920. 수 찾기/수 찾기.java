import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int bs(int[] arr, int key) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while(high >= low) {
			int mid = (low + high) / 2;
			if(arr[mid] < key) {
				low = mid + 1;
			} else if(arr[mid] > key) {
				high = mid - 1;
			} else if(arr[mid] == key) {
				return 1;
			}
		}
		return 0;
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<M;i++) {
			System.out.println(bs(arr, Integer.parseInt(st.nextToken())));
		}
		
	}
}