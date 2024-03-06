//package t5_Application;
//import java.util.Scanner;
//
//public class StudentRun2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		
//		StudentVO vo = new StudentVO();
//		
//		System.out.print("번호를 입력하세요 : ");
//		vo.setNo(sc.nextInt());
//		//vo.no = (sc.next()); => 접근제한자로 인해 필드에 접근 불가
//		System.out.print("성명를 입력하세요 : ");
//		vo.setName(sc.next());
//		System.out.print("나이를 입력하세요 : ");
//		vo.setAge(sc.nextInt());
//		System.out.print("성별를 입력하세요(1:남/2:여) : ");
//		int choice = sc.nextInt();
//		if(choice == 1) vo.setGender(true);
//		else vo.setGender(false);
//		
//		System.out.print("직업를 입력하세요 : ");
//		vo.setJob(sc.next());
//		System.out.println();
//		
//		StudentService2 Service = new StudentService2();
//		Service.print(vo);
//		
//		System.out.println();
//		System.out.println("고생");
//		sc.close();
//		}
//}
