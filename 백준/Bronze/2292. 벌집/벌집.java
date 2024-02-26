import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		if(N == 1) {
			System.out.println(1);
		} else {
			while(N > 1) {
				N -= 6*cnt;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}

/*
1 : 1 / 1개
2~7 : 2 / 6개
8~19 : 3 / 12개
20~37: 4 / 18개
6의 0제곱(?), *1, *2...
이걸 어떻게 식으로..

*/