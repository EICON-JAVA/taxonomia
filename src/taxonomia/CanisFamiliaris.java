package taxonomia;

public class CanisFamiliaris extends Canis{
	private String especie = "Esp�cie: Canis familiaris";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return especie;
	}

}
