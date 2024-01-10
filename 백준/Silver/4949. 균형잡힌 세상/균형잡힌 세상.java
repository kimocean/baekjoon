import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		
		while(!str.equals(".")) {
			
			Stack<Character> stack = new Stack<>();
			stack.push('0');
			String result = null;
			
			for(int i=0;i<str.length();i++) {
				
				if(str.charAt(i) == '(' || str.charAt(i) == '[') {
					stack.push(str.charAt(i));
				} else if(str.charAt(i) == ')') {
					if(stack.peek() == '(') {
						stack.pop();
					} else {
						result = "no";
						break;
					}
				} else if(str.charAt(i) == ']') {
					if(stack.peek() == '[') {
						stack.pop();
					} else {
						result = "no";
						break;
					}
				}
				
			}
			
			if(result == null && stack.peek() == '0') {
				result = "yes";
			} else {
				result = "no";
			}
			
			System.out.println(result);
			
			str = br.readLine();
		}
	}
}