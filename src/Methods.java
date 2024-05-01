
public class Methods {

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		//String name = "Bro";//Usado solo para la parte 2
		//int age = 21;//Usado solo para cuando hay name y age
		
		//hello();
		//hello(name);//Usado solo para la parte 2
		//hello(name,age);//Usado solo para la parte 2
		
		int x = 3;
		int y = 4;
		
		System.out.println(add(x,y));
		
		int z = add(x,y);
	}
	
	/*static void hello() { //se debe de poner 'static' si el metodo se esta llamando arriba en el public static, si no no
		System.out.println("Hello");*/
		
	/*static void hello(String name) { //Usado solo para la parte 2
		System.out.println("Hello "+name);*/
		
	/*static void hello(String name, int age) { //Usado solo cuando hay name y age
		System.out.println("Hello "+name);
		System.out.println("You're "+age);}*/
	
	//OTRO EJEMPLO #3
	
	static int add(int x, int y) {
		
		int z = x+y;
		return z;
		}
}
	
	