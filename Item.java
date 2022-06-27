/*
 * Item.java
 * 
 * Projeto do grupo do PI
 * aureo
 * bruno
 * gustavo
 * predo
 * 
 */

//import java.util.*;
//import java.nio.*;
//import java.nio.file.*;
public class Item {
	private String pedido;
	//public String dadoDoPedido = "dadoDoPedido.txt";
	
	public Item(){
		this.pedido = " ";
		}
	public Item(String pedido){
		setPedido ( pedido );
		}	
	public void setPedido(String pedido){
		this.pedido = pedido;
		}
	public String getPedido () {
		return pedido;
	}
	
	@Override
	public String toString () {
		return "[Item: " + pedido + "]";
	}
	

}
 
