package taxonomia;

public class CanisFamiliaris extends Canis{
	private String especie = "Espécie: Canis familiaris";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return especie;
	}

}
