package taxonomia;

public class Hominidae extends Primata{

private String familia = "familia: Hominidae";
	
	@Override
	public String obterDescricao() {
	
		System.out.println(super.obterDescricao());
	
		return familia;
	}
}
