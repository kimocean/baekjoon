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
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
//		boolean[] flag = new boolean[10];
		boolean[] flag = new boolean[1001];
		flag[0] = flag[1] = true;
		for(int i=2;i*i<=1001;i++) {
			if(!flag[i]) {
				for(int j=i+i;j<1001;j+=i) {
					flag[j] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int i=0;i<N;i++) {
			if(!flag[arr[i]]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}