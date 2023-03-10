package co.edu.unbosque.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Inicio extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel imagen;
	private JButton caja,bolsillo,salir;
	private ImageIcon icon1,icon2,icon3;
	
	public static final String CAJA="CAJA";
	public static final String BOLSILLO="BOLSILLO";
	public static final String SALIR="SALIR";
	
	public Inicio() {
		
		setSize(900,600);
		setLayout(null);
	
		imagen = new JLabel();
		imagen.setBounds(0, 0, 900, 600);
		BufferedImage bi1 = null;
		try {
			bi1 = ImageIO.read(new File("media/Inicio.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		Image redi = bi1.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
		imagen.setIcon(new ImageIcon(redi));
		
		caja = new JButton();
		caja.setActionCommand(CAJA);
		caja.setBounds(314, 212, 273, 68);
		caja.setOpaque(false);
		caja.setContentAreaFilled(false);
		caja.setBorderPainted(false);
		icon1 = new ImageIcon("media/BotonCajas.png");
		caja.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(caja.getWidth(), caja.getHeight(), Image.SCALE_SMOOTH)));
		
		
		bolsillo = new JButton();
		bolsillo.setActionCommand(BOLSILLO);
		bolsillo.setBounds(314, 322, 273, 68);
		bolsillo.setOpaque(false);
		bolsillo.setContentAreaFilled(false);
		bolsillo.setBorderPainted(false);
		icon2 = new ImageIcon("media/BotonBolsillo.png");
		bolsillo.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(bolsillo.getWidth(), bolsillo.getHeight(), Image.SCALE_SMOOTH)));
		
		salir = new JButton();
		salir.setActionCommand(SALIR);
		salir.setBounds(314, 425, 273, 68);
		salir.setOpaque(false);
		salir.setContentAreaFilled(false);
		salir.setBorderPainted(false);
		icon3 = new ImageIcon("media/BotonSalir.png");
		salir.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(salir.getWidth(), salir.getHeight(), Image.SCALE_SMOOTH)));
		
		add(salir);
		add(bolsillo);
		add(caja);
		add(imagen);
		
		
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

	public JButton getCaja() {
		return caja;
	}

	public void setCaja(JButton caja) {
		this.caja = caja;
	}

	public JButton getBolsillo() {
		return bolsillo;
	}

	public void setBolsillo(JButton bolsillo) {
		this.bolsillo = bolsillo;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}

	public ImageIcon getIcon1() {
		return icon1;
	}

	public void setIcon1(ImageIcon icon1) {
		this.icon1 = icon1;
	}

	public ImageIcon getIcon2() {
		return icon2;
	}

	public void setIcon2(ImageIcon icon2) {
		this.icon2 = icon2;
	}

	public ImageIcon getIcon3() {
		return icon3;
	}

	public void setIcon3(ImageIcon icon3) {
		this.icon3 = icon3;
	}
	
	

}
