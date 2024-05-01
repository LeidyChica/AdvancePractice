
public class Human {
	
	String name;
	int age;
	double weight;
	
	Human(String name,int age, double weight){//Creacion de constructor, permiten crear objetos con diferentes cualidades
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {//Accede a los objetos desde su propia clase
		System.out.println(this.name+" is eating");
	}
	
	void drink() {
		System.out.println(this.name+" is drinking");
	}	
}