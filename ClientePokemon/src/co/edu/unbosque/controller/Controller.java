package co.edu.unbosque.controller;

import java.util.ArrayList;

import javax.swing.JPanel;

import co.edu.unbosque.model.Cliente;

public class Controller {
	
	public Controller() {
		
		Cliente cliente = new Cliente("localhost", 5000);
		cliente.start();
		cliente.enviar("cerrar");
		
	}

}
