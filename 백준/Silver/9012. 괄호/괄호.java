import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(br.readLine());
		Stack<Character> st = new Stack<Character>();
		String str = br.readLine();
		boolean flag = true;
		
		for(int i=0;i<T;i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j) == '(') {
					st.add('(');
				} else {
					if(st.isEmpty()) {
						flag = false;
						break;
					} else {
						st.pop();
					}
				}
			}
			
			if(!flag || !st.isEmpty()) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			
			str = br.readLine();
			flag = true;
			st.clear();
			
		}
	}
}