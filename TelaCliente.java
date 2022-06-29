
//implementando as Bibliotecas
import java.io.File;
import java.io.IOException;
import java.text.ParseException;


public class TelaCliente {

	public static void main(String[] args) throws IOException {
		
		//Criando a pasta pedidos caso nao exista//

		if (!(new File("./pedidos")).mkdir())(new File("./pedidos")).mkdir();
		
		//ele cria um objeto para manusear a pasta pedidos
		File dir = new File("./pedidos");

		//Exibirá na tela todos os nomes dos arquivos que estão dentro da pasta pedidos
		System.out.println(SimpleTesting.findAllFilesInFolder(dir) );

	}


}


// metodo criado para procurar e mostrar todos os arquivos dentro da pasta pedidos
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
