package padraodeprojeto.criacao.metodofabrica;

public class Cliente {

	public static void main(String[] args) {
		
		Formato formato;
		
		formato = FabricaFormato.gerarFormato("jpeg");
		formato.gerar();
		
		formato = FabricaFormato.gerarFormato("png");
		formato.gerar();
		
		formato = FabricaFormato.gerarFormato("gif");
		formato.gerar();

		formato = FabricaFormato.gerarFormato("bmp");
		formato.gerar();
	}

}
