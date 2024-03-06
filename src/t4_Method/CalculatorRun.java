package t4_Method;

import java.util.Scanner;

// 두 수와 연산자를 입력하면 해당결과를 출력하는 프로그램
public class CalculatorRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 수 입력 : ");
			int su1 = sc.nextInt();
			
			System.out.print("연산자 입력 : ");
			String operator = sc.next();
			
			System.out.print("두번째 수 입력 : ");
			int su2 = sc.nextInt();
			
			
			Calculator calc = new Calculator();
			calc.calc(su1, su2, operator);
			
			System.out.println("계속 계산하시겠습니까?(Y/N) : ");
			String ans = sc.next();
			
			// if(ans.charAt(0) == 'N' || ans.charAt(0) == 'n') break;
			// if(ans.equals("N") || ans.equals("n")) break;
   		//if(ans.toUpperCase().equals("N")) break;
			if(ans.toLowerCase().equals("n")) break;
		}
		System.out.println("계산기를 종료합니다.");
	sc.close();
	}
}
