package practicemyself;

// 1~100까지의 수를 출력하시오(단, 10번째 숫자가 나올 때마다 줄을 바꾸시오.)
public class P3 {
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if(i % 10 == 0) System.out.println();
		}
		
		
		
		
	}
}
