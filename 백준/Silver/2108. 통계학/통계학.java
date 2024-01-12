import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		// 산술평균 : N개의 수의 합을 N으로 나눈 값
		// 중앙값 : N개의 수를 증가하는 순서로 나열할 경우 그 중앙에 위치하는 값
		// 최빈값 : N개의 수 중 가장 많이 나타나는 값
		// 범위 : N개의 수 중 최댓값과 최솟값의 차이
		
		int sum = 0;
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		// 카운팅 정렬
		int cntArr[] = new int[8001]; // 수의 범위, 인덱스 통해 개수 확인
		int newArr[] = new int[N]; // 정렬될 배열
		
		for(int i=0;i<N;i++) {
			// arr의 value를 index로 하는 cnt 배열 증가
			cntArr[arr[i]+4000]++;
		}
		
		for(int i=1;i<8001;i++) {
			// 누적합
			cntArr[i] += cntArr[i-1];
		}
		
		for(int i=N-1;i>=0;i--) {
			// i번째 원소를 인덱스로 하는 cnt 배열을 1 감소시킨 뒤  cnt 배열의 값을 인덱스로 하여 result에 value를 저장함
			int value = arr[i];
			cntArr[value+4000]--;
			newArr[cntArr[value+4000]] = value;
		}
		
		int cnt = 0; // 현재 i의 빈도 수
		int max = -1; // 지금까지 발견한 가장 높은 빈도수 
		int mod = newArr[0]; // 최빈값
		boolean flag = false; //true가 되어야 한 번 나오는 것
		
		for(int i=0;i<N-1;i++) {
			if(newArr[i] == newArr[i+1]) {
				cnt++; // 이미 정렬된 상태이므로 앞에 거랑만 비교해도 됨
			} else {
				cnt = 0;
			}
			
			if(max < cnt) { // 가장 높은 빈도수보다 현재 빈도수가 크면
				max = cnt; // max를 더 높은 수로 갱신
				mod = newArr[i]; // 현재 수를 최빈도 변수에 저장
				flag = true; // 처음 나오는 거면 true로 설정
			} else if(max == cnt && flag == true) { // 현재 최빈도와 이전 최빈도가 같고 / 이전 최빈도가 유일한 최빈도인 경우
				mod = newArr[i]; 
				flag = false;
			}
		}
		
		System.out.println((int)Math.round((double)sum / N));
		System.out.println(newArr[N/2]);
		System.out.println(mod);
		System.out.println(newArr[N-1] - newArr[0]);
		
	}
}