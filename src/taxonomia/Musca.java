package taxonomia;

public class Musca extends Muscidae{
	
	private String genero = "G�nero: Musca";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return genero;
	}

}
