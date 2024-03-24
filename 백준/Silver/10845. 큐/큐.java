import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		List<Integer> que = new ArrayList<Integer>();
		
		int first = 0; // 가장 앞 원소가 있는 위치
		int last = 0; // 가장 뒤 원소가 있는 위치
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
				case "push":
					que.add(Integer.parseInt(st.nextToken()));
					last++;
					break;
				case "pop":
					if(que.isEmpty() || last-first == 0) {
						System.out.println(-1);
					} else {
						System.out.println(que.get(first));
//						que.remove(first);
						first++;
					}
					break;
				case "size":
					System.out.println(last - first);
					break;
				case "empty":
					if(que.isEmpty() || last-first == 0) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				case "front":
					if(que.isEmpty() || last-first == 0) {
						System.out.println(-1);
					} else {
						System.out.println(que.get(first));
					}
					break;
				case "back":
					if(que.isEmpty() || last-first == 0) {
						System.out.println(-1);
					} else {
						System.out.println(que.get(last-1));
					}
					break;
			}
		}
	}
}