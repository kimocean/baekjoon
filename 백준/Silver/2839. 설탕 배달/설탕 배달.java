import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(br.readLine()); // 설탕 kg
		
		int sum = N;
		
		for(int x=0;x<N;x++) {
			for(int y=0;y<N;y++) {
				if(5*x + 3*y == N) {
					sum = Math.min(sum, x+y);
				}
			}
		}
		
		if(sum == N) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
		}
		
	}
}