import java.util.Scanner;//llamar el metodo en la parte en que se usa el scanner

public class Math {

	public static void main(String[] args) {
		
		/*Basic e.g
		
		double x = 3.14;
		double y = -10;
		
		double z = java.lang.Math.max(x, y);
		double z = java.lang.Math.min(x, y);
		double z = java.lang.Math.abs(y);
		double z = java.lang.Math.round(x);
		double z = java.lang.Math.round(x);
		double z = java.lang.Math.ceil(x);
		double z = java.lang.Math.floor(x);
		
		System.out.println(z);*/
		
		//E.g to find the Hypotenuse
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter side a: ");
		a = scanner.nextDouble();
		
		System.out.println("Enter side b: ");
		b = scanner.nextDouble();
		
		c = java.lang.Math.sqrt((a*a)+(b*b));
		
		System.out.println("The hypotenuse is: "+c);
		
		scanner.close();//not required but good practice to close this one
		
	}
}
