import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int cnt = scan.nextInt();
		
		int plus = 0;
		
		for(int i=0;i<cnt;i++) {
			int item = scan.nextInt();
			int price = scan.nextInt();
			plus += item * price;
		}
		
		if(total == plus) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
