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

		int yes[] = new int[28];
//		int no[] = new int[2];

		for (int i = 0; i < yes.length; i++) {
			yes[i] = Integer.parseInt(bf.readLine());
		}

		int all[] = new int[30];
		for (int i = 0; i < 30; i++) {
			all[i] = i + 1;
		}

		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < yes.length; j++) {
				if (all[i] == yes[j]) {
					all[i] = 0;
				}
			}
		}
		
		for(int i=0;i<all.length;i++) {
			if(all[i] != 0) {
				bw.write(all[i] + "\n");
			}
		}
		
		Arrays.sort(all);

//		for (int j = 0; j < no.length; j++) {
//			for (int i = 0; i < all.length; i++) {
//				if (all[i] != 0) {
//					no[j] = all[i];
//				}
//			}
//		}

//		bw.write(all[28] + "\n");
//		bw.write(all[29] + "");
		bw.flush();
		bw.close();

	}
}
