import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	// 유클리드 호제법 - 최소공약수 구하는 알고리즘
	// 큰 수를 작은 수로 나누어 떨어지게 한 뒤, 수를 반복적으로 수행하여 나머지가 0이 될 때까지 작동
	// 이때 작은 수가 최대공약수
	// a > b일 경우 작동
	public static int GCD(int a, int b) {
		int temp;
		while(b > 0) {
			temp = a % b; // 나머지 저장
			a = b; // 작은 수를 큰 수의 변수로 옮기고
			b = temp; // a % b 나머지를 작은 수 변수에 옮김.. 그러면 작은수 % 나머지 가 됨
		}
		// 마지막에는 a : 최대공약수 b : 0이 됨
		return a;
	}
	
	// 최소공배수 : 두 수의 곱 / 최대공약수
	public static int lcm(int a, int b) {
		return a * b / GCD(a, b);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(N >= M) {
			System.out.println(GCD(N, M));
			System.out.println(lcm(N, M));
		} else {
			System.out.println(GCD(M, N));
			System.out.println(lcm(M, N));
		}
		
	}
}