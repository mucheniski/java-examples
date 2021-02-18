package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileUsingJavaIOFile {

	public static void main(String[] args) {
		// Instantiate a File object with a file path
		File file = new File("/home/developer/Desktop/test/foo.txt");

		try {
			// Create missing parent directories
			if (file.getParentFile() != null) {
				file.getParentFile().mkdirs();
			}

			// Create the file
			boolean success = file.createNewFile();

			if (success) {
				System.out.println("File created successfully!");
			} else {
				System.out.println("File already exists!");
			}
		} catch (IOException e) {
			System.out.println("An I/O error occurred: " + e.getMessage());
		} catch (SecurityException e) {
			System.out.println("No sufficient permission to create file: " + e.getMessage());
		}
	}

}
