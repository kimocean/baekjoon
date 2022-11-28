import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();
		StringTokenizer st = new StringTokenizer(time, " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		if(M >= 45) {
			M = M-45;
			System.out.println(H + " " + M);
		} else if (H==0) {
			H = 24;
			M = M+15;
			H = H-1;
			System.out.println(H + " " + M);
		}
		else {
			M = M+15;
			H = H-1;
			System.out.println(H + " " + M);
		}
	}

}
