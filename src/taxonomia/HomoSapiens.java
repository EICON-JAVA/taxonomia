package taxonomia;

public class HomoSapiens extends Homo{

	private String homo = "Esp�cie: Homo sapiens";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return homo;
	}
}
