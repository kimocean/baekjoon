import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int r = 31;
		int M = 1234567891;
		long pow = 1;
		long sum = 0;
		
		for(int i=0;i<N;i++) {
			int c = s.charAt(i) - 96;
			
			sum += (c * pow) % M;
			pow = (pow * r) % M;
		}
		
		System.out.println(sum%M);
		
	}
}