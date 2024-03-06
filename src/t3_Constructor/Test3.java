package t3_Constructor;

// 생성자는 반드시 ()와 실행 블록 {}을 가짐 
// 사용자가 생성한 클래스가 하나라도 있으면 기본 생성자를 생성하지 않음!!
public class Test3 {

	Test3() {}	// #1

	int atom = 30;
	int atom2;
	double atom3;
	
	Test3(int su1) {	
		System.out.println("su1 : " +su1);
	}	// 타입 #2
	
	Test3(int su1,int su2) {
		atom = su1;
		atom2 = su2;
	}	// 개수
	
	Test3(int atom, double atom3) {
		this.atom = atom;  // this라는 예약어를 적으면 클래스의 필드를 가리킴
		atom3 = atom3;
	}	// 순서
	
	Test3(double su2, int su1) {}	// 순서

}