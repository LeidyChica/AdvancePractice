
public class ArrayOfObjects {

	public static void main(String[] args) {
		
		//Food[] refrigerator = new Food[3]; Forma 1 
		
		Food  food1 = new Food("pizza");
		Food  food2 = new Food("hamburguer");
		Food  food3 = new Food("hotdog");
		
		Food[] refrigerator = {food1,food2,food3};// Forma 2 

		//refrigerator[0] = food1; Solo se usan en Forma 1
		//refrigerator[1] = food2; Solo se usan en Forma 1
		//refrigerator[2] = food3; Solo se usan en Forma 1
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
	}
}