package taxonomia;

public class Carnivora extends Mammalia{
	
	private String ordem = "ordem: Carn�vora";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return ordem;
	}
}
