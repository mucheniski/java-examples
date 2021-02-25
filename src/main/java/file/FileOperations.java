package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileOperations {

    public static void main(String[] args) {
       // createFile();
        deleteFile();
    }

    private static void createFile() {
        try {
            File myObj = new File("C:\\ws-developer\\java-examples\\src\\main\\resources\\files\\filetest.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void deleteFile() {
        File myObj = new File("C:\\ws-developer\\java-examples\\src\\main\\resources\\files\\filetest.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

}
