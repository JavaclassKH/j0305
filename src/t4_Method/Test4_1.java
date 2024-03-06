package t4_Method;

public class Test4_1 {
	String model;
	String color = "Black";
	String maxspeed;
	int speed;
	
	Test4_1(String model) {
		this.model = model;
		this.color = "흰색";
		this.maxspeed = "444km/h";
		this.speed = 444;
	}
	
	Test4_1(String model, String color) {
		this.model = model;
		this.color = color;
		this.maxspeed = "444km/h";
		this.speed = 444;
	}
	
	Test4_1(String model, String color,int speed) {
		this.model = model;
		this.color = color;
		this.maxspeed = "555km/h";
		this.speed = speed;
	}
}
