package taxonomia;

public class Mammalia extends Chordata{
	
	private String classe = "Classe: Mammalia";
	
	@Override
	public String obterDescricao() {
		
		System.out.println(super.obterDescricao());
		return classe;
	}
}
