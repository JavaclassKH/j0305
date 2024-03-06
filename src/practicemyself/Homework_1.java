package practicemyself;

// 숙제1: 1~45 숫자 중 6개의 수를 추출 후 정렬해서 출력하시오. (중복 배제)
public class Homework_1 {
	public static void main(String[] args) {
		// 선언부 (배열용 변수(su),정렬용 자리바꿈 변수(temp) 선언)
		int[] six = new int[46];
		int su = 0;
		int temp = 0;
		
		// 입력부 
		for(int i=1; i<=six.length; i++) {
			su = (int)(Math.random() * 45) + 1;
			six[i] = su;
			for(int j=1; j<=6; j++) {	
				if(six[i] == six[j]); // 만약 같은 주소에 같은 값이 들어간다면 i--;를 통해 for문이 다시 돌아가게 함(중복 배제)
				i--; break;
			}
		}
		
		// 정렬부 (오름차순 정렬)
		for(int i=1; i<=six.length-1; i++) {
			for(int j=i+1; j<=six.length; j++) {
				if(six[i-1] > six[j-1]) {
					temp = six[i-1];  six[i-1] = six[j-1];  six[j-1] = temp;
					temp = six[i-1];  six[i-1] = six[j-1];  six[j-1] = temp;
				temp = six[i-1];  six[i-1] = six[j-1];  six[j-1] = temp;
				}
			}	
		}
			
		// 출력부
		for(int i=0; i<=5; i++) {
			System.out.print(six[i] + " / ");
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

