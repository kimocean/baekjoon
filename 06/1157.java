import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();
		char[] abc = new char[26]; // A~Z 담는 배열
		int[] arr = new int[26]; // 누적 구하는 거
		int asc = 65;
		
		for(int i=0;i<abc.length;i++) { // A~Z 담아주기
			abc[i] = (char) asc;
			asc++;
		}
		
		for(int i=0;i<word.length();i++) { // 단어의 길이만큼 돌면서
			for(int j=0;j<abc.length;j++) { // A~Z Rkwl
				if(word.charAt(i) == abc[j] || word.charAt(i) == abc[j]+32) { // 대소문자 비교해서 같으면
					arr[j]++; // 인덱스 동일한 배열에 누적해줌
				}
			}
		}
		
		// max를 구함. 다음에 max랑 같은 게 2개 이상이면 ? 출력. 1개면 대문자 출력.
		
		int max = -1;
		int cnt = 0;
		int maxIndex = -1;
		for(int i=0;i<arr.length;i++) { // max 구하는 for문
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		
		for(int i=0;i<arr.length;i++) { // max랑 같은 게 몇 개인지 구하는 for문. cnt가 1이어야 단독.
			if(max == arr[i]) {
				cnt++;
			}
		}
		
		if(cnt > 1) {
			bw.write("?");
		} else {
			bw.write(abc[maxIndex] + "");
		}
		
//		bw.write(Arrays.toString(abc) + "\n");
//		bw.write(Arrays.toString(arr) + "\n");
//		bw.write(max + " ");
//		bw.write(cnt + " ");
//		bw.write(maxIndex + " ");
		
		bw.flush();
		bw.close();
		
	}
}
