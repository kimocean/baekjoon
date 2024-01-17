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
		
		int N = Integer.parseInt(br.readLine()); // 벌집 주소
		int num = 1; // i의 역할.. 6이랑 곱해 줄 변수
//		int cnt = 2; // 겹의 수?
		int range = 2; // 최솟값 기준 범위(2, 9, 20..)
		
		if(N == 1) {
			System.out.println(1);
		} else {
			while(range <= N) {
				range = range + 6*num;
				num++;
			}
			System.out.println(num);
		}
	}
}

/*

1 -> 6 -> 12 -> 18 ... 6*i가 범위가 됨
따라서 i++ 해 주면서 6과 곱한 걸 빼 주며 N이 음수가 될 때까지 while문 돌림

*/