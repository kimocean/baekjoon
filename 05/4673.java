import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public int d(int n) {
		int fullNum = n;
		int num[] = new int[4];
		int newNum = fullNum;
		for(int i=0;i<num.length;i++) {
			num[i] = fullNum % 10;
			fullNum = fullNum / 10;
		}
		for(int i=0;i<num.length;i++) {
			newNum += num[i];
		}
		return newNum;
	}
	
	public static void main(String[] args) {

		Main m = new Main();
		boolean[] check = new boolean[10001];
		Arrays.fill(check, false);
		
		for(int i=1;i<=10000;i++) {
			if(m.d(i) < 10001) {
				check[m.d(i)] = true;
			}
		}
		for(int i=1;i<=10000;i++) {
			if(check[i] != true) {
				System.out.println(i);
			}
		}
	}
}
