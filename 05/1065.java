import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 1~1000 사이로 입력받을 자연수. 이 안에서 한수 몇 개 있나 추출
		int cnt = 0; // 한수 개수 담을 변수
		int x = 0; // 자릿수 판별하기 위해...
//		if(n == 1000) {
//			x = 4;
//		} else if (n >= 100 && n <= 999) {
//			x = 3;
//		}
		
		for(int i=1;i<=n;i++) { // 1부터 입력받은 수까지 돌림
			
			int arr[] = new int[3]; // 100~1000까지 한 자리씩 담을... 이걸 포문 안에 넣어 줘야 함
			int temp = i;
			
			// 배열 for문 안에서 설정하는 이유: 밖에서 돌리면 210 넣었을 때 밑에 if문에서 210 고정으로 cnt++함
			for(int j=arr.length-1;j>=0;j--) {
				arr[j] = temp % 10; // arr[3]에 1의자리 넣음. 1234였으면 4.
				temp /= 10; // n을 n / 10의 몫으로 설정. 1234였으면 123.
			}
			
			if(i < 100) { // 1~99까지는 한수.
				cnt++;
			}
			else if(i >= 100 && i < 1000) {
				if((arr[0] - arr[1] == arr[1] - arr[2])) {
					cnt++;
//					System.out.println(Arrays.toString(arr));
				}
			} 
			
			// 어차피 1000이랑 999 결과 똑같아서 배제하는 게 마음 편함...
//			else if(x == 4) {
//				if(i < 1000) {
//					if((arr[0] - arr[1] == arr[1] - arr[2])) {
//						cnt++;
//					} else if(i == 1000) {
//						if((arr[0] - arr[1] == arr[2] - arr[3]) && (arr[1] - arr[2] == arr[2] - arr[3])) {
//							cnt++;
//						}
//					}
//				}
//				
//			}
		}
		
		System.out.println(cnt);
		
	}
}
