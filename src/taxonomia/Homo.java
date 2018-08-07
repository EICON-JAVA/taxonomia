package taxonomia;

public class Homo  extends Hominidae {
	
	private String homo = "Gênero: Homo";
	
	@Override
	public String obterDescricao() {
	
		System.out.println(super.obterDescricao());
	
		return homo;
	}
}
