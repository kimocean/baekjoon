import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int deque[] = new int[20001];
	static int length = 0;
	static int first = 10000; // 요소가 처음 있는 부분의 이전 인덱스
	static int last = 10000; // 요소가 있는 부분의 마지막 인덱스 (요소가 10~12까지 3개 있으면 first: 9, last: 12, length : 3)
	
	public static void push_front(int x) {
		deque[first] = x;
		length++;
		first--;
	}

	public static void push_back(int x) {
		length++;
		last++;
		deque[last] = x;
	}
	
	public static int pop_front() {
		int result;
		if(length == 0) {
			result = -1;
		} else {
			first++;
			result = deque[first];
			deque[first] = 0;
			length--;
		}
		return result;
	} 
	
	public static int pop_back() {
		int result;
		if(length == 0) {
			result = -1;
		} else {
			result = deque[last];
			deque[last] = 0;
			length--;
			last--;
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
	
	public static int front() {
		int result;
		if(length == 0) {
			result = -1;
		} else {
			result = deque[first+1];
		}
		return result;
	}
	
	public static int back() {
		int result;
		if(length == 0) {
			result = -1;
		} else {
			result = deque[last];
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
			case "push_front": 
				push_front(Integer.parseInt(st.nextToken()));
//				System.out.println(Arrays.toString(deque));
//				System.out.println("first : " + first + " / last : " + last + " / length : " + length);
				break;
			case "push_back": 
				push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front": 
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back": 
				sb.append(pop_back()).append("\n");
				break;
			case "size": 
				sb.append(size()).append("\n");
				break;
			case "empty": 
				sb.append(isEmpty()).append("\n");
				break;
			case "front": 
				sb.append(front()).append("\n");
				break;
			case "back": 
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.print(sb);
	}
}