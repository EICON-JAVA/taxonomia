package taxonomia;

public class Carnivora extends Mammalia{
	
	private String ordem = "ordem: Carnívora";
	
	@Override
	public String obterDescricao() {
		System.out.println(super.obterDescricao());
		return ordem;
	}
}
