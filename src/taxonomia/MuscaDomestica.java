package taxonomia;

public class MuscaDomestica extends Musca{
	
	private String especie = "Espécie: Musca domestica";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return especie;
	}

}
