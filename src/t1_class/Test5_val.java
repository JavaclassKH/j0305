package t1_class;

// 블럭 안에 있는 변수: 지역변수 / 블럭 밖에 있는 변수: 전역변수
public class Test5_val {
	public static void main(String[] args) {
		int su1=100 , su3;
		
		for(int i=0; i<5; i++) {
			int su2 = 200 * i;
			System.out.println(su1 + su2);
		}

	}
}
