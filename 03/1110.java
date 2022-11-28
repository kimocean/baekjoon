import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0; // 사이클 몇 번 돌았는지.
		int ten = 0; // 입력된 숫자의 10자리
		int one = 0; // 입력된 숫자의 1자리
		int plus = n; // 실제 변환될 거
		int pten = 0; // plus의 10자리
		int pone = 0; // plus의 1자리
		do {
			ten = plus / 10;
			one = plus % 10;
			plus = ten + one; // 여기까지 하면 2+6=8 되는 거임
			pten = plus / 10;
			pone = plus % 10;
			plus = one * 10 + pone;
			cnt++;
		} while (n != plus);
		System.out.println(cnt);
	}
}
