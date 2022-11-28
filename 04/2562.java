import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		int max = 0;
		int num = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				num = i + 1;
			}
		}
		
		bw.write(max + "\n");
		bw.write(num + "");
		bw.flush();
		bw.close();
		
	}
}
