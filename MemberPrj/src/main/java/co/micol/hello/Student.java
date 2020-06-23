package co.micol.hello;

public class Student {
	private String name;
	private int age;
	private int gradeName;
	private int classname;
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
	public int getGradeName() {
		return gradeName;
	}
	public void setGradeName(int gradeName) {
		this.gradeName = gradeName;
	}
	public int getClassname() {
		return classname;
	}
	public void setClassname(int classname) {
		this.classname = classname;
	}
	
	public void getStudentInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("학년 : " + getGradeName());
		System.out.println("반 : " + getClassname());
	}
	
}
