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
	
public Object recibir(String cedula) {
		
		Object salida = true;
		
		try {
			cliente = new Socket(address, port);
			enviar = new ObjectOutputStream(cliente.getOutputStream());
			enviar.writeObject(cedula);

			
			servidor = new ServerSocket(port+1);
			cliente = servidor.accept();
			recibir = new ObjectInputStream(cliente.getInputStream());
			String aux = (String) recibir.readObject();
			if (aux == null) {
				cliente.close();
				enviar.close();
				servidor.close();
				recibir.close();
				salida = null;
			} else {
				cliente.close();
				enviar.close();
				servidor.close();
				recibir.close();
				salida =  aux;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return salida;
	}
	
}
