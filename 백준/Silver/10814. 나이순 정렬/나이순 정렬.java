import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static class Student {
		int age;
		String name;
		
		public Student() {}
		
		public Student(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Student[] student = new Student[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			student[i] = new Student(age, name);
		}
		
		Arrays.sort(student, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.age - s2.age; // asc 배열이니 양수일 때만(앞 요소가 뒤 요소보다 나이가 큰 경우에만) 순서 변경)
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			sb.append(student[i]);
		}
		
		System.out.println(sb);
		
	}
}