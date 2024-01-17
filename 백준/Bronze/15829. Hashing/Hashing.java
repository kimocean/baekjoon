import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long M = 1234567891;
		int r = 31;
		long result = 0;
		long pow = 1;
		
		int[] arr = new int[L];
		for(int i=0;i<L;i++) {
			arr[i] = str.charAt(i) - 96;
			
			result += (arr[i] * pow) % M;
			pow = (pow * r) % M;
		}
		
		StringBuilder sb = new StringBuilder();

		sb.append(result % M);
		
		System.out.println(sb);
	}
}