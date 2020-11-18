package padraodeprojeto.criacao.fabricaabstrata.telefonia;

public class EnvioSMSVivo implements EnvioSMS {

    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" +  msg.texto + 
                " para o telefone Vivo: " + telefone );
        return true;
    }  	
}
