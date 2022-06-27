import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * Pizza.java
 
 * 
 */

public class Pizza extends Item {
	public String pedidoArquivo = "pedidoArquivo.txt";
	public String separa = ";";
	private String tamanho, sabor;
	private String preco;
	
	
	public Pizza(){
		super();
		this.sabor = " ";
		this.tamanho = " ";
		this.preco = " ";
		}
	public Pizza(String tamanho, String sabor, String preco, String pedido){
			super ( pedido );
			setTamanho( tamanho );
			setSabor( sabor );
			setPreco ( preco );
			}
	public void setTamanho( String tamanho ){
		this.tamanho = tamanho;
		}
	 public void setSabor( String sabor ){
		 this.sabor = sabor;
		 }
	public void setPreco (String preco ){
		this.preco = preco;
		}	 
	public String getTamanho(){
		return tamanho;
		}	
	public String getSabor(){
		return sabor;	
		}
	public String getPreco(){
		return preco;		
		}	
	

	@Override
	public String toString(){
		return "Pizza "+getPedido()+", "+sabor+", "+tamanho+", "+preco; 
		}	
	public boolean gravarPedido(){
		//	public String separa = "[" , separa2 = "]";
		try{
			FileWriter fw = new FileWriter( pedidoArquivo, true);
				BufferedWriter bw = new BufferedWriter( fw );
					bw.write(getPedido());
					bw.write(separa); 
					bw.write(getSabor());
					bw.write(separa);
					bw.write(getTamanho());
					bw.write(separa);
					bw.write(getPreco());
					
					bw.newLine();
				bw.close();
			fw.close();
			return true;			
			}catch (IOException e){
				e.printStackTrace();
				return false;
				}
		
		}
	public boolean lerPedido(){
		try{
			FileReader frr = new FileReader(pedidoArquivo);
				BufferedReader brr = new BufferedReader(frr);
					 while(brr.ready() ){
						 String linha = brr.readLine(); 
						 System.out.println(linha);
						 //String campos[] = linha.split(separa);
							 }
				brr.close();
			frr.close();
			return true;
			}catch(IOException e){
				e.printStackTrace();
				return false;
				}
		
		}	
	 	
	 
 }

