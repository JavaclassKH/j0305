package practicemyself;
import java.util.Scanner;

//가위바위보게임 : 컴퓨터에게 랜덤하게 "가위,바위,보" 중 하나를 기억시켜놓고, 사용자가 가위바위보를 입력하면
//누가 이겼는지를 출력처리한다. (단, "그만"을 입력하면 프로그램을 종료처리한다.)
public class P1_rsp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" # 가위/바위/보 게임 # ");
		
		while(true) {
			int computer = (int)(Math.random() * 3) + 1;  // 1:가위 2:바위 3:보
			int na;
			
			System.out.print("1:가위 2:바위 3:보를 입력하세요?(0:종료) ==> ");
			na = sc.nextInt();
			if(na == 0) break;
			
			int temp = na - computer;
			
			if(temp == 0) System.out.println("컴퓨터와 비기셨습니다.");
			else if(temp == 1 || temp == -2) System.out.println("이기셨습니다!");
			else System.out.println("졌습니다~");
			
			System.out.print("게임을 계속 하시겠습니까?(Y/N)");
			String yn = sc.next();
			if(yn.equals("N") || yn.equals("n") ) break;
			
		}
		System.out.println("게임을 종료합니다");
		
		sc.close();
	}
}
