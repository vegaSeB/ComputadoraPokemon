package co.edu.unbosque.model;

import java.io.Serializable;

public class ModeloPokemones implements Serializable{
	private String tipo1, tipo2, grupo_huevo, mote, ataque1, ataque2, ataque3, ataque4;
	private int nivel;
	public ModeloPokemones(String tipo1, String tipo2, String grupo_huevo, String mote, String ataque1, String ataque2,
			String ataque3, String ataque4, int nivel) {
		super();
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.grupo_huevo = grupo_huevo;
		this.mote = mote;
		this.ataque1 = ataque1;
		this.ataque2 = ataque2;
		this.ataque3 = ataque3;
		this.ataque4 = ataque4;
		this.nivel = nivel;
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
	public String getGrupo_huevo() {
		return grupo_huevo;
	}
	public void setGrupo_huevo(String grupo_huevo) {
		this.grupo_huevo = grupo_huevo;
	}
	public String getMote() {
		return mote;
	}
	public void setMote(String mote) {
		this.mote = mote;
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
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
}
