package padraodeprojeto.criacao.singleton;

public class Main {

	public static void main(String[] args) {
		
		GeradorNumeroTelefonico gerador;
		
		System.out.println("Gerador de número telefônico");
		
		gerador = GeradorNumeroTelefonico.getInstancia();
		System.out.println("Novo número gerado: " + gerador.getNovoNumero() );
		System.out.println("Novo número gerado: " + gerador.getNovoNumero() );
		System.out.println("Novo número gerado: " + gerador.getNovoNumero() );
		
		gerador = GeradorNumeroTelefonico.getInstancia();
		System.out.println("Novo número gerado: " + gerador.getNovoNumero() );
		System.out.println("Novo número gerado: " + gerador.getNovoNumero() );
	}

}
