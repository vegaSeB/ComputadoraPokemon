package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ManejoArchivo {
	private File movimientos, pokemones;
	private FileInputStream fis;
	private ObjectInputStream ois;
	private Scanner sn;
	private ArrayList<String> lista_movimiento, lista_ataques;
	private String ruta_movimientos = "./Datos/Movimientos.txt";
	private String ruta_pokemones = "./Datos/pokemones.txt";
	
	public ManejoArchivo() {
		this.lista_ataques = new ArrayList<>();
		this.lista_movimiento = new ArrayList<>();
	}
	public ArrayList<String> devolverMovimientos() {
		this.movimientos = new File(ruta_movimientos);
		try {
			this.sn = new Scanner(movimientos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (sn.hasNextLine()) {
            String linea = sn.nextLine();
            lista_ataques.add(linea);
        }	
		return this.lista_ataques;
	}
	
	public ArrayList<String> devolverPokemones() {
		this.pokemones = new File(ruta_pokemones);
		try {
			this.sn = new Scanner(pokemones);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (sn.hasNextLine()) {
            String linea = sn.nextLine();
            lista_movimiento.add(linea);
        }	
		return this.lista_movimiento;
	}
	public ArrayList<String> getLista_movimiento() {
		return lista_movimiento;
	}
	public void setLista_movimiento(ArrayList<String> lista_movimiento) {
		this.lista_movimiento = lista_movimiento;
	}
	public ArrayList<String> getLista_ataques() {
		return lista_ataques;
	}
	public void setLista_ataques(ArrayList<String> lista_ataques) {
		this.lista_ataques = lista_ataques;
	}
	
}
