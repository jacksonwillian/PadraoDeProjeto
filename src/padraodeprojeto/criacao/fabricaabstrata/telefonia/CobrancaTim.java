package padraodeprojeto.criacao.fabricaabstrata.telefonia;

public class CobrancaTim implements Cobranca {
	
	@Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via Tim");
    }
    
}
