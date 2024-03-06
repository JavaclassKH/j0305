package t4_Method;

import java.util.Scanner;

public class Test5Run {
	public static void main(String[] args) {
		
		Test5_1 t2 = new Test5_1();
		int res;
		double res2;
		
		t2.mod1(); 
		int atom = t2.mod2(50);
		System.out.println("atom : " + atom);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int su2 = sc.nextInt();
		
		res = t2.add(su1, su2);
		System.out.println(su1 + " + "+su2+" = " + res);
		
		res = t2.sub(su1, su2);
		System.out.println(su1 + " - "+su2+" = " + res);
		
		res = t2.mul(su1, su2);
		System.out.println(su1 + " * "+su2+" = " + res);
		
		res2 = t2.div(su1 , su2);
		System.out.printf("%d / %d = %.1f" , su1 , su2 , res2);
	}
}
