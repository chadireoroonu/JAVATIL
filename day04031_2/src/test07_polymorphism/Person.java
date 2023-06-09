package test07_polymorphism;

public class Person extends Object {
	String name;
	int age;
	
	// 파라미터가 있는 생성자 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
	// 우클릭 -> Source -> Generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
