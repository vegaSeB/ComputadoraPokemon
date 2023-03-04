package co.edu.unbosque.servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread{
	
	private ServerSocket servidor;
	private Socket cliente, respuesta;
	private ObjectInputStream recibir;
	private ObjectOutputStream enviar;
	private int port;
	private String address;
	
	public Servidor(int port) {
		
		this.servidor = null;
		this.cliente = null;
		this.respuesta = null;
		this.recibir = null;
		this.enviar = null;
		this.port = port;
	}
	
	public void run() {
		
		String op = "";
		
		while(!op.equalsIgnoreCase("cerrar")) {
			
			try {
				
				servidor = new ServerSocket(port);
				System.out.println("Esperando..");
				cliente = servidor.accept();
				System.out.println("Aceptado");
				recibir = new ObjectInputStream(cliente.getInputStream());
				
				op = (String) recibir.readObject();
				respuesta = new Socket(address,port+1);
				
			if(op.equalsIgnoreCase("caja1")) {
				
				enviar = new ObjectOutputStream(respuesta.getOutputStream());
				enviar.writeObject(op);
				System.out.println("Se envio correctamente");
				
				recibir.readObject();
				System.out.println("Recibio la caja");
				
			}
			
			servidor.close();
			enviar.close();
			recibir.close();
			cliente.close();
				
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	

}
