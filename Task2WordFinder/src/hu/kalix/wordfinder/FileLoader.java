package hu.kalix.wordfinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLoader {
	
	public byte[] load(String path) {
		byte[] text = null;

		try {
			text = Files.readAllBytes(Paths.get(path));
		} catch (IOException e) {
			System.out.println("hiba a file betöltésénél!");
		}

		return text;
	}
}
