package taxonomia;

public class Canis extends Canidae{

	private String genero = "G�nero: Canis";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return genero;
	}
}
