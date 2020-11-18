package padraodeprojeto.criacao.fabricaabstrata.telefonia;

public class CobrancaVivo implements Cobranca {

    @Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via Vivo");
    }
    
}
