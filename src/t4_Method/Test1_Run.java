package t4_Method;

public class Test1_Run {
	public static void main(String[] args) {
		Test1 t1_1 = new Test1();
		System.out.println("t1_1.su1 : " + t1_1.su1);
		System.out.println("t1_1.su2 : " + t1_1.su2);
		System.out.println();
		
		Test1 t1_2 = new Test1(100);
		System.out.println("t1_1.su1 : " + t1_2.su1);
		System.out.println("t1_1.su2 : " + t1_2.su2);
		System.out.println();
		
		t1_2.mod1(500);
		t1_2.mod1(500,600);
		System.out.println("t1_1.su1 : " + t1_2.su1);
		System.out.println("t1_1.su2 : " + t1_2.su2);
		System.out.println();
		
		t1_1.Mod2();
		t1_2.Mod2();
		System.out.println();
		
		t1_1.Mod3();
		t1_2.Mod3("탁민아");
		t1_2.Mod4("엄준식");
		System.out.println();
		
		for(int i=0; i<5; i++) {
			t1_2.Mod2();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			t1_2.Mod5((i+1));
		}
		System.out.println();
		
		t1_2.Mod6();
		
		
		
		
		
		
		
		
		
	}
}
