package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
	public static void main(String[] args) {
		Path filePath = Paths.get("/home/developer/Desktop/test/demo.txt");
		Charset charset = StandardCharsets.UTF_8;

		try (BufferedReader bufferedReader = Files.newBufferedReader(filePath, charset)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.format("I/O error: %s%n", ex);
		}
	}
}
