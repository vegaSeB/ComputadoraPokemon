package co.edu.unbosque.controller;

import co.edu.unbosque.servidor.Servidor;

public class Controller {
	
	public Controller() {
		Servidor server = new Servidor(5000);
		server.start();
		
	}

}
