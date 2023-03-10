package co.edu.unbosque.model.persistence;

<<<<<<< Updated upstream
public class ManejoArchivo {

=======
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;


public class ManejoArchivo {
	private File f, a;
	private FileInputStream fis;
	private ObjectInputStream ois;
	private ArrayList<String> pokemones;
	private ArrayList<String> ataques;
	private Scanner scanner;
	
	public ManejoArchivo() {
		this.pokemones = new ArrayList<>();
		this.ataques = new ArrayList<>();
		this.a = new File("./Datos/pokemones2.txt");
		this.f = new File("./Datos/ataques.data");
	}
	public String escribirPokemones(String content) {
		Writer out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(f, true), "UTF-8"));
            try {
                out.append("\n"+content);
                out.flush();
                out.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } catch (UnsupportedEncodingException ex) {
        	System.out.println(ex);
        } catch (FileNotFoundException ex) {
        	ex.printStackTrace();
        }
        return "Se escribio correctamente el archivo";
	}
	
	public String leerPokemones() {
		try {
			this.scanner = new Scanner(a);
			String str = "";
			
			while (scanner.hasNextLine()) {
			    pokemones.add(scanner.nextLine());
			}
			scanner.close();
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}		
		return "Se leyó el archivo correctamente";
	}
	
	public String leerAtaques() {
		String mj = "";
		try {
			this.fis = new FileInputStream(f);
			this.ois = new ObjectInputStream(fis);
			this.ataques = (ArrayList<String>) ois.readObject();
			this.ois.close();
		} catch (Exception e) {
			
			return ""+e;
		}
		return mj;
	}
	
	public ArrayList<String> getPokemones() {
		return pokemones;
	}
	public void setPokemones(ArrayList<String> pokemones) {
		this.pokemones = pokemones;
	}
	
	public ArrayList<String> getAtaques() {
		return ataques;
	}

	public void setAtaques(ArrayList<String> ataques) {
		this.ataques = ataques;
	}
	
	
	
>>>>>>> Stashed changes
}
