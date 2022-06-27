
//implementando as Bibliotecas
import java.io.File;
import java.io.IOException;
import java.text.ParseException;


public class TelaCliente {

	public static void main(String[] args) throws IOException {
		
		//ele cria um objeto para manusear a pasta pedidos
		File dir = new File("./pedidos");

		//exibira para o cliente todos os pedidos que estão em posse da cozinha atualmente
		System.out.println(SimpleTesting.findAllFilesInFolder(dir) );

	}


}


// metodo criado para procurar e mostrar todo os arquivos dentro da pasta pedidos
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
