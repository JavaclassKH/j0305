package t1_array;

public class Test5_Bubble {
	public static void main(String[] args) {
		int[] m = {5,2,6,8,4,7};
		int temp = 0;
		
		System.out.print("원본자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				if(m[j-1] > m[j]) {
					temp = m[j-1];
					m[j-1] = m[j];
					m[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("정렬자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
		
		
	}
}
