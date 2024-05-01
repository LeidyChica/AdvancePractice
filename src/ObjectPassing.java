
public class ObjectPassing {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		CarOP car1 = new CarOP("BMW");
		CarOP car2 = new CarOP("Tesla");
		
		garage.park(car1);
		garage.park(car2);
	}
}