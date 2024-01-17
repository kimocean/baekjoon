import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
//		int L = Integer.parseInt(br.readLine());
		String num = br.readLine();

		while (!num.equals("0")) {
			boolean flag = true;
			
			for(int i=0;i<num.length();i++) {
				if(num.charAt(i) != num.charAt(num.length()-1-i)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
						
			num = br.readLine();
		}
	}
}