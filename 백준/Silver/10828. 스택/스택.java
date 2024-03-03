import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void push(int x) {
		st.add(x);
	}
	
	public static int pop() {
		if(st.isEmpty()) {
			return -1;
		} else {
			int num = st.get(st.size()-1);
			st.remove(st.size()-1);
			return num;
		}
	}
	
	public static int size() {
		return st.size();
	} 
	
	public static int empty() {
		if(st.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int top() {
		if(st.isEmpty()) {
			return -1;
		} else {
			return st.get(st.size()-1);
		}
	}
	
	public static List<Integer> st = new ArrayList<Integer>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			StringTokenizer stn = new StringTokenizer(br.readLine(), " ");
			
			switch (stn.nextToken()) {
			case "push": 
				push(Integer.parseInt(stn.nextToken()));
				break;
			case "pop":
				System.out.println(pop());
				break;
			case "size":
				System.out.println(size());
				size();
				break;
			case "empty":
				System.out.println(empty());
				empty();
				break;
			case "top":
				System.out.println(top());
				break;
			
			}
		}
		
	}
}