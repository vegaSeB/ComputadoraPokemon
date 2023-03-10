package co.edu.unbosque.view;

import java.awt.Component;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Portada extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel imagen;
	
	public Portada() {
		
		setSize(900,600);
		setLayout(null);
	
		imagen = new JLabel();
		imagen.setBounds(0, 0, 900, 600);
		BufferedImage bi1 = null;
		try {
			bi1 = ImageIO.read(new File("media/Portada.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		Image redi = bi1.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
		
		imagen.setIcon(new ImageIcon(redi));
		
		add(imagen);
		
	}
	

}
