package br.com.screenmatch.modelos;

import br.com.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel{
	private int numero;
	private String nome;
	private Serie serie;
	private int totalVisualizacaoes;
	
	public int getTotalVisualizacoes() {
		return totalVisualizacaoes;
	}
	
	public int setTotalVisualizacoes(int TotalVisualizacoes) {
		return this.totalVisualizacaoes + totalVisualizacaoes;
	}
	
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
	
	@Override
	public int getClassificacao() {
		if (totalVisualizacaoes > 100) {
			return 4;
		} else {
			return 2;
		}
	}
}
