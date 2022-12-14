import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.*;

public class MyClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		scanner.close();
		try {
			loadFile("test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void loadFile(String fileName) throws IOException {
		Path file = FileSystems.getDefault().getPath("", "test");
		List<String> lines = Files.readAllLines(file);
		/*for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}*/
		//lines.forEach((str) -> System.out.println(str));
		lines.forEach(System.out::println);
	}
	
	}
