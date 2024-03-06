package practicemyself;
import java.util.Scanner;

// 숙제3: 한글과 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어 단어를 입력받으면 한글로 출력하는 프로그램
// {{“love”, “사랑”} , {“java”, “자바”}}
public class Homework_3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] kor = {"사랑","자바","자동차","집","돈","나무","산","컴퓨터"};
		String[] eng = {"love","java","car","home","money","tree","mountain","computer"};
		String run , what , yes = "yes" , no = "no", end = "end";
		
		System.out.print("영한사전을 실행하시겠습니까?(yes,no)/종료는 end : ");
		run = sc.next();
		for(int i=0; i<2; i++) {
			if(run.equals(end)) System.out.println("영한사전을 종료합니다."); 
			if(run.equals(yes)) break;
			if(run.equals(no)) i--;
			else System.out.print("yes나 no로 입력해주세요");
		}
		
		System.out.print("궁금한 영어단어를 입력하세요 : ");
		what = sc.next();
		for(int i=0; i<=kor.length-1; i++) {
			for(int j=0; j<=eng.length-1; j++) {
				if(what.equals(eng[j])); break;  
			}
			System.out.println(what+"의 의미는 "+kor[i]+"입니다.");
		}	
		sc.close();
	}
}
