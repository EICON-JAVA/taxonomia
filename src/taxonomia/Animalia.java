package taxonomia;

public abstract class Animalia {

	private String reino = "Reino: \tAnimalia";
	
	public Animalia() {
		getReino();
	}
	
	public String getReino() {
		return reino;
	}
	
	public void exibeNaTela(String descricao) {
		System.out.println();
	}

	protected abstract String obterDescricao();
}
