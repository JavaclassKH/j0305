package t1_class;

// 블럭 안에 있는 변수: 지역변수 / 블럭 밖에 있는 변수: 전역변수
// void 는 메소드에만 작성 가능
public class Test1_val {
	int su3 = 10; //클래스 블럭에 있으므로, 메소드 블럭과 그 안의 모든 블럭에 영향을 주는 전역변수(필드)가 된다
	public void atom(){
		int su1=100;
		
		for(int i=0; i<5; i++) {
			int su2 = 200 * i;
			System.out.println(su1 + su2);
		}
		
		su3 += su1;
		System.out.println("su3 : " + su3);
	}
	
	
	
}
