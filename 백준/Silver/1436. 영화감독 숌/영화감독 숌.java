import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int num = 0;
		
		for(int i=666;i<Integer.MAX_VALUE;i++) {
			String str = i + "";
			if(str.contains("666")) {
				cnt++;
			}
			if(cnt == N) {
				num = i;
				break;
			}
		}
		
		System.out.println(num);
		
	}
}