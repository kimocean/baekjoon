import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i=0;i<N;i++) {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int i1[], int i2[]) {
				if(i1[1] == i2[1]) {
					return i1[0] - i2[0];
				} else {
					return i1[1] - i2[1];
				}
			}
		});

		for(int i=0;i<N;i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}