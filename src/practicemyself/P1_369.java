	package practicemyself;

public class P1_369 {
	public static void main(String[] args) {
	 String[] num = new String[100];	
	 int sw;
	 String temp;  
	 
	 // num[]배열에 3,6,9대신에 "짝" 문자를 저장
	 for(int i=0; i<num.length; i++) {
		 num[i] = (i + 1) + "";     //문자와 숫자 결합은 '문자'
		 temp = "";   // 참조타입은 초기값이 있어야 처리가 되니 ("")를 사용
		 sw = 0;
		 
		 for(int j=0; j<num[i].length(); j++) {
			 if(num[i].charAt(j)=='3'||num[i].charAt(j)=='6'||num[i].charAt(j)=='9') {
				 temp +=  "짝";
				 sw = 1;
			 }
		 }
		 if(sw == 1) num[i] = temp;			 
	 }
	 // num[]배열에 저장된 값을 10개씩 출력
	 for(int i=0; i<num.length; i++) {
		 System.out.print(num[i] + " / ");
		 if((i+1) % 10 == 0) System.out.println();
	 }
	}
}
