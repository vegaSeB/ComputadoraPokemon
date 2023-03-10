package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View gui;
	
	public Controller() {
		
		gui = new View(this);
		gui.setVisible(true);
		
//		Cliente server = new Cliente("localhost", 5000);
//		server.start();
//		server.enviarCajas("caja1", new ArrayList<JPanel>());
		
		funcionar();
		
	}
	
	public void funcionar() {
		gui.getPortada().setVisible(false);
		gui.getInicio().setVisible(false);
		gui.getCaja().setVisible(false);
		gui.getCaja2().setVisible(false);
		gui.getCaja3().setVisible(false);
		gui.getBolsillo().setVisible(false);
		tiempo();
		
	}
	
	public void tiempo() {
		gui.getPortada().setVisible(true);
		try {
			Thread.sleep(1*1500);
		}catch (InterruptedException ei) {
			Thread.currentThread().interrupt();
		}
		
		gui.getPortada().setVisible(false);
		gui.getInicio().setVisible(true);

		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//inicio
		if(e.getActionCommand().equals(gui.getInicio().CAJA)) {
			gui.getInicio().setVisible(false);
			gui.getCaja().setVisible(true);
			gui.getCaja2().setVisible(false);
			gui.getCaja3().setVisible(false);
		}else if (e.getActionCommand().equals(gui.getInicio().BOLSILLO)) {
			gui.getInicio().setVisible(false);
			gui.getBolsillo().setVisible(true);
			gui.getCaja().setVisible(false);
			gui.getCaja2().setVisible(false);
			gui.getCaja3().setVisible(false);
		}else if (e.getActionCommand().equals(gui.getInicio().SALIR)) {
			System.exit(0);
		}
		
		//caja
		
		if(e.getActionCommand().equals(gui.getCaja().RETROCEDER)) {
			gui.getCaja2().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getCaja3().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja().AVANZAR)){
			gui.getCaja3().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getCaja2().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja().EQUIPOP)){
			gui.getCaja2().setVisible(false);
			gui.getCaja3().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getBolsillo().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja().CERRAR)){
			gui.getCaja().setVisible(false);
			gui.getCaja2().setVisible(false);
			gui.getCaja3().setVisible(false);
			gui.getInicio().setVisible(true);
		}
		//caja 2
		if(e.getActionCommand().equals(gui.getCaja2().RETROCEDER2)) {
			gui.getCaja2().setVisible(false);
			gui.getCaja3().setVisible(false);
			gui.getCaja().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja2().AVANZAR2)){
			gui.getCaja2().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getCaja3().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja2().EQUIPOP)){
			gui.getCaja2().setVisible(false);
			gui.getCaja3().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getBolsillo().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja2().CERRAR)){
			gui.getCaja2().setVisible(false);
			gui.getCaja3().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getInicio().setVisible(true);
		}
		//caja3
		if(e.getActionCommand().equals(gui.getCaja3().RETROCEDER3)) {
			gui.getCaja3().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getCaja2().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja3().AVANZAR3)){
			gui.getCaja3().setVisible(false);
			gui.getCaja2().setVisible(false);
			gui.getCaja().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja3().EQUIPOP)){
			gui.getCaja3().setVisible(false);
			gui.getCaja2().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getBolsillo().setVisible(true);
		}else if (e.getActionCommand().equals(gui.getCaja3().CERRAR)){
			gui.getCaja3().setVisible(false);
			gui.getCaja2().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getInicio().setVisible(true);
		}
		//bolsillo
		if(e.getActionCommand().equals(gui.getBolsillo().CERRAR01)) {
			gui.getBolsillo().setVisible(false);
			gui.getCaja3().setVisible(false);
			gui.getCaja2().setVisible(false);
			gui.getCaja().setVisible(false);
			gui.getInicio().setVisible(true);
		}
		
			
			JButton primer = gui.getCaja().getBoton()[0];
			primer.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(gui.getCaja().getBoton()[0].getName().equals("Chespin")) {
						 gui.getCaja().getMote().setText("Chespin");
					
				}
					
				}
				
			});
		
		
		
	}

}
