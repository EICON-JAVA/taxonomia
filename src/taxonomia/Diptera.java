package taxonomia;

public class Diptera extends Insecta {
	
	private String ordem = "Ordem: Díptera";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return ordem;
	}

}
