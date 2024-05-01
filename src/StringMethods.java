
public class StringMethods {
	
	public static void main(String[] args) {

	 // String = a reference data type that can store one or more characters
	 // reference data types have access to useful methods

	String name = "Bro";
	
	// boolean result = name.equals("Bro"); // Comparar que lo que se recibe sea igual
	
	// boolean result = name.equalsIgnoreCase("Bro"); // Ignorar las minusculas y solo comparar que la palabra sea la misma
	
	// int result = name.length(); // Conocer el numero de digitos
	
	// char result = name.charAt(0); // Conocer que letra va en que posicion partiendo desde 0
	
	// int result = name.indexOf("o"); // Conocer en que posicion esta una letra
	
	// boolean result = name.isEmpty(); // Conocer si hay un nombre en blanco 
	
	// String result = name.toUpperCase(); // Cambia todos los caracteres a mayusculas

	// String result = name.toLowerCase(); // Cambiar todos los caracteres a minusculas

	// String result = name.trim(); // Eliminar espacios en blanco de ambos lados si los hay
	
	String result = name.replace('o', 'a'); // Reemplazar una letra por otra

	System.out.println(result);
	
	}
}

//name. para mostrar todos los metodos disponibles