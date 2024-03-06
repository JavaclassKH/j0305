package t4_Method;

public class Test5_2 {
	void mod1() {
		System.out.println("안녕");	
	}
	
	int mod2(int su1) {
		//return 10;
		return su1; // 리턴값은 리턴타입에 맞는 값을 준다.
	}
	
	int mod1(int su1) { // 리턴타입은 오버로딩과 관계 X
		return su1;
	}
	
	int add(int su1 , int su2) { // 리턴타입은 오버로딩과 관계 X
		return su1+su2;
	}
	
	// 빼기 (sub)
	int sub(int su1 , int su2) {
		return su1 - su2;
	}
	// 곱하기 (mul)
	int mul(int su1 , int su2) {
		return su1 * su2;
	}
	// 나누기 (div)
	double div(double su1 , double su2) {
		return su1 / su2;
	}
	
	void prn(int su1,int su2, int res , String operator) {
		System.out.println(su1  + operator + su2+ " = " + res);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
