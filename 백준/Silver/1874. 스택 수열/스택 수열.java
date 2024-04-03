import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		int start = 0;
		int idx = 0;
		while(N-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if(num > start) {
				for(int i=start+1;i<=num;i++) {
					arr[idx] = i;
					idx++;
					sb.append("+").append("\n");
				}
				start = num;
			} else if(arr[idx-1] != num) {
//				System.out.println(arr[start-1] + " " + num);
				System.out.println("NO");
				return;
			}
			sb.append("-").append("\n");
			idx--;
		}
		System.out.println(sb);
	}
}