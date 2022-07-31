package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		
		Caixa<String> CaixaA = new Caixa<>();
		CaixaA.guardar("Segredo!");
		
		System.out.println(CaixaA.abrir());
	}
}
