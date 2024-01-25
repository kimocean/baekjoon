import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;	

public class Main {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			Stack<Character> stack = new Stack<>();
			String line = br.readLine();
			
			for(int j=0;j<line.length();j++) {
				if(line.charAt(j) == '(') {
					stack.push(line.charAt(j));
				} else if(stack.isEmpty()) {
					stack.push(')');
					break;
				} else {
					stack.pop();
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
				
		}
	}
}