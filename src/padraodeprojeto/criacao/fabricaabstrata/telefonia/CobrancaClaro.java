package padraodeprojeto.criacao.fabricaabstrata.telefonia;

public class CobrancaClaro implements Cobranca {

	@Override
	public void cobrar(int telefone) {
        System.out.println("Cobrar via Claro");			
	}

}
