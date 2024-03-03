import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(arr);
		
		double cut = Math.round(n*0.15); // 절사할 사람 수의 절반(한쪽)
		
		double sum = 0;
		for(int i=(int)cut;i<n-cut;i++) {
			sum += arr[i];
		}
		
		System.out.println((int)Math.round(sum / (n - cut*2)));
		
	}
}