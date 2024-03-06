package t4_Method;

public class Test6_1Run {
	public static void main(String[] args) {
		
		int[] su = {90,80,100,70,60};
		
		Test6_1 t3 = new Test6_1(); // t3를 부르면 t3클래스 전부를 호출
		
		int res = t3.hap(su);
		
	  System.out.println("총합 : " + res);
		System.out.println();
		
		res = t3.sum(su);
		System.out.println("총합2 : " + res);
	
		res = t3.hap(new int[] {1,2,3,4,5});
		System.out.println("총합3 : " + res);
	
		res = t3.sum(new int[] {1,2,3,4,5});
		System.out.println("총합4 : " + res);
		
		// res = t3.hap({1,2,3,4,5}); // 안됨(오류)
		res = t3.sum(1,2,3,4,5);
		System.out.println("총합5 : " + res);
		
	
		
	}
}
