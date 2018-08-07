package taxonomia;

public class Arthropoda extends Animalia{
	
	private String filo = "Filo: Arthropoda";
	
	@Override
	public  String obterDescricao() {
		System.out.println(super.getReino());
		return filo;
	}

}
