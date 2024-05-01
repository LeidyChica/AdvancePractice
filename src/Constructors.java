
public class Constructors {

	public static void main(String[] args) {

	Human human1 = new Human("Rick",65,70);
	Human human2 = new Human("Morty",16,50);
	
	//System.out.println(human2.age);
	
	//Para acceder a los objetos desde su propia clase
	human1.eat();
	human2.drink();
	}
}