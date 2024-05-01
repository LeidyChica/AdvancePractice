
public class Arrays2D {

	public static void main(String[] args) {
		
		// 2D array = an array of arrays
		
		/*String[][] cars = new String[3][3];
		
		cars[0][0] = "Mazda";
		cars[0][1] = "Camaro";
		cars[0][2] = "Nissan";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "Range R";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambor";
		cars[2][2] = "Tesla";
		
		for (int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]+"");
			}*/
			
	// OTRA FORMA 
			
		String[][] cars = {
							{"Mazda","Camaro","Nissan"},
				            {"Mustang","Ranger","Range R"},
				            {"Ferrari","Lambor","Tesla"}
		                  };
		
		for (int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");		            
		}
	}
}
}