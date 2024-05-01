
public class StaticKeyWord {

	public static void main(String[] args) {
	
	// Static = modifier. A single copy of a variable/method is created and shared.
	//			The class "owns" the static member
		
		Friend friend1 = new Friend ("Spongebob");
		Friend friend2 = new Friend ("Patrick");
		Friend friend3 = new Friend ("Squidward");
		Friend friend4 = new Friend ("Sandy");

		//System.out.println(Friend.numberOfFriends);//Total amount of friends 
		Friend.displayFriends();//Total amount of friends con mensaje
	}
}