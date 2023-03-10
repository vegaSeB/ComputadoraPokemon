package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Caja extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel imagen, imagen2;
	private JLabel tipo1,tipo2,grupo,mote,ataque1,ataque2,ataque3,ataque4,nivel,numcaja, caja;
	private JButton retroceder,avanzar,equipop,cerrar;
	private String iconpokemon="BOLA";
	private JButton[] boton = new JButton[72];
	
	private String[] nombres = {
			"Chespin","Quilladin","Chesnaught","Fennekin","Braixen","Delphox","Froakie","Frogadier","Greninja","Bunnelby","Diggersby","Fletchling","Fletchinder",
			"Talonflame","Scatterbug","Spewpa","Vivillon","Litleo","Pyroar","Flabebe","Floette","Florges","Skiddo","Gogoat","Pancham","Pangoro","Furfrou","Espurr",
			"Meowstic","Honedge","Doublade","Aegislash","Spritzee","Aromatisse","Swirlix","Slurpuff","Inkay","Malamar","Binacle","Barbaracle","Skrelp","Dragalge",
			"Clauncher","Clawitzer","Helioptile","Heliolisk","Tyrunt","Tyrantrum","Amaura","Aurorus","Sylveon","Hawlucha","Dedenne","Carbink","Goomy","Sliggoo","Goodra",
			"Klefki","Phantump","Trevenant","Pumpkaboo","Gourgeist","Bergmite","Avalugg","Noibat","Noivern","Xerneas","Yveltal","Zygarde","Diancie","Hoopa","Volcanion"
			
	};
	
//	private JButton 
//			Chespin,Quilladin,Chesnaught,Fennekin,Braixen,Delphox,Froakie,Frogadier,Greninja,Bunnelby,Diggersby,Fletchling,Fletchinder,
//			Talonflame,Scatterbug,Spewpa,Vivillon,Litleo,Pyroar,Flabebe,Floette,Florges,Skiddo,Gogoat,Pancham,Pangoro,Furfrou,Espurr,
//			Meowstic,Honedge,Doublade,Aegislash,Spritzee,Aromatisse,Swirlix,Slurpuff,Inkay,Malamar,Binacle,Barbaracle,Skrelp,Dragalge,
//			Clauncher,Clawitzer,Helioptile,Heliolisk,Tyrunt,Tyrantrum,Amaura,Aurorus,Sylveon,Hawlucha,Dedenne,Carbink,Goomy,Sliggoo,Goodra,
//			Klefki,Phantump,Trevenant,Pumpkaboo,Gourgeist,Bergmite,Avalugg,Noibat,Noivern,Xerneas,Yveltal,Zygarde,Diancie,Hoopa,Volcanion;
//			
	private ImageIcon iconr,icona,icone,iconc;
	private Font font;
	private JPanel pokemon;
	
	
	public static final String RETROCEDER = "RETROCEDER";
	public static final String AVANZAR="AVANZAR";
	public static final String EQUIPOP="EQUIPOP";
	public static final String CERRAR="CERRAR";
	private static final int NUMBOTONES = 71;
	private static final int FILAS = 8;
	private static final int COLUMNAS = 9;
	
	public Caja() {
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
			bi1 = ImageIO.read(new File("media/Caja.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		Image redi = bi1.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
		imagen.setIcon(new ImageIcon(redi));
		
		imagen2 = new JLabel();
		imagen2.setBounds(40, 100, 150, 150);
		BufferedImage bi2 = null;
		String ruta = "media/"+iconpokemon+"_icon.png";
		try {
			bi2 = ImageIO.read(new File(ruta));
		}catch(IOException e2){ 
			e2.printStackTrace();
		}
		Image redi2 = bi2.getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_SMOOTH);
		imagen2.setIcon(new ImageIcon(redi2));
		
		retroceder = new JButton();
		retroceder.setActionCommand(RETROCEDER);
		retroceder.setBounds(262, 63, 24, 47);
		retroceder.setOpaque(false);
		retroceder.setContentAreaFilled(false);
		retroceder.setBorderPainted(false);
		iconr = new ImageIcon("media/BotonAtras.png");
		retroceder.setIcon(new ImageIcon(iconr.getImage().getScaledInstance(retroceder.getWidth(), retroceder.getHeight(), Image.SCALE_SMOOTH)));
		
		avanzar = new JButton();
		avanzar.setActionCommand(AVANZAR);
		avanzar.setBounds(828, 63, 24, 47);
		avanzar.setOpaque(false);
		avanzar.setContentAreaFilled(false);
		avanzar.setBorderPainted(false);
		icona = new ImageIcon("media/BotonAvanzo.png");
		avanzar.setIcon(new ImageIcon(icona.getImage().getScaledInstance(avanzar.getWidth(), avanzar.getHeight(), Image.SCALE_SMOOTH)));
		
		equipop = new JButton();
		equipop.setActionCommand(EQUIPOP);
		equipop.setBounds(250, 0, 250, 40);
		equipop.setOpaque(false);
		equipop.setContentAreaFilled(false);
		equipop.setBorderPainted(false);
		icone = new ImageIcon("media/BotonEquipo.png");
		equipop.setIcon(new ImageIcon(icone.getImage().getScaledInstance(equipop.getWidth(), equipop.getHeight(), Image.SCALE_SMOOTH)));
		
		cerrar = new JButton();
		cerrar.setActionCommand(CERRAR);
		cerrar.setBounds(605, 0, 256, 47);
		cerrar.setOpaque(false);
		cerrar.setContentAreaFilled(false);
		cerrar.setBorderPainted(false);
		iconc = new ImageIcon("media/BotonCerrarCaja.png");
		cerrar.setIcon(new ImageIcon(iconc.getImage().getScaledInstance(cerrar.getWidth(), cerrar.getHeight(), Image.SCALE_SMOOTH)));
		
		mote = new JLabel("");
		mote.setForeground(Color.black);
		mote.setBounds(50,60,300,25);
		mote.setFont(this.tipoLetra(1,22));
		
		caja = new JLabel("CAJA");
		caja.setForeground(Color.black);
		caja.setBounds(480,65,300,60);
		caja.setFont(this.tipoLetra(1,35));
		
		numcaja = new JLabel("1");
		numcaja.setForeground(Color.black);
		numcaja.setBounds(600,65,300,60);
		numcaja.setFont(this.tipoLetra(1,35));
		
		tipo1 = new JLabel("");
		tipo1.setForeground(Color.black);
		tipo1.setBounds(35,300,300,25);
		tipo1.setFont(this.tipoLetra(1,22));
		
		tipo2 = new JLabel("");
		tipo2.setForeground(Color.black);
		tipo2.setBounds(35,330,300,25);
		tipo2.setFont(this.tipoLetra(1,22));
		
		grupo = new JLabel("");
		grupo.setForeground(Color.black);
		grupo.setBounds(35,360,300,25);
		grupo.setFont(this.tipoLetra(1,22));
		
		ataque1 = new JLabel("");
		ataque1.setForeground(Color.black);
		ataque1.setBounds(35,390,300,25);
		ataque1.setFont(this.tipoLetra(1,22));
		
		ataque2 = new JLabel("");
		ataque2.setForeground(Color.black);
		ataque2.setBounds(35,420,300,25);
		ataque2.setFont(this.tipoLetra(1,22));
		
		ataque3 = new JLabel("");
		ataque3.setForeground(Color.black);
		ataque3.setBounds(35,450,300,25);
		ataque3.setFont(this.tipoLetra(1,22));
		
		ataque4 = new JLabel("");
		ataque4.setForeground(Color.black);
		ataque4.setBounds(35,480,300,25);
		ataque4.setFont(this.tipoLetra(1,22));
		
		nivel = new JLabel("");
		nivel.setForeground(Color.black);
		nivel.setBounds(35,510,300,25);
		nivel.setFont(this.tipoLetra(1,22));
		
		pokemon = new JPanel(new GridLayout(FILAS, COLUMNAS));
		pokemon.setBounds(278, 161, 555, 368);
		generarBotones();
		
		add(pokemon);
		add(nivel);
		add(ataque4);
		add(ataque3);
		add(ataque2);
		add(ataque1);
		add(grupo);
		add(tipo2);
		add(tipo1);
		add(numcaja);
		add(caja);
		add(mote);
		add(cerrar);
		add(equipop);
		add(avanzar);
		add(retroceder);
		add(imagen2);
		add(imagen);
	}
	
	public Font tipoLetra(int estilo,int tama?o) {
		Font tfont = font.deriveFont(estilo,tama?o);
		return tfont;
	}
	
	public void generarBotones() {
		for(int i = 0; i<=NUMBOTONES;i++) {
			String direc = "media/"+nombres[i]+"_icon.png";
			String ac = nombres[i];
			boton[i] = new JButton();
			boton[i].setName(nombres[i]);
			boton[i].setBounds(0, 0, 50, 50);
			boton[i].setOpaque(false);
			boton[i].setContentAreaFilled(false);
			boton[i].setBorderPainted(false);
			ImageIcon icon = new ImageIcon(direc);
			boton[i].setIcon(new ImageIcon(icon.getImage().getScaledInstance(boton[i].getWidth(), boton[i].getHeight(), Image.SCALE_SMOOTH)));
			
			pokemon.add(boton[i]);
		}
	}

	public JLabel getTipo1() {
		return tipo1;
	}

	public void setTipo1(JLabel tipo1) {
		this.tipo1 = tipo1;
	}

	public JLabel getTipo2() {
		return tipo2;
	}

	public void setTipo2(JLabel tipo2) {
		this.tipo2 = tipo2;
	}

	public JLabel getGrupo() {
		return grupo;
	}

	public void setGrupo(JLabel grupo) {
		this.grupo = grupo;
	}

	public JLabel getMote() {
		return mote;
	}

	public void setMote(JLabel mote) {
		this.mote = mote;
	}

	public JLabel getAtaque1() {
		return ataque1;
	}

	public void setAtaque1(JLabel ataque1) {
		this.ataque1 = ataque1;
	}

	public JLabel getAtaque2() {
		return ataque2;
	}

	public void setAtaque2(JLabel ataque2) {
		this.ataque2 = ataque2;
	}

	public JLabel getAtaque3() {
		return ataque3;
	}

	public void setAtaque3(JLabel ataque3) {
		this.ataque3 = ataque3;
	}

	public JLabel getAtaque4() {
		return ataque4;
	}

	public void setAtaque4(JLabel ataque4) {
		this.ataque4 = ataque4;
	}

	public JLabel getNivel() {
		return nivel;
	}

	public void setNivel(JLabel nivel) {
		this.nivel = nivel;
	}

	public JLabel getNumcaja() {
		return numcaja;
	}

	public void setNumcaja(JLabel numcaja) {
		this.numcaja = numcaja;
	}

	public JLabel getCaja() {
		return caja;
	}

	public void setCaja(JLabel caja) {
		this.caja = caja;
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

	public JLabel getImagen2() {
		return imagen2;
	}

	public void setImagen2(JLabel imagen2) {
		this.imagen2 = imagen2;
	}

	public JButton getRetroceder() {
		return retroceder;
	}

	public void setRetroceder(JButton retroceder) {
		this.retroceder = retroceder;
	}

	public JButton getAvanzar() {
		return avanzar;
	}

	public void setAvanzar(JButton avanzar) {
		this.avanzar = avanzar;
	}

	public JButton getEquipop() {
		return equipop;
	}

	public void setEquipop(JButton equipop) {
		this.equipop = equipop;
	}

	public JButton getCerrar() {
		return cerrar;
	}

	public void setCerrar(JButton cerrar) {
		this.cerrar = cerrar;
	}

	public String[] getNombres() {
		return nombres;
	}

	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}

	public ImageIcon getIconr() {
		return iconr;
	}

	public void setIconr(ImageIcon iconr) {
		this.iconr = iconr;
	}

	public ImageIcon getIcona() {
		return icona;
	}

	public void setIcona(ImageIcon icona) {
		this.icona = icona;
	}

	public ImageIcon getIcone() {
		return icone;
	}

	public void setIcone(ImageIcon icone) {
		this.icone = icone;
	}

	public ImageIcon getIconc() {
		return iconc;
	}

	public void setIconc(ImageIcon iconc) {
		this.iconc = iconc;
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

	public String getIconpokemon() {
		return iconpokemon;
	}

	public void setIconpokemon(String iconpokemon) {
		this.iconpokemon = iconpokemon;
	}

	public JButton[] getBoton() {
		return boton;
	}

	public void setBoton(JButton[] boton) {
		this.boton = boton;
	}
}
