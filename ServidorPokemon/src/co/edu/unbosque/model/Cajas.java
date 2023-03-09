package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import co.edu.unbosque.model.persistence.ManejoArchivo;

public class Cajas {
	private ArrayList<ModeloPokemones> pokemones;
	private ManejoArchivo modelo_pokemones;
	private String ataque1, ataque2, ataque3, ataque4;
	private ArrayList<String> movimientos_aux,movimientos, lista;
	
	public Cajas() {
		this.movimientos_aux = new ArrayList<>();
		this.movimientos = new ArrayList<>();
		this.ataque1 = "";
		this.ataque2 = "";
		this.ataque3 = "";
		this.ataque4 = "";
		this.modelo_pokemones = new ManejoArchivo();
		this.pokemones = new ArrayList<>();
		this.lista = new ArrayList<>();
		ponerAtaques();
		this.lista = this.modelo_pokemones.devolverPokemones();
	}
	
	public void ponerAtaques() {
		this.movimientos_aux = this.modelo_pokemones.devolverMovimientos();
		for(int i = 0;i<this.movimientos_aux.size();i++){
			String[] aux = this.movimientos_aux.get(i).split("#");
			String a = aux[1];
			this.movimientos.add(a);
		}
	}
	
	public void agregarPokemon(String tipo1, String tipo2, String grupo_huevo, String mote, String ataque1, String ataque2,
			String ataque3, String ataque4, int nivel) {
		ModeloPokemones a = new ModeloPokemones(tipo1, tipo2, grupo_huevo, mote, this.ataque1, this.ataque2,
				this.ataque3, this.ataque4, nivel);
		this.pokemones.add(a);
	}
	
	public boolean deleteUser(String mote,ArrayList<ModeloPokemones>pokemones) {
		boolean a = false;
		for(int i = 0; i<pokemones.size();i++) {
			if(pokemones.get(i).getMote() == mote) {
				pokemones.remove(i);
				a = true;
			}
		}
		return a;
	}
	
	public String generarAtaques() {
		Random n = new Random();
		String[] aux = new String[4];
        for (int i = 0; i < 4; i++) {
            int numero = n.nextInt(850);
            while (Arrays.asList(aux).contains(this.movimientos.get(numero))) {
                numero = n.nextInt(this.movimientos.size());
            }
            aux[i] = this.movimientos.get(numero);
        }
        String devolver = aux[0]+";"+aux[1]+";"+aux[2]+";"+aux[3];
		return devolver;
	}
	
	public void agregarPokemonesArchivo(){
		for(int i = 0;i<this.lista.size();i++) {
			String aux = generarAtaques();
			String[] random = aux.split(";");
			String[] pokemon = this.lista.get(i).split(";");
			agregarPokemon(pokemon[0], pokemon[1], pokemon[2], pokemon[3], random[0], random[1], random[2], random[3], Integer.parseInt(pokemon[5]));
			
			//SE IMPRIMEN LOS POKEMONES GENERADOS
			System.out.println(pokemon[0]+ pokemon[1]+ pokemon[2]+ pokemon[3]+ random[0]+ random[1]+ random[2]+ random[3]+ pokemon[5]);
		}
	}
}
