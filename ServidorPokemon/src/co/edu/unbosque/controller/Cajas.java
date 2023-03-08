package co.edu.unbosque.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import co.edu.unbosque.model.ModeloPokemones;

public class Cajas {
	private ArrayList<ModeloPokemones> pokemones;
	private String ataque1, ataque2, ataque3, ataque4;
	private String[] ataques;
	private String[] lista;
	
	public Cajas() {
		this.lista = new String[4];
		this.ataques = new String[8];
		this.ataques[0] = "Paga Extra";
		this.ataques[1] = "Puño Incremento";
		this.ataques[2] = "Campo de niebla";
		this.ataques[3] = "Plancha Voladora";
		this.ataques[4] = "carantona";
		this.ataques[5] = "Fuerza Lunar";
		this.ataques[6] = "Campo electrico";
		this.ataques[7] = "Eructo";
		this.ataque1 = "";
		this.ataque2 = "";
		this.ataque3 = "";
		this.ataque4 = "";
		this.pokemones = new ArrayList<>();
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
            int numero = n.nextInt(8);
            while (Arrays.asList(aux).contains(this.ataques[numero])) {
                numero = n.nextInt(this.ataques.length);
            }
            aux[i] = this.ataques[numero];
        }
        String devolver = aux[0]+";"+aux[1]+";"+aux[2]+";"+aux[3];
		return Arrays.toString(aux);
	}
	
	public void pokemones() {
		for(int i = 0;i<71;i++) {
			String[] pokemon = pokemonesPosibles(i).split(";");
			agregarPokemon(pokemon[0], pokemon[1], pokemon[2], pokemon[3], pokemon[4], pokemon[5], pokemon[6], pokemon[7], Integer.parseInt(pokemon[9]));
		}
	}
	
	public String pokemonesPosibles(int i){
		this.lista= new String[71];
		lista[i] = "Planta"+";"+"No tiene 2 tipos"+";"+"Campo"+";"+"Chespin"+";"+generarAtaques()+";"+"5";
		return lista[0];
	}
}
