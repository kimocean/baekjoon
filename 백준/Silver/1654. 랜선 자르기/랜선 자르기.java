import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken()); // 이미 가진 랜선의 개수
		int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수
		
		// 이미 가진 랜선 길이를 담는 배열
		int[] arr = new int[K];
		
		long max = 0;
		
		// 입력 + 최댓값 비교
		for(int i=0;i<K;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		// max+1(upperbound+1) 값이어야 함
		max++;
		
		long min = 0;
		long mid = 0;
		
		while(min < max) {
			
			// 범위 내의 중간 길이 구함
			mid = (max + min) / 2;
			 
			// 랜선 길이를 중간값으로 나누었을 때 랜선 몇 개가 만들어지는지 저장하는 변수
			long cnt = 0;
			
			// 구해진 중간 길이로 잘라서 총 몇 개의 랜선이 만들어지는지 구함
			for(int i=0;i<arr.length;i++) {
				cnt += (arr[i] / mid);
			}
			
			// upperBound
			// mid 길이로 잘랐을 때 필요한 랜선의 개수(N)보다 작으면 자르고자 하는 길이를 줄이기 위해 최대 길이를 줄여야 함
			// 그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘림
			
			if(cnt < N) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		
		// 이름만 min이고 실제 가진 값은 upperBound임
		// 원하는 랜선의 개수를 만들 수 없는 랜선의 길이 중 가장 작은 값 - 1 = 원하는 랜선의 길이를 만들 수 있는 가장 큰 값
		System.out.println(min - 1);
		
	}
}

/*
UpperBound 추가 설명

이 문제에서는 랜선의 최대 길이를 찾고 있습니다.
따라서 '최소값’은 가능한 랜선의 최소 길이, '최대값’은 가능한 랜선의 최대 길이를 나타냅니다.
'중간값’은 이 두 값의 평균입니다.

mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면, 자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
예를 들어, 우리가 만들고자 하는 랜선의 개수가 10개이고, 현재 고려하고 있는 랜선의 길이(mid)로 랜선을 잘랐을 때 8개의 랜선만 만들 수 있다면, 우리는 더 짧은 랜선을 만들어야 합니다.
왜냐하면 같은 길이의 랜선을 더 많이 만들려면 각 랜선을 더 짧게 잘라야 하기 때문입니다.
이를 위해 우리는 max 값을 mid 값으로 줄입니다.
이렇게 하면 검색 범위가 줄어들고, 다음 mid 값은 더 작아집니다.

그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
반대로, 우리가 만들고자 하는 랜선의 개수가 10개이고, 현재 고려하고 있는 랜선의 길이(mid)로 랜선을 잘랐을 때 12개의 랜선을 만들 수 있다면, 우리는 더 긴 랜선을 만들 수 있습니다.
왜냐하면 더 긴 랜선을 만들어도 원하는 개수를 충족시킬 수 있기 때문입니다.
이를 위해 우리는 min 값을 mid + 1로 늘립니다.
이렇게 하면 검색 범위가 줄어들고, 다음 mid 값은 더 커집니다.
*/