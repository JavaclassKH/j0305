package t4_Method;

public class Test4_2 {
	String model;
	String color = "Black";
	String maxspeed;
	int speed;
	
	Test4_2(String model) {
		this(model , "무지개" , 250);
	}
	
	Test4_2(String model , String color) {
		this(model , color , 250); // this()는 현재 클래스의 생성자
	}
	
	Test4_2(String model , String color , int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
