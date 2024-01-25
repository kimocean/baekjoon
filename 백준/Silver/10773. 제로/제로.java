import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=0;i<K;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0) {
				st.add(num);
				sum += num;
			} else {
				sum -= st.peek();
				st.pop();
			}
		}
		
		System.out.println(sum);
		
	}
}