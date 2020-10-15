package hu.kalix.wordfinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLoader {
	public byte[] load(String path) throws IOException {
		byte[] text = null;
		text = Files.readAllBytes(Paths.get(path));

		return text;
	}
}
