package br.com.screenmatch.modelos;
import br.com.screenmatch.calculo.CalculadoraDeTempo;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("O poderoso chefão");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);

		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setDuracaoEmMinutos(60);
		lost.minutosPorEpisodio(50);
		
		Filme outroFilme = new Filme();
		outroFilme.setNome("Back to the future");
		outroFilme.setAnoDeLancamento(1985);
		outroFilme.setDuracaoEmMinutos(180);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		System.out.println(calculadora.getTempoTotal());
	}
}
