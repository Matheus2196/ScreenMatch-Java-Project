package br.com.screenmatch.modelos;

public class Serie extends Titulo{
	private int temporadas;
	private int episodiosPorTemporada;
	private int minutosPorEpisodio;
	
	public int setTemporadas(int temporadas) {
		return this.temporadas = temporadas;
	}
	
	public int setEpisodiosPorTemporada(int episodiosPorTemporada) {
		return this.episodiosPorTemporada = episodiosPorTemporada;
	}
	
	public int minutosPorEpisodio(int minutosPorEpisodio) {
		return this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosPorTemporada * minutosPorEpisodio;
	}
}
