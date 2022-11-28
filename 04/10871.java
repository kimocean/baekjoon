import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String nx = bf.readLine(); // 배열의개수 비교할수
		StringTokenizer st = new StringTokenizer(nx);
		int i = Integer.parseInt(st.nextToken()); // 배열의 개수
		int x = Integer.parseInt(st.nextToken()); // 비교할 수
		
		String sarr = bf.readLine(); // 한 줄로 입력받음
		st = new StringTokenizer(sarr);
		String arr[] = sarr.split(" "); // 공백 기준으로 배열 요소 분리해서 넣어 줌
//		System.out.println(Arrays.toString(arr));

		String imsi = "";
		
		for(int j=0;j<i;j++) {
			if(Integer.parseInt(arr[j]) < x) {
				imsi += arr[j] + " ";
			}
		}
		
		imsi = imsi.stripTrailing();
		
		bw.write(imsi);
		bw.flush();
		bw.close();
		
	}
}
