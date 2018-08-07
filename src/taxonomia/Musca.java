package taxonomia;

public class Musca extends Muscidae{
	
	private String genero = "Gênero: Musca";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return genero;
	}

}
