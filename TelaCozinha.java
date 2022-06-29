

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class TelaCozinha {

	public static void main(String[] args) throws IOException {
		File arquivos[];
		Scanner scan   = new Scanner(System.in);
		Scanner scanSt = new Scanner(System.in);
		int 	opcao;
		File diretorio = new File("./pedidos");
		arquivos = diretorio.listFiles();

		do {
			System.out.println("MENU");
			System.out.println("1) Ver Pedidos");
			System.out.println("2) Alterar status do pedido");
			System.out.println("3) Sair");
			opcao = scan.nextInt();
			switch (opcao) {
				case 1:


					arquivos = diretorio.listFiles();
					Arrays.sort(arquivos);
					for (int i = 0; i < arquivos.length; i++) {
						//leia arquivos[i];
						System.out.print(i + " ) " + arquivos[i] + "\n");


						File doc1 = new File(String.valueOf(arquivos[i]));

						BufferedReader obj1 = new BufferedReader(new FileReader(doc1));

						String strng1;
						while ((strng1 = obj1.readLine()) != null)
							System.out.println(strng1);

					}
					break;
				case 2:
					arquivos = diretorio.listFiles();
					Arrays.sort(arquivos);
					if(arquivos.length<=0)break;
					System.out.println("Selecione qual pedido que quer ser modificado:");
					for (int i = 0; i < arquivos.length; i++) {
						//leia arquivos[i];
						System.out.print(i + " ) " + arquivos[i] + "\n");
						String texto = String.valueOf(arquivos[i]);
						String texto1=texto.replaceAll("[\\D]", "");



						File doc = new File(String.valueOf(arquivos[i]));
						BufferedReader obj = new BufferedReader(new FileReader(doc));
						String strng;
						while ((strng = obj.readLine()) != null)
							System.out.println(strng);
					}
					int opcao1 = scan.nextInt();

					System.out.println("selecionou : ");
					System.out.print(opcao1 + ") ");
					System.out.print(arquivos[opcao1] + "\n");
					System.out.println("Deseja modificar para o status: ");
					System.out.println("F) Forno");
					System.out.println("P) Pronto");
					System.out.println("3) Voltar");
					String opcao3 = scanSt.nextLine().toUpperCase();
					if (opcao3.contains("F")) {
						String texto = String.valueOf(arquivos[opcao1]);
						String texto1 = texto.replaceAll("[\\D]", "");

						File dir = new File("./pedidos");
						boolean statusRename7 = (new File(String.valueOf(arquivos[opcao1]))).renameTo(new File(dir, "pedido " + texto1 + " - forno"));
						System.out.println(arquivos[opcao1]);
						System.out.println("convertido " + statusRename7);
					}
					if (opcao3.contains("P")) {
						String texto = String.valueOf(arquivos[opcao1]);
						String texto1 = texto.replaceAll("[\\D]", "");

						File dir = new File("./pedidos");
						boolean statusRename7 = (new File(String.valueOf(arquivos[opcao1]))).renameTo(new File(dir, "pedido " + texto1 + " - pronto"));
						System.out.println(arquivos[opcao1]);
						System.out.println("convertido " + statusRename7);
					}

							break;

				case 3:
					System.out.println("Voce saiu do programa");
					break;
				default:
					break;
			}
		} while (opcao != 3);








}

}

