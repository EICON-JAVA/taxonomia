package taxonomia;

public class Homo  extends Hominidae {
	
	private String homo = "G�nero: Homo";
	
	@Override
	public String obterDescricao() {
	
		System.out.println(super.obterDescricao());
	
		return homo;
	}
}
