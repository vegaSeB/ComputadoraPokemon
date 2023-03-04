package co.edu.unbosque.controller;

import java.util.ArrayList;

import javax.swing.JPanel;

import co.edu.unbosque.model.Cliente;

public class Controller {
	
	public Controller() {
		
		Cliente server = new Cliente("localhost", 5000);
		server.start();
		server.enviarCajas("caja1", new ArrayList<JPanel>());
		
	}

}
