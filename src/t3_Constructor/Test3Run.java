package t3_Constructor;

public class Test3Run {
	public static void main(String[] args) {
		Test3 t3_1 = new Test3(); // 서로 다른 객체
		Test3 t3_2 = new Test3(100); // 서로 다른 객체
		
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		System.out.println();
		
		t3_1.atom = 500;
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		System.out.println();
		
		t3_2.atom = 600;
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		System.out.println();
		
		Test3 t3_3 = new Test3(10,20); //매칭! int가 2개 선언된 것과 매칭
		System.out.println("t3_3.atom : " +t3_3.atom);
		System.out.println("t3_3.atom : " +t3_3.atom2);
		System.out.println();
		
		t3_3.atom = -100;
		t3_3.atom2 = -200;
		System.out.println("t3_3.atom : " +t3_3.atom);
		System.out.println("t3_3.atom : " +t3_3.atom2);
		System.out.println();
		
		Test3 t3_4 = new Test3(70, 3.14);
		System.out.println("t3_4.atom : " +t3_4.atom);
		System.out.println("t3_4.atom : " +t3_4.atom3);
		System.out.println();
		
	}
}
