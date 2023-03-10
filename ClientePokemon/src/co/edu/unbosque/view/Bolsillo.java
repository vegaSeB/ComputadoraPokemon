package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Bolsillo extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel imagen;
	private JButton cerrar01;
	private ImageIcon iconc,icons;
	private Font font;
	private JPanel pokemon;
	private JTextArea mover;
	private String[] nombres = {
			"Chespin","Quilladin","Chesnaught","Fennekin","Braixen","Delphox"
	};
	
	public static final String CERRAR01 = "CERRAR01";
	private static final int NUMBOTONES = 6;
	private static final int FILAS = 3;
	private static final int COLUMNAS = 2;
	
	public Bolsillo() {
		setSize(900,565);
		setLayout(null);
		
		try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File("media/Minecraft.ttf"));
        } catch (Exception ex) {
        	System.out.println("Entra al cathc");
            font = new Font("Haettenschweiler", Font.ITALIC,14);            
        }
		
		imagen = new JLabel();
		imagen.setBounds(0, 0, 900, 565);
		BufferedImage bi1 = null;
		try {
			bi1 = ImageIO.read(new File("media/bolsillo03.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		Image redi = bi1.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
		imagen.setIcon(new ImageIcon(redi));
		
		cerrar01 = new JButton();
		cerrar01.setActionCommand(CERRAR01);
		cerrar01.setBounds(694, 480, 155, 47);
		cerrar01.setOpaque(false);
		cerrar01.setContentAreaFilled(false);
		cerrar01.setBorderPainted(false);
		iconc = new ImageIcon("media/BotonCancelar.png");
		cerrar01.setIcon(new ImageIcon(iconc.getImage().getScaledInstance(cerrar01.getWidth(), cerrar01.getHeight(), Image.SCALE_SMOOTH)));
		
		mover = new JTextArea("mover a ");
		mover.setBounds(45,484,545,54);
		mover.setFont(this.tipoLetra(1,50));
		mover.setOpaque(false);
		
		pokemon = new JPanel(new GridLayout(FILAS, COLUMNAS));
		pokemon.setBounds(30, 30, 820, 410);
		pokemon.setOpaque(false);
		generarBotones();
		
		add(mover);
		add(pokemon);
		add(cerrar01);
		add(imagen);
		
	}
	
	public Font tipoLetra(int estilo,int tamaño) {
		Font tfont = font.deriveFont(estilo,tamaño);
		return tfont;
	}
	
	public void generarBotones() {
		for(int i = 1; i<=NUMBOTONES;i++) {
			String direc = "media/"+nombres[i-1]+"T.png";
			String ac = nombres[i-1];
			JButton boton = new JButton();
			boton.setName(nombres[i-1]);
			boton.setBounds(0, 0, 370, 110);
			boton.setActionCommand(ac);
			boton.setOpaque(false);
			boton.setContentAreaFilled(false);
			boton.setBorderPainted(false);
			ImageIcon icon = new ImageIcon(direc);
			boton.setIcon(new ImageIcon(icon.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
			
			pokemon.add(boton);
		}
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

	public JButton getCerrar01() {
		return cerrar01;
	}

	public void setCerrar01(JButton cerrar01) {
		this.cerrar01 = cerrar01;
	}

	public ImageIcon getIconc() {
		return iconc;
	}

	public void setIconc(ImageIcon iconc) {
		this.iconc = iconc;
	}

	public ImageIcon getIcons() {
		return icons;
	}

	public void setIcons(ImageIcon icons) {
		this.icons = icons;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public JPanel getPokemon() {
		return pokemon;
	}

	public void setPokemon(JPanel pokemon) {
		this.pokemon = pokemon;
	}

	public JTextArea getMover() {
		return mover;
	}

	public void setMover(JTextArea mover) {
		this.mover = mover;
	}

	public String[] getNombres() {
		return nombres;
	}

	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}

}
