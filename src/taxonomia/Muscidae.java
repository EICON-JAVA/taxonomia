package taxonomia;

public class Muscidae extends Diptera{
	
	private String familia = "Familia: Muscidae";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return familia;
	}
}
