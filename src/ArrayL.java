import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		
	// ArrayList = 	a resizable array
	// The elements can be added and removed after compilation phase 
	// store reference data types

	ArrayList<String> food = new ArrayList<String>();

	food.add("pizza");
	food.add("hamburger");
	food.add("hotdog");
	
	//food.set(0, "sushi");//Reemplaza la pizza por el sushi
	//food.remove(2);//Remueve el elemento de la posicion 2
	//food.clear();//Elimina todos los elementos de la lista
	
	for(int i=0; i<food.size(); i++) { 
		System.out.println(food.get(i));
		}
	}
}
