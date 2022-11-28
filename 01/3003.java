import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();

		if (a != 1) {
			a = 1 - a;
		} else {
			a = 0;
		}
		if (b != 1) {
			b = 1 - b;
		} else {
			b = 0;
		}
		if (c != 2) {
			c = 2 - c;
		} else {
			c = 0;
		}
		if (d != 2) {
			d = 2 - d;
		} else {
			d = 0;
		}
		if (e != 2) {
			e = 2 - e;
		} else {
			e = 0;
		}
		if (f != 8) {
			f = 8 - f;
		} else {
			f = 0;
		}
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
	}
}
