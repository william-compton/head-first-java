
public class Example {

	public static void main(String[] args) {
		printS("static method");
		Example myReview = new Example();
		myReview.print("instance method");
		stringArray();
	}
	
	void print(String data) {
		System.out.println(data);
	}
	
	static void printS(String data) {
		String myName = "Will";
		System.out.println(data + " " + myName);
	}
	
	static void stringArray() {
		String[] breakfast = new String[3];
		breakfast[0] = "eggs";
		breakfast[1] = "bacon";
		breakfast[2] = "orange juice";
		boolean statement1 = 1 == 1;
		boolean statement2 = 1 != 3;
		//System.out.println(breakfast[0]);
		//System.out.println(breakfast[1]);
		//System.out.println(breakfast[2]);
		for (int i = 0; i < breakfast.length; i++) {
			System.out.println(breakfast[i]);
	}
		if (statement1 && statement2) {
			System.out.println("statements are both true");
		} else {
			System.out.println("both statements are not true");
		}
	}

}
