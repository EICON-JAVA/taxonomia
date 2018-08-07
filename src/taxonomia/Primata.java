package taxonomia;

public class Primata extends Mammalia{

	private String ordem = "Ordem: \tPrimata";
	
	@Override
	public String obterDescricao() {
	
		System.out.println(super.obterDescricao());
	
		return ordem;
	}
}
