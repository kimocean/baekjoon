import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine(); // 소문자 단어 담는 변수
		char carr[] = new char[26]; // a~z 넣을 배열
		int arr[] = new int[26]; // 숫자 넣을 배열
		Arrays.fill(arr, -1); // 기본값을 -1로 설정...
		int asc = 97; // 아스키 코드 소문자 숫자 시작
		
		for(int i=0;i<carr.length;i++) { // carr 배열에 소문자 넣어 주는 코드
			carr[i] = (char)asc;
			asc++;
		}
		
		for(int i=0;i<carr.length;i++) { // a~z까지 돌기
			for(int j=0;j<word.length();j++) { // 단어 길이만큼 돌기
				if(word.charAt(j) == carr[i] && arr[i] == -1) { // 처음에 나오는 것만 넣어야 해서 -1일 때도 조건으로 걸어 줌
					arr[i] = j;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
//		System.out.println(Arrays.toString(carr));
//		System.out.println(Arrays.toString(arr));

	}
}
