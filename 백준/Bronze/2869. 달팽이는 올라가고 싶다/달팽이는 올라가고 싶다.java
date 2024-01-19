import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		int A = s.nextInt(); // 낮에 올라가는 높이
//		int B = s.nextInt(); // 밤에 내려가는 높이
//		int V = s.nextInt(); // 나무 막대 길이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = (V-B) / (A-B);
		
		if((V-B) % (A-B) != 0) {
			day++;
		}
		
		System.out.println(day);

//		s.close();
	}
}

/*
https://hyunipad.tistory.com/58
day 도출 공식은 위 블로그 참조

*/