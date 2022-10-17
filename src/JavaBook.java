//Head First Java -- Test scanner module and reading from files

import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.*;

public class JavaBook {
	public static void main(String[] args) {
		//Create scanner object
		Scanner scanner = new Scanner(System.in);
		//Prompt user for name
		System.out.println("Enter your name: ");
		//Create name string
		String name = scanner.nextLine();
		//Return greeting
		System.out.println("Hello " + name);
		//Close scanner object
		scanner.close();
		//Load file
		try {
			loadFile("test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void loadFile(String fileName) throws IOException {
		//Path for file
		Path file = FileSystems.getDefault().getPath("", "test");
		//Create list of strings from lines of file
		List<String> lines = Files.readAllLines(file);
		/*for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}*/
		//lines.forEach((str) -> System.out.println(str));
		//Print lines from list
		lines.forEach(System.out::println);
	}
}