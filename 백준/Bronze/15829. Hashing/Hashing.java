import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		
		int sum = 0;
		
		for(int i=0;i<N;i++) {
			int num = s.charAt(i)-'a'+1;
			int pow = 31;
			
			sum += (num % M) * ((int)Math.pow(r, i) % M);
//			sum += num * (int)Math.pow(r, i) % M;
//			pow = (int)Math.pow(r, i) % M;
//			sum += (num % M) * pow;
		}
		System.out.println(sum);
	}
}