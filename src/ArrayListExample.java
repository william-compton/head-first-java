import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Egg> myList = new ArrayList<Egg>();
		Egg s = new Egg();
		Egg b = new Egg();
		myList.add(s);
		myList.add(b);
		System.out.println(myList);
		int theSize = myList.size();
		System.out.println(theSize);
		boolean isIn = myList.contains(s);
		System.out.println(isIn);
		int idx = myList.indexOf(b);
		System.out.println(idx);
		boolean empty = myList.isEmpty();
		System.out.println(empty);
		myList.remove(s);
		System.out.println(myList);
		

	}

}
