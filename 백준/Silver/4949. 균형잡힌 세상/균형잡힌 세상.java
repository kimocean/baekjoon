import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static String scan(String str) {
		String result = "yes";
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '(' || c == '[') {
				st.add(c);
			} else if(c == ')') {
				if(st.empty() || st.peek() != '(') {
					return "no";
				} else {
					st.pop();
				}
			} else if(c == ']') {
				if(st.empty() || st.peek() != '[') {
					return "no";
				} else {
					st.pop();
				}
			}
		}
		
		if(!st.isEmpty()) {
			return "no";
		} else {
			return "yes";
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str = br.readLine();
		
		while(!str.equals(".")) {
			String result = scan(str);
			System.out.println(result);
			str = br.readLine();
		}
	}
}