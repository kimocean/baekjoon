import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = 0;
		int cnt = 0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			s = scan.nextInt();
			arr[i] = s;
		}
		int v = scan.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i] == v) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
