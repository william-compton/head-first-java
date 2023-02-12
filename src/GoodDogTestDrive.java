
public class GoodDogTestDrive {

	public static void main(String[] args) {
		GoodDog dogOne = new GoodDog();
		dogOne.setSize(70);
		GoodDog dogTwo = new GoodDog();
		dogTwo.setSize(8);
		GoodDog dogThree = new GoodDog();
		dogThree.setSize(15);
		System.out.println("Dog one: " + dogOne.getSize());
		System.out.println("Dog two: " + dogTwo.getSize());
		System.out.println("Dog three: " + dogThree.getSize());
		dogOne.bark();
		dogTwo.bark();
		dogThree.bark();
	}

}
