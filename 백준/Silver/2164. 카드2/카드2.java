import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;	

public class Main {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			que.add(i);
		}
		
		while(que.size() > 1) {
			que.poll(); // head 의 값 제거
			que.add(que.poll()); // add 자체의 반환값은 tf
		}
		
		System.out.println(que.peek()); // head 의 값 출력
	}
}