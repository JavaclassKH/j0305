package practicemyself;
import java.util.Scanner;

// 숙제3: 한글과 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어 단어를 입력받으면 한글로 출력하는 프로그램
// {{“love”, “사랑”} , {“java”, “자바”}}
public class Homework_3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] kor = {{"사랑","love"},{"자바","java"},{"자동차","car"},{"집","home"}
		,{"돈","money"},{"나무","tree"},{"산","mountain"},{"컴퓨터","computer"}};
		String go;
		String yes = "yes" , no = "no" , end = "end";
		
		System.out.print("영한사전을 실행하시겠습니까?(yes,no)/종료는 end : ");
		go = sc.next();
		for(int i=0; i<1; i++) {
			if(go.equals(end)) i++;
			if(go.equals(yes)) break;
			if(go.equals(no)) i--;
			else System.out.print("yes나 no로 입력해주세요");
		}
		 System.out.println("영한사전을 종료합니다."); 
		
		System.out.print("궁금한 영어단어를 입력하세요 : ");
		go = sc.next();
		for(int i=0; i<=kor.length; i++) {
			for(int j=0; j<=kor.length; j++) {
				if(go.equals(kor[i][1])); break;  
			}
			System.out.println(go+"의 의미는 "+kor[i][1]+"입니다.");
		}	
		sc.close();
	}
}
