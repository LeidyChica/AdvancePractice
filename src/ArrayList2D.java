import java.util.*;


public class ArrayList2D {

	public static void main(String[] args) {
		
		ArrayList<String> bakeryList = new ArrayList();

		bakeryList.add("Pasta");
		bakeryList.add("Garlic bread");
		bakeryList.add("Donuts");
		
		ArrayList<String> produceList = new ArrayList();

		produceList.add("Tomatoes");
		produceList.add("Peppers");
		produceList.add("Onions");
		
		ArrayList<String> drinkList = new ArrayList();

		drinkList.add("Soda");
		drinkList.add("Coffee");
		
		//System.out.println(bakeryList.get(0));//Muestra un elemento especifico de una posicion de la lista
		//System.out.println(bakeryList);Muestra todos los elementos de la lista
		
		//CREACION DE LA LISTA DE LISTAS (GroceryList)
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		//System.out.println(groceryList.get(1));//Obtiene solo la lista en la posicion 1
		//System.out.println(groceryList.get(2).get(1));//Obtiene el elemento en posicion 1 de la lista 2




		

	}

}
