package t1_class;

public class Test4 {
	public static void main(String[] args) {
		
		Test999 t1 = new Test999();
		Test999 t2 = new Test999(); 
		
		if(t1 == t2) {
			System.out.println("t1과 t2는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1과 t2는 서로 다른 객체입니다.");
		}
		
		Test999 t3;
		t3 = t1;
		if(t1 == t3) {
			System.out.println("t1과 t3는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1과 t3는 서로 다른 객체입니다.");
		}
		
		Test999 t4 = null;
		if(t1 == t4) {
			System.out.println("t1과 t3는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1과 t3는 서로 다른 객체입니다.");
		}
		
		if(t4 == null) {
			System.out.println("t4는 null입니다");
		}
		else {
			System.out.println("t4는 null이 아닙니다");
		}
		
		// null 비교시에는 " == / !=" 로 비교해야 한다. 아래는 실행오류 발생(아무 값도 없어서 비교 불가)
//		if(t4.equals(null)) {
//			System.out.println("t4는 null입니다");
//		}
//		else {
//			System.out.println("t4는 null이 아닙니다");
//		}
	}
}
