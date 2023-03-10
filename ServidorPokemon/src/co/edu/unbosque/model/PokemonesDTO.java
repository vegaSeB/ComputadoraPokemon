package co.edu.unbosque.model;

import java.io.Serializable;

public class PokemonesDTO implements Serializable{
	private String nombre, tipo1, tipo2, ataque1, ataque2, ataque3, ataque4, mote;
	private int id;
	public PokemonesDTO(int id, String nombre, String tipo1, String tipo2, String ataque1, String ataque2, String ataque3, String ataque4, String mote) {
		this.id = id;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.ataque1 = ataque1;
		this.ataque2 = ataque2;
		this.ataque3 = ataque3;
		this.ataque4 = ataque4;
		this.mote = mote;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo1() {
		return tipo1;
	}
	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}
	public String getTipo2() {
		return tipo2;
	}
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	public String getAtaque1() {
		return ataque1;
	}
	public void setAtaque1(String ataque1) {
		this.ataque1 = ataque1;
	}
	public String getAtaque2() {
		return ataque2;
	}
	public void setAtaque2(String ataque2) {
		this.ataque2 = ataque2;
	}
	public String getAtaque3() {
		return ataque3;
	}
	public void setAtaque3(String ataque3) {
		this.ataque3 = ataque3;
	}
	public String getAtaque4() {
		return ataque4;
	}
	public void setAtaque4(String ataque4) {
		this.ataque4 = ataque4;
	}
	public String getMote() {
		return mote;
	}
	public void setMote(String mote) {
		this.mote = mote;
	}
	
}
