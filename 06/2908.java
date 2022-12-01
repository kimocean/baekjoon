import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int arr[] = new int[3];
		int brr[] = new int[3];
		int temp = a;

		for(int i=2;i>=0;i--) {
			arr[i] = temp % 10;
			temp = temp / 10;
		}

		temp = b;

		for(int i=2;i>=0;i--) {
			brr[i] = temp % 10;
			temp = temp / 10;
		}
		
		int newa = 0;
		int newb = 0;
		
		for(int i=2;i>=0;i--) { // 123 -> 321
			newa *= 10;
			newa += arr[i];
		}

		for(int i=2;i>=0;i--) { // 123 -> 321
			newb *= 10;
			newb += brr[i];
		}
		
		if(newa > newb) {
			System.out.println(newa);
		} else if(newb > newa) {
			System.out.println(newb);
		}
		
	}
}
