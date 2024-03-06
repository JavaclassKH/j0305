package practicemyself;

// 숙제1: 1~45 숫자 중 6개의 수를 추출 후 정렬해서 출력하시오. (중복 배제)
public class Homework1_1 {
	public static void main(String[] args) {
		// 선언부 (배열용 변수(su),정렬용 자리바꿈 변수(temp))
		int[] su = new int[6];
		int temp = 0;
		
		// 입력부 
		for(int i=0; i<su.length; i++) {
			su[i] = (int)(Math.random() * 45) + 1;	
			for(int j=0; j<su.length; j++)
			if(su[i] == su[i]) i--;  // 시간은 가고.. 여기가 계속 틀렸다고 하고... 화장실.. 의식의 흐름...
		}
		// 정렬부 (오름차순 정렬)
		// su[1]일때 su[2]를 비교하여 
		for(int i=0; i<=5; i++) {
			for(int j=i+1; j<=su.length; j++) {
				if(su[i] < su[j-1]) temp = su[i];  su[i] = su[j-1];  su[j] = temp;
			}
		}
		
		// 출력부
		for(int i=0; i<=5; i++) {
			System.out.print(su[i] + " / ");
		}
	}
}

// 오름차순 정렬
// for(int i=1; i<=s.length-1; i++) {
// for(int j=i+1; j<=no.length; j++) {
//	if(rank[i-1] > rank[j-1]) {
//		temp = rank[i-1];  rank[i-1] = rank[j-1];  rank[j-1] = temp;
//		temp = no[i-1];  no[i-1] = no[j-1];  no[j-1] = temp;
//		temp = s[i-1];  s[i-1] = s[j-1];  s[j-1] = temp;

