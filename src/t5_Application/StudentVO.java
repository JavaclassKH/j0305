package t5_Application;

 class StudentVO { // Value Object(VO)객체 == 변수 관리하는 객체 || Data Transfer Object(DTO) == 데이터가 담긴 데이터베이스에서 자료를 꺼내오는 객체
	int no;
	String name;
	int age;
	boolean gender;
	String job;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}
