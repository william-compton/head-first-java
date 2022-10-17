//Calling Dog class from Dog.java file

public class MixedMessages {
	public static void main (String [] args) {
		int x = 0;
		int y = 0;
		Dog d = new Dog();
		d.size = 40;
		d.breed = "pitbull";
		d.bark();
		System.out.println(d.size);
		System.out.println(d.breed);
		
		//Random while loop practice code
		while ( x < 5 ) {
			y = x - y;
			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}
}