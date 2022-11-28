import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();
		StringTokenizer st = new StringTokenizer(time, " ");
		int d1 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		int d3 = Integer.parseInt(st.nextToken());
		int rwd = 0;
		if(d1 == d2 && d2 == d3) {
			rwd = 10000+d1*1000;
		}  else if(d1 != d2 && d2 != d3 && d1 != d3) {
			if(d1 > d2) {
				if(d1 > d3) {
					rwd = d1*100;
				} else {
					rwd = d3*100;
				}
			} else if(d2 < d3) {
				rwd = d3*100;
			} else {
				rwd = d2*100;
			}
		} else if((d1 == d2 && d2 != d3)||(d1 == d3 && d2 != d3)) {
			rwd = 1000+d1*100;
		} else if (d2 == d3 && d1 != d2) {
			rwd = 1000+d2*100;
		}
		System.out.println(rwd);
	}

}
