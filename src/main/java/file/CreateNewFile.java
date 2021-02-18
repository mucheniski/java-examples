package file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateNewFile {

    public static void main(String[] args)  {
        // New file path
        Path filePath = Paths.get("/home/developer/Desktop/bar.txt");

        try {
            // Create missing parent directories
            if(filePath.getParent() != null) {
                Files.createDirectories(filePath.getParent());
            }

            // Create a file at the specified file path
            Files.createFile(filePath);
            System.out.println("File created successfully!");

        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("No permission to create file: " + e.getMessage());
        }
    }
}
