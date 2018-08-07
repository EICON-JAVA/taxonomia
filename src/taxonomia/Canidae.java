package taxonomia;

public class Canidae extends Carnivora{
	private String familia = "Familia: Canidae";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return familia;
	}

}
