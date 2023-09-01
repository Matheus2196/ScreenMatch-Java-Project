import br.com.screenmatch.modelos.Filme;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("O poderoso chef�o");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);

		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);

		System.out.println("Total de avaliações " + meuFilme.getTotalAvaliacoes());
		//System.out.println(meuFilme.pegaMedia());
	}
}
