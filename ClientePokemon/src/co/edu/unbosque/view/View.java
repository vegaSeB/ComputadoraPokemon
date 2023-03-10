package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Portada portada;
	private Inicio inicio;
	private Caja caja;
	private Caja2 caja2;
	private Caja3 caja3;
	private Bolsillo bolsillo;
	
	
	public View(Controller control) {
		
		setSize(900,600);
		setResizable(false);
		setTitle("Sistema de almacenamiento");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		portada = new Portada();
		inicio = new Inicio();
		caja = new Caja(); 
		caja2 = new Caja2(); 
		caja3 = new Caja3(); 
		bolsillo = new Bolsillo();
		
		add(bolsillo);
		add(portada);
		add(inicio);
		add(caja3);
		add(caja2);
		add(caja);
		
		
		inicio.getCaja().addActionListener(control);
		inicio.getBolsillo().addActionListener(control);
		inicio.getSalir().addActionListener(control);
		caja.getRetroceder().addActionListener(control);
		caja.getAvanzar().addActionListener(control);
		caja.getEquipop().addActionListener(control);
		caja.getCerrar().addActionListener(control);
		caja2.getRetroceder2().addActionListener(control);
		caja2.getAvanzar2().addActionListener(control);
		caja2.getEquipop().addActionListener(control);
		caja2.getCerrar().addActionListener(control);
		caja3.getRetroceder3().addActionListener(control);
		caja3.getAvanzar3().addActionListener(control);
		caja3.getEquipop().addActionListener(control);
		caja3.getCerrar().addActionListener(control);
		bolsillo.getCerrar01().addActionListener(control);
		
	}

	public Portada getPortada() {
		return portada;
	}

	public void setPortada(Portada portada) {
		this.portada = portada;
	}

	public Inicio getInicio() {
		return inicio;
	}

	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	public Bolsillo getBolsillo() {
		return bolsillo;
	}

	public void setBolsillo(Bolsillo bolsillo) {
		this.bolsillo = bolsillo;
	}

	public Caja2 getCaja2() {
		return caja2;
	}

	public void setCaja2(Caja2 caja2) {
		this.caja2 = caja2;
	}

	public Caja3 getCaja3() {
		return caja3;
	}

	public void setCaja3(Caja3 caja3) {
		this.caja3 = caja3;
	}
	
	
	
}
