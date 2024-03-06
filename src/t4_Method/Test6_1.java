package t4_Method;

public class Test6_1 {

	public int hap(int[] su) {	
		int hap = 0;		
		for(int i=0; i<su.length; i++) {
			hap += su[i];
		}	
		return hap;
	}
	// "..." 배열 처리가 가능한 연산자
	public int sum(int ... su) {
		int sum = 0;
		for(int i=0; i<su.length; i++) {
			sum += su[i];
		}		
		return sum;
	}
}
