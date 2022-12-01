import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine(); // 할머니가 외우는 글자
		int asc = 65;
		char[] abc = new char[26];
		int arr[] = new int[word.length()]; // 글자당 알파벳 인덱스 저장하는 배열
		
		for(int i=0;i<abc.length;i++) { // 알파벳 배열 만들기
			abc[i] = (char)asc;
			asc++;
		}
		
		for(int i=0;i<word.length();i++) { // 단어 글자마다 돌면서
			for(int j=0;j<abc.length;j++) {
				if(word.charAt(i) == abc[j]) { // 알파벳 뭔지 발견하면
					arr[i] = j; // 배열에 인덱스 넣어 줌
//					System.out.println(j + " " + abc[j]);
				}
			}
		}
		
//		System.out.println(Arrays.toString(arr));
		
		int num = 0; // 걸리는 시간(초)
		
		for(int i=0;i<arr.length;i++) {
			num += 1; // 기본적으로 번호에 +1이므로
			switch(arr[i]) {
				case 0: case 1: case 2:
					num += 2;
					break;
				case 3: case 4: case 5:
					num += 3;
					break;
				case 6: case 7: case 8:
					num += 4;
					break;
				case 9: case 10: case 11:
					num += 5;
					break;
				case 12: case 13: case 14:
					num += 6;
					break;
				case 15: case 16: case 17: case 18:
					num += 7;
					break;
				case 19: case 20: case 21:
					num += 8;
					break;
				case 22: case 23: case 24: case 25:
					num += 9;
					break;
			}
		}
		
		System.out.println(num);
		
	}
}
