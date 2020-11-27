package padraodeprojeto.criacao.construtor.refeicao;



public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        
        System.out.println("== Refeição sem pedido extra ==");
        System.out.println("\npedido nº1");
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco");
        System.out.println("\npedido nº2");
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante");

        System.out.println("\n\n== Refeição com pedido extra == ");
        System.out.println("\npedido nº3");
        Refeicao refeicao3 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", "batata");  
        System.out.println("\npedido nº4");
        Refeicao refeicao4 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", "batata");        
        
    }    
}
