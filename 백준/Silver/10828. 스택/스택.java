import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int stack[] = new int[10000];
	static int length = 0;
	
	public static void push(int x) {
		stack[length] = x;
		length++;
	}
	
	public static int pop() {
		int result;
		if(length == 0) {
			result = -1;
		} else {
			result = stack[length-1];
			stack[length-1] = 0;
			length--;
		}
		
		return result;
	} 
	
	public static int size() {
		return length;
	} 
	
	public static int isEmpty() {
		if(length == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int top() {
		int result;
		if(length == 0) {
			result = -1;
		} else {
			result = stack[length-1];
		}
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push": 
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop": 
				sb.append(pop()).append("\n");
				break;
			case "size": 
				sb.append(size()).append("\n");
				break;
			case "empty": 
				sb.append(isEmpty()).append("\n");
				break;
			case "top": 
				sb.append(top()).append("\n");
				break;
			}
		}
		System.out.print(sb);
	}
}