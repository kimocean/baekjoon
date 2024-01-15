import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(br.readLine()); // 필요한 랜선의 개수
		Stack<Integer> stack = new Stack<>();
		
		int start = 0;
//		int start = 1;
		
		// n번 반복
		while(n-- > 0) {
			int val = Integer.parseInt(br.readLine()); // stack에서 처음 나오는 숫자
			
			if(val > start) { // 처음 나오는 숫자가 start보다 큰 동안
				// start + 1부터 입력받은 value까지 push함
				// +1, <= 인 이유 : 0부터 시작하지 않음.. 4가 val이면 1, 2, 3, 4 push를 해 줘야 함
				for(int i=start+1;i<=val;i++) {
//				for(int i=start;i<=val;i++) {
					stack.push(i);
					sb.append('+').append("\n");
				}
				start = val; // 다시 push 할 때 시작점을 val로 잡아 줌
//				start = val+1;
			} else if(stack.peek() != val) { // 만약 pop 한 게 val이랑 다르다면
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
			
		}
		
		System.out.println(sb);
		
	}
}

/*
만약 start = 1, int i = start로 하면 4를 처음 pop 한 다음 다시 push를 할 때 5가 아닌 4부터 push를 시작함
꼭 위처럼 사용하고 싶으면 start를 재정의할 때 val + 1을 해 줘야 함
*/
