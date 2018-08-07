package taxonomia;

public class Chordata extends Animalia{
	
	private String filo = "Filo: \tChordata";
	
	public String obterDescricao() {
		
		System.out.println(super.getReino());
		return filo;
	}
}
