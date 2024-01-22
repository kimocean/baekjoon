import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) { // 길이가 같을 경우
					return s1.compareTo(s2); // 사전순 정렬 - compareTo는 String 자동 사전순 정렬
				} else {
					return s1.length() - s2.length(); // 양수면 위치 변경, 음수나 0은 안 바꿈
				}
			}
		});
		
		System.out.println(arr[0]);
		
		for(int i=1;i<N;i++) {
			// 중복 제외 출력 - 동일한 단어는 나란히 있을 거니까
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
		
		
	}
}