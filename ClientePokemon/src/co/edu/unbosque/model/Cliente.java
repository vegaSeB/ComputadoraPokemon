package co.edu.unbosque.model;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Cliente extends Thread{

	private Socket cliente;
	private ServerSocket servidor; 
	private ObjectInputStream recibir;
	private ObjectOutputStream enviar;
	private int port;
	private String address;
	
	public Cliente(String adress, int port) {
		// TODO Auto-generated constructor stub

		this.cliente = null;
		this.recibir = null;
		this.enviar = null;
		this.address = adress;
		this.port = port;

	}
	
	public void enviar() {
		try {
			cliente = new Socket(address, port);
			enviar = new ObjectOutputStream(cliente.getOutputStream());
			enviar.writeObject("cerrar");
			enviar.close();
			cliente.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void enviarCajas(String caja, ArrayList<JPanel> paneles) {
		
		try {
			cliente = new Socket(address,port);
			enviar = new ObjectOutputStream(cliente.getOutputStream());
			enviar.writeObject(caja);
			System.out.println("Se evio la caja");
			
			servidor = new ServerSocket(port+1);
			cliente = servidor.accept();
			recibir = new ObjectInputStream(cliente.getInputStream());
			
			String res = (String)recibir.readObject();
			
			if(res.equalsIgnoreCase("caja1")) {
				
			enviar.writeObject(paneles);
			System.out.println("Se evio la caja en paneles");
			enviar.close();
			cliente.close();
			recibir.close();
			
			}else if(res.equalsIgnoreCase("caja2")) {
				
				enviar.writeObject(paneles);
				enviar.close();
				cliente.close();
				recibir.close();
				
			}else if(res.equalsIgnoreCase("caja3")) {
				
				enviar.writeObject(paneles);
				enviar.close();
				cliente.close();
				recibir.close();
				
			}else {
				
				enviar.close();
				cliente.close();
				recibir.close();
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
		
	}
	
	public Object recibirCajas(String caja) {
		
		Object recibido = null;
		
		try {
			
			cliente = new Socket(address,port);
			enviar = new ObjectOutputStream(cliente.getOutputStream());
			enviar.writeObject(caja);
			
			servidor = new ServerSocket(port+1);
			cliente = servidor.accept();
			recibir = new ObjectInputStream(cliente.getInputStream());
			ArrayList<JPanel> res = (ArrayList<JPanel>) recibir.readObject();
			
			if (res == null) {
				cliente.close();
				enviar.close();
				servidor.close();
				recibir.close();
				recibido = null;
			} else {
				cliente.close();
				enviar.close();
				servidor.close();
				recibir.close();
				recibido = res;
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return recibido;
		
	}
	
	public void enviarBolsillo(JPanel[] bolsillo) {
		
		try {
			
			cliente = new Socket(address,port);
			enviar = new ObjectOutputStream(cliente.getOutputStream());
			enviar.writeObject("bolsillo");
			
			servidor = new ServerSocket(port+1);
			cliente = servidor.accept();
			recibir = new ObjectInputStream(cliente.getInputStream());
			
			String res = (String)recibir.readObject();
			if(res.equalsIgnoreCase("bolsillo")){
				
				cliente = new Socket(address, port);
				enviar = new ObjectOutputStream(cliente.getOutputStream());
				enviar.writeObject(bolsillo);
				
				cliente.close();
				enviar.close();
				servidor.close();
				recibir.close();
			}else {
				
				cliente.close();
				enviar.close();
				servidor.close();
				recibir.close();
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public Object recibirBolsillo() {
		
		Object recibido = null;
		
		try {
			
			cliente = new Socket(address,port);
			enviar = new ObjectOutputStream(cliente.getOutputStream());
			enviar.writeObject("Bolsillo");
			
			servidor = new ServerSocket(port+1);
			cliente = servidor.accept();
			recibir = new ObjectInputStream(cliente.getInputStream());
			JPanel[] res = (JPanel[]) recibir.readObject();
			
			if (res == null) {
				cliente.close();
				enviar.close();
				servidor.close();
				recibir.close();
				recibido = null;
			} else {
				cliente.close();
				enviar.close();
				servidor.close();
				recibir.close();
				recibido = res;
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return recibido;
		
	}
	
}
