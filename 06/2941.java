import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String[] cwords = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
//		for(int i=0;i<word.length();i++) {
			for(int j=0;j<cwords.length;j++) {
				if(word.contains(cwords[j])) {
//					if(cwords[j] == "dz=") {
//						len -= 2;
//					} else {
//						len--;
//					}
					word = word.replace(cwords[j], "!"); // 크로아티아 문자열에 해당하는 것을 치환한 뒤 길이 계산
				}
			}
//		}
		
		int len = word.length();
		System.out.println(len);
	}
}
