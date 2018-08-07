package taxonomia;

public class Insecta extends Arthropoda{

	private String classe = "Classe: Insecta";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return classe;
	}
}
