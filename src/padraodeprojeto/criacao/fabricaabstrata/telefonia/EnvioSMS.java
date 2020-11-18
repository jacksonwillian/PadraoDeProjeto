package padraodeprojeto.criacao.fabricaabstrata.telefonia;

public interface EnvioSMS {
	
    public boolean enviar(Mensagem msg, int telefone);                    

}
