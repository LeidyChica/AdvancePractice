
public class Arrays {

	public static void main(String[] args) {

	// array = used to store multiple values within a single variable
	
	/*String[] cars = {"Camaro","Corvette","Tesla","BMW"};
	
	System.out.println(cars[1]);*/
		
	// OTRA FORMA 
		
	String[] cars = new String[3];
	
	cars[0] = "Camaro";
	cars[1] = "Corvette";
	cars[2] = "Tesla";
	
	/*System.out.println(cars[2]); se remueve para el for loop*/
	
	// CON FOR LOOP
	
	for (int i=0; i<cars.length; i++){
		System.out.println(cars[i]);
		}
	}
}