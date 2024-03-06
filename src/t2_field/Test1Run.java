package t2_field;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1(); // 참조 타입 객체이므로 기본 타입 변수의 초기값이 들어감
		
		System.out.println(t1.su1);
		System.out.println(t1.su2);
		System.out.println(t1.d1);
		System.out.println(t1.d2);
		System.out.println(t1.l1);
		System.out.println(t1.l2);
		System.out.println(t1.su2);
		System.out.println();
		
		Test2 t2 = new Test2();
		System.out.println("t2.name : " +t2.name);
		
		Test2 t3 = new Test2();
		System.out.println("t3.name : " +t2.name);
		t3.name = "이규희";
		System.out.println("t3.name : " +t3.name);
		Test2 t4 = new Test2();
		System.out.println("t3.name : " +t2.name2);
	}
}
