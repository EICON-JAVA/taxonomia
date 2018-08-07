package taxonomia;

public class HomoSapiens extends Homo{

	private String homo = "Espécie: Homo sapiens";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return homo;
	}
}
