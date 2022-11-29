import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); // 자릿수 담을 변수
		scan.nextLine();
		String in = scan.nextLine();
		int[] arr = new int[x];
		
		for(int i=0;i<x;i++) {
			arr[i] = in.charAt(i) - 48;
		}
		
		int sum = 0;
		
//		System.out.println(Arrays.toString(arr));

		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
}
