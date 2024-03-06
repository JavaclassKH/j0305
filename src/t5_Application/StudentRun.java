package t5_Application;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no;
		String name;
		int age;
		boolean gender;
		String job;
		int choice;
		
		System.out.print("번호를 입력하세요 : ");
		no = sc.nextInt();
		System.out.print("성명를 입력하세요 : ");
		name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("성별를 입력하세요(1:남/2:여) : ");
		choice = sc.nextInt();
		if(choice == 1) gender = true;
		else gender = false;
		
		System.out.print("직업를 입력하세요 : ");
		job = sc.next();
		System.out.println();
		
		StudentService Service = new StudentService();
		Service.print(no,name,age,gender,job);
		
		System.out.println();
		System.out.println("고생");
		
		sc.close();
		}
}
