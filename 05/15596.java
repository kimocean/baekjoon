public class Test {
    long sum(int[] a) {
        int n = a.length;
		long ans = 0;
		for (int i=0;i<n;i++) {
			ans += a[i];
		}
		return ans; // 배열 a에 포함되어 있는 정수 n개의 합
    }
}
