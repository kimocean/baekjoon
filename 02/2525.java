import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();
		StringTokenizer st = new StringTokenizer(time, " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int oven = scan.nextInt();
		M = M + H * 60 + oven;
		H = M / 60;
		M = M % 60;
		if(H>=24) {
			H -= 24;
		}
		System.out.println(H + " " + M);
	}

}
