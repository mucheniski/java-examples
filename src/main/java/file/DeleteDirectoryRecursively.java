package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class DeleteDirectoryRecursively {
	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("/home/developer/Desktop/test");

		// Traverse the file tree in depth-first fashion and delete each file/directory.
		Files.walk(dir).sorted(Comparator.reverseOrder()).forEach(path -> {
			try {
				System.out.println("Deleting: " + path);
				Files.delete(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
