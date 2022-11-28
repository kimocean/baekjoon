import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = b;
		int arr[] = new int[3];
		for(int i=0;i<arr.length;i++) {
			int temp = b%10;
			b/=10;
			arr[2-i] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(+ a*arr[2-i]);
		}
		System.out.println(a*c);
	}

}
