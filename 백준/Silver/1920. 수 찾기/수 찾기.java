import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		
		// 왼쪽(가장 작은 값)이 오른쪽(가장 큰 값)보다 커지기 전까지 반복
		while(low <= high) {
			int mid = (low + high) / 2; // 중간 인덱스 구하기. int는 소수점 버리므로 7/2=3이 됨.
			
			if(key > arr[mid]) { // key가 중간값보다 큰 경우(오른쪽)
				low = mid + 1;
			} else if(key < arr[mid]) { // key가 중간값보다 작은 경우(왼쪽)
				high = mid - 1;
			} else { // key가 중간값과 동일한 경우
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine()); // 행의 개수
		int arr[] = new int[A];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<A;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine()); // 열의 개수
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<M;i++) {
//			binarySearch(arr, Integer.parseInt(st.nextToken()));
			if(binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
}