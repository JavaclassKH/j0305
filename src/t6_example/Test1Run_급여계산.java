package t6_example;
import java.util.Scanner;

/*
 사원코드(no), 사원명(name), 직급코드(code), 초과시간(overTime) 입력받아서 실수령액(netpay)을 계산하시오. 
 직급코드와 초과시간을 입력받아서 실수령액을 계산하시오.
 직급코드: 부장(B/b) 과장 (K/k) 대리(D/d) 사원(S/s)
 1시간당 초과 수당은 25,000원이다.
 공제액(gongje) = (본봉(bonbong)+초과수당(sudang))의 10%로 한다
 본봉 = 부장:5000000 / 과장: 4000000 / 대리: 3000000 / 사원: 2000000 
 실수령액 = 본봉 + 수당 - 공제액
 ※ 계산부는 비즈니스로직으로 처리(서비스객체를 사용)
  
 */
public class Test1Run_급여계산 {
	public static void main(String[] args) {
		Test1_VO vo = new Test1_VO();
		Test1_급여계산기Service ser = new Test1_급여계산기Service();
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("사원코드를 입력하세요 : ");
		vo.setNo(sc.nextInt());
		System.out.print("사원명을 입력하세요 : ");
		vo.setName(sc.next());
		System.out.print("직급코드를 입력하세요 : ");
		vo.setCode(sc.next());
		System.out.print("초과시간을 입력하세요 : ");
		vo.setOverTime(sc.nextInt());
		System.out.println();
		
		System.out.println("사원코드: " + vo.getNo());
		System.out.println("사원명: " + vo.getName());
		System.out.println("직급코드: " + vo.getCode());
		System.out.println("초과시간: " + vo.getOverTime() + "시간");	
		
		vo.setBonbong(ser.bonbongCheck(vo.getCode()));
		vo.setGongje(ser.gongjeCheck(vo.getBonbong(),vo.getSudang()));
		vo.sudanglast(ser.sudanglastCheck(vo.getOverTime(),vo.getSudang()));
		vo.setNetpay(ser.netpayCheck(vo.getBonbong(),vo.getSudang(),vo.getGongje()));
		ser.pr(vo.getName(),vo.getNetpay());	
		
		sc.close();
	}
}

