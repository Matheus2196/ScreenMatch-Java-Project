package br.com.screenmatch.modelos;

public class Episodio {
	private int numero;
	private String nome;
	private Serie serie;
	
	public int getNumero() {
		return numero;
	}
	
	public int setNumero(int numero) {
		return this.numero = numero;
	}
	
	public String nome() {
		return nome;
	}
	
	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	public Serie getSerie() {
		return serie;
	}
	
	public Serie setSerie(Serie serie) {
		return this.serie = serie;
	}
}
