package br.com.screenmatch.modelos;

public class Filme {
	public String nome;
	 public int anoDeLancamento;
	public boolean incluidoNoPlano;
	private  double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	public int duracaoEmMinutos;

	public int getTotalAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void exibeFichaTecnica() {
		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	}

	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}

	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
}
