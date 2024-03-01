import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(br.readLine());
		Queue que = new LinkedList<Integer>();
		
		for(int i=1;i<=N;i++) {
			que.add(i);
		}
		
		while(que.size() > 1) {
			que.poll();
			que.add(que.poll());
		}
		
		System.out.println(que.peek());
		
	}
}
