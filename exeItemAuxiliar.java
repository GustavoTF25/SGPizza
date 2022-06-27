/*
 * exeItem.java
 * 
 *  
 * 
 * 
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


public class exeItem {

	public static void main(String[] args) throws IOException {
		int cont = 0;
		Scanner scanSt = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		//Item[] pedidos = new Item[100];
		Pedido pedido = new Pedido();

		//item[contar]
		//char letra = 0;
		String validar;

		int opcao;
		String opcao1;
		do {
			
			System.out.println("MENU");
			System.out.println("1) Add Pizza");
			System.out.println("2) Add Refri");
			System.out.println("3) Mostrar pedidos");
			System.out.println("4) Finalizar Pedidos/ enviar para cozinha");
			System.out.println("5) Limpar carrinho");
			System.out.println("6) Sair");
			System.out.print("Resposta: ");
			opcao = scan.nextInt();
			switch (opcao) {//String sab = " ",tam = " ",pre = " ";
				case 1:
					pedido.setPedido("Pizza");
					do {
						System.out.print("Entre com o sabor da pizza: \n");
						System.out.println("M) Mussarela");
						System.out.println("P) Portuguesa");
						System.out.println("C) Calabresa");
						opcao1 = scanSt.nextLine().toUpperCase();
						if (opcao1.contains("M")) pedido.setSabor("Mussarela");
						if (opcao1.contains("P")) pedido.setSabor("Portuguesa");
						if (opcao1.contains("C")) pedido.setSabor("Calabresa");
					} while (opcao1.contains("MPC"));
					do {
						System.out.print("Entre com o tamanho: \n");
						System.out.println("P) Pequeno");
						System.out.println("M) Medio");
						System.out.println("G) Grande");
						opcao1 = scanSt.nextLine().toUpperCase();
						if (opcao1.contains("P")) {
							pedido.setTamanho("Pequeno");
							pedido.setPreco("R$10,50");
						}
						if (opcao1.contains("M")) {
							pedido.setTamanho("Medio");
							pedido.setPreco("R$13,50");
						}
						if (opcao1.contains("G")) {
							pedido.setTamanho("Grande");
							pedido.setPreco("R$17,50");
						}
					} while (opcao1.contains("PMG"));
					System.out.println("Item: " + pedido.getPedido() + ", Sabor: " + pedido.getSabor() + ", Tamanho: " + pedido.getTamanho() + "\nPreco: " + pedido.getPreco());
					System.out.println("Adicionar [S/N]");
					validar = scanSt.nextLine().toUpperCase();
					if (validar.equals("S")) {
						//pedidos[contar] = new Pizza(pedido.getPedido(), pedido.getTamanho(),
						//	pedido.getSabor(), pedido.getPreco());

						pedido.gravarPedido();
					}
					break;
//String sab = " ",tam = " ",pre = " ";
				case 2:
					pedido.setPedido("Refrigerante");
					do {
						System.out.print("Entre com o Refrigente: \n");
						System.out.println("C) Coca-cola");
						System.out.println("G) Guarana");
						System.out.println("S) Sprite");
						opcao1 = scanSt.nextLine().toUpperCase();
						if (opcao1.contains("C")) pedido.setSabor("Coca-cola");
						if (opcao1.contains("G")) pedido.setSabor("Guarana");
						if (opcao1.contains("S")) pedido.setSabor("Sprite");
					} while (opcao1.contains("CGS"));
					do {
						System.out.print("Entre com o tamanho: \n");
						System.out.println("P) Pequeno( 600ml)");
						System.out.println("M) Medio ( 1 Litro)");
						System.out.println("G) Grande ( 2 Litros)");
						opcao1 = scanSt.nextLine().toUpperCase();
						if (opcao1.contains("P")) {
							pedido.setTamanho("600ml");
							pedido.setPreco("R$4.00");
						}
						if (opcao1.contains("M")) {
							pedido.setTamanho("1 Litro");
							pedido.setPreco("R$8,50");
						}
						if (opcao1.contains("G")) {
							pedido.setTamanho("2 litros");
							pedido.setPreco("R$12,00");
						}
					} while (opcao1.contains("PMG"));
					System.out.println("Item: " + pedido.getPedido() + ", Tipo: " + pedido.getSabor() + ", Tamanho: " + pedido.getTamanho() + "\nPreco: " + pedido.getPreco());
					System.out.println("Adicionar [S/N]");
					validar = scanSt.nextLine().toUpperCase();
					if (validar.equals("S")) {
						//pedidos[contar] = new Pizza(pedido.getPedido(), pedido.getTamanho(),
						//pedido.getSabor(), pedido.getPreco());

						pedido.gravarPedido();
					}
					break;
				case 3:
					System.out.println("------------------------------------");
					pedido.lerPedido();
					System.out.println("------------------------------------");
					break;

				case 4:
					boolean statusRename;

					do{
					File dir = new File("../pi/pedidos");
					File arq = new File("pedidoArquivo.txt");
					File arq2 = new File(dir, cont + ".txt");


					statusRename = arq.renameTo(arq2);
					arq.createNewFile();

					cont++;}
					while(!statusRename);
					System.out.println("Enviado para a cozinha pedido n " + cont );
					break;
				case 5:
					File arq5 = new File("pedidoArquivo.txt");
					boolean statusRename4 = arq5.createNewFile();
					if (!statusRename4) {
						arq5.delete();
						arq5.createNewFile();
					}
					//Path statusRename4 = Files.copy(arq5.toPath(), arq6.toPath());
					System.out.println("limpado carrinho: " + statusRename4);
					break;
				case 6:
					System.out.println("Voce saiu do program");
					break;
				default:
					break;
			}
		} while (opcao != 6);
	}


	private static void File(File source, File dest) throws IOException {
		Files.move(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}
}