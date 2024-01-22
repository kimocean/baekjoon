import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(N >= 5) {
			// 5, 10, 15.. 의 경우 각각 1, 2, 3개 뱉음 
			// 10!의 경우 1*2*..5..*10임. 이때 5의 개수는 5랑 10에서 뱉으니까 2개
			// 이렇게 N에서 5를 나눈 몫(=5가 몇 개 있는지)이 0의 개수가 됨
			cnt += N / 5; 
			// 이때 N / 5가 5보다 크다면 N 자체(N! 말고)에 5가 한 번 더 곱해져 있다는 소리
			// 따라서 while문 한 번 더 돎
			N /= 5;
		}
		System.out.println(cnt);
	}
}

/*
뒷자리가  0이 나오는 경우 : 2*5가 있을 때 -> 소인수분해를 해서 2와 5가 존재하는 경우 뒷자리는 0으로 끝남
but 2의 개수는 항상 5의 개수보다 많기 때문에 실질적으로 5의 개수만 세도 됨
N이 25일 경우 0 개수가 2 증가 -> 5, 10, 15, 20, 30 ... 은 5*1, 2, 3, 4, 6인 반면 25는 5*5라 5가 2개임 -> 0도 2개 증가

*/