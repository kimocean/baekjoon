import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		double N = Double.parseDouble(br.readLine());
		double arr[] = new double[(int)N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		double sum = 0;
		
		for(int i=0;i<N;i++) {
			arr[i] = arr[i] / arr[(int)N-1] * 100;
			sum += arr[i];
		}
		
		System.out.println(sum / N);
		
	}
}