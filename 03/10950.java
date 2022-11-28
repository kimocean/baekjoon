import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ea = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < ea; i++) {
			String num = scan.nextLine();
			StringTokenizer st = new StringTokenizer(num, " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			System.out.println(num1 + num2);
		}

	}

}
