package taxonomia;

public class Canis extends Canidae{

	private String genero = "Gênero: Canis";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return genero;
	}
}
