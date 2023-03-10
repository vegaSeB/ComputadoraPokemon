package co.edu.unbosque.servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

import co.edu.unbosque.model.Cajas;

public class Servidor extends Thread{
	
	private ServerSocket servidor;
	private Socket cliente, respuesta;
	private ObjectInputStream recibir;
	private ObjectOutputStream enviar;
	private int port;
	private String address;
	private Cajas caja1,caja2,caja3;
	
	public Servidor(int port) {
		this.caja1 = new Cajas();
		this.caja2 = new Cajas();
		this.caja3 = new Cajas();
		this.servidor = null;
		this.cliente = null;
		this.respuesta = null;
		this.recibir = null;
		this.enviar = null;
		this.port = port;
	}
	
	public void run() {
		caja1.generarAtaques();
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
				
			}catch(BindException e) {
				
				this.port = port+4;
				
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	

}
