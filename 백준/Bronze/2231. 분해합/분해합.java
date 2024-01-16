import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(br.readLine()); // 분해합
		boolean flag = false;
		
		// 256 -> 245를 예시로 들면 분해합(256)은 무조건 생성자(245)보다 크다.. 왜냐면 245+각자릿수기 때문에
		// 그래서 for문은 N(분해합)까지만 돌아도 됨
		for(int i=1;i<N;i++) {
			int sum = i; // 합, 자신이랑 자릿수 더하는 것이므로 자신부터 시작하기
			int temp = i; // 나눗셈 돌아갈 임시 변수
			while(temp != 0) { // sum 세팅
				sum += temp % 10; // 자릿수 더하기
				temp /= 10;
			}
			if(sum == N) {
				System.out.println(i);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println(0);
		}
	}
}