import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String str = br.readLine();
		
		while(!str.equals(".")) {
			Stack<Character> stack = new Stack<>();
			String yn = "yes";
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				
				if(c == '(' || c == '[') {
					stack.add(c);
				} else if(c == ')' || c == ']') {
					if(stack.isEmpty()) {
						yn = "no";
						break;
					} else if(c == ')' && stack.peek() != '(' || c == ']' && stack.peek() != '[') {
						yn = "no";
						break;
					} else {
						stack.pop();
					}
				}
			}
			
			if(!stack.isEmpty()) {
				yn = "no";
			}
			
			System.out.println(yn);
			str = br.readLine();
		}
	}
}