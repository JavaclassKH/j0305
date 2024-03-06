package t3_Constructor;

// 생성자는 반드시 ()와 실행 블록 {}을 가짐 
// 사용자가 생성한 클래스가 하나라도 있으면 기본 생성자를 생성하지 않음!!
public class Test2 {

	Test2() {}	

	Test2(int su1) {}	// 타입
	
	Test2(int su1,int su2) {}	// 개수
	
	Test2(int su1, double su2) {}	// 순서
	
	Test2(double su2, int su1) {}	// 순서

}