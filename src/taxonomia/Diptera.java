package taxonomia;

public class Diptera extends Insecta {
	
	private String ordem = "Ordem: D�ptera";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return ordem;
	}

}
