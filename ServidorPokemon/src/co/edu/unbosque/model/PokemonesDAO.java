package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import co.edu.unbosque.model.persistence.ManejoArchivo;

public class PokemonesDAO {
	private ArrayList<PokemonesDTO> pokemones;
	private ManejoArchivo modelo_pokemones;
	private String ataque1, ataque2, ataque3, ataque4;	
	private ArrayList<String> ataques_aux,ataques, soporte;
	private String mote;
	
	public PokemonesDAO() {
		this.pokemones = new ArrayList<>();
		this.mote = "";
		this.modelo_pokemones = new ManejoArchivo();
		this.modelo_pokemones.leerPokemones();
		this.modelo_pokemones.leerAtaques();
		
		this.ataques = this.modelo_pokemones.getAtaques();
		this.soporte = this.modelo_pokemones.getPokemones();
		
		this.ataques_aux = new ArrayList<>();
		this.ataque1 = "";
		this.ataque2 = "";
		this.ataque3 = "";
		this.ataque4 = "";
	}
	
	public void agregarPokemon(int id, String nombre, String tipo1, String tipo2, String ataque1, String ataque2, String ataque3, String ataque4, String mote) {
		PokemonesDTO a = new PokemonesDTO(id, nombre, tipo1, tipo2, ataque1, ataque2, ataque3, ataque4, mote);
		this.pokemones.add(a);
	}
	public String[] separar(int i) {
		String datos = this.soporte.get(i);
		String[] a = datos.split(";");
		return a;
	}
	
	public String generarAtaques() {
		Random n = new Random();
		String[] aux = new String[4];
        for (int i = 0; i < 4; i++) {
            int numero = n.nextInt(850);
            while (Arrays.asList(aux).contains(this.ataques.get(numero))) {
                numero = n.nextInt(this.ataques.size());
            }
            String aux2 = this.ataques.get(numero);
            String[] aux3 = aux2.split("#");
            aux[i] = aux3[1];
        }
        String devolver = aux[0]+";"+aux[1]+";"+aux[2]+";"+aux[3];
		return devolver;
	}
	
	public void agregarPokemonesDAO(){
		for(int i = 0;i<this.soporte.size();i++) {
			String[] pokemones = separar(i);
			String aux = generarAtaques();
			String[] random = aux.split(";");
			agregarPokemon(Integer.parseInt(pokemones[0]), pokemones[1], pokemones[2], pokemones[3],random[0], random[1], random[2], random[3], this.mote);
		}
	}

	public ArrayList<PokemonesDTO> getPokemones() {
		return pokemones;
	}

	public void setPokemones(ArrayList<PokemonesDTO> pokemones) {
		this.pokemones = pokemones;
	}
	
}
