import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split("\\s+");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		
		if(A>B) {
			System.out.println(">");
		} else if (A<B) {
			System.out.println("<");
		} else
			System.out.println("==");
	}

}