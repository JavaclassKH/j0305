package t4_Method;

public class Test1 {

	int su1;
	double su2;
	String name = "이규희";

	Test1() {}
	
	Test1(int su1){
		this.su1 = su1;
	}
	
	void mod1() {
		
	}
	
	void mod1(int su1) {
		this.su1 = su1;
	}

	void mod1(int su1, double su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void Mod2() {
		System.out.println("안녕하세요~");
	}
	
	void Mod3() {
		//System.out.println(this.name + "님 안녕하세요~");
		System.out.println(name + "님 안녕하세요~"); // 매개변수가 없으면 필드를 봄
	}
	
	void Mod3(String name) {
		System.out.println(name + "님 안녕하세요~");
	}
	
	void Mod4(String name) {
		System.out.println(this.name+"님 안녕하세요~");
		System.out.println(name+"님 안녕하세요~");
	}
	
	void Mod5(int i) {
		System.out.println(i + "번 고객님! 안녕하세요~");
	}
	
	// 3의 배수가 되면 메소드 종료처리하세요.
	void Mod6() {
	 int i = 0;
	 while(i<5) {
		 i++;
		System.out.println(i + "번 고객님! 안녕하세요~");
		//if(i % 3 == 0) break;;
		if(i % 3 == 0) return;
		System.out.println("작업 중!!!!!!!!!");
	 }
	 System.out.println("작업 끝~~!");
	}
}