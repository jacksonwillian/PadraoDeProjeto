package padraodeprojeto.criacao.construtor.refeicao;



public class DiretorRefeicao {        
    
    public Refeicao preparaNaoVegetariana(String sabor, String tipoBebida){       
        Refeicao novaRefeicao = new Refeicao();
        NonVegetarianoBuilder refeicaoBuilder = new NonVegetarianoBuilder(novaRefeicao);        
        if(tipoBebida.equalsIgnoreCase("refrigerante"))
            refeicaoBuilder.adicionarRefrigerante(sabor);
        else
            refeicaoBuilder.adicionarSuco(sabor);   
        refeicaoBuilder.prepadaHamburgerCarne();
        return novaRefeicao;        
    }     
    
    
    public Refeicao preparaVegetariana(String sabor, String tipoBebida){        
        Refeicao novaRefeicao = new Refeicao();
        VegetarianoBuilder refeicaoBuilder = new VegetarianoBuilder(novaRefeicao);        
        if(tipoBebida.equalsIgnoreCase("refrigerante"))
            refeicaoBuilder.adicionarRefrigerante(sabor);
        else
            refeicaoBuilder.adicionarSuco(sabor);
        refeicaoBuilder.preparaHamburgerVegetariano();
        return novaRefeicao;        
    }            


    public Refeicao preparaNaoVegetariana(String sabor, String tipoBebida, String opcional){       
        Refeicao refeicao = preparaNaoVegetariana(sabor, tipoBebida);
        NonVegetarianoBuilder refeicaoBuilder = new NonVegetarianoBuilder(refeicao);        
        if(opcional.equalsIgnoreCase("batata"))
        	refeicaoBuilder.preparaBatata();
        return refeicao;        
    }     
    
    
    public Refeicao preparaVegetariana(String sabor, String tipoBebida, String opcional){        
        Refeicao refeicao = preparaVegetariana(sabor, tipoBebida);
        VegetarianoBuilder refeicaoBuilder = new VegetarianoBuilder(refeicao);        
        if(opcional.equalsIgnoreCase("batata"))
        	refeicaoBuilder.preparaBatata();
        return refeicao;
    }            
    
}
