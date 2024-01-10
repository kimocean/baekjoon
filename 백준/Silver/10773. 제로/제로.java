import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();
		int result = 0;
		
		for(int i=0;i<K;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0) {
				stack.push(num);
			} else {
				stack.pop();
			}
		}
		
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		
		System.out.println(result);
	}
}