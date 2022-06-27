/*
 * exeItem.java
 * 
 *  
 * 
 * 
 */

import java.io.File;
import java.io.IOException;
import java.text.ParseException;


public class TelaCliente {

	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 100; ++i)
			System.out.println();

		File dir = new File("./pedidos");
		System.out.println(SimpleTesting.findAllFilesInFolder(dir) );

	}


}

class SimpleTesting {

	public static String findAllFilesInFolder(File folder) {
		for (File file : folder.listFiles()) {
			if (!file.isDirectory()) {
				System.out.println(file.getName());
			} else {
				findAllFilesInFolder(file);
			}
		}
		return "";
	}
	public static void main(String[] args) throws ParseException {
		File folder = new File("/home/folder/src");
		findAllFilesInFolder(folder);
	}
}