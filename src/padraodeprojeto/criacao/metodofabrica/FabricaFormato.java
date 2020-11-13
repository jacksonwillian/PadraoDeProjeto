package padraodeprojeto.criacao.metodofabrica;

public class FabricaFormato {

	public static Formato gerarFormato(String formato) {
		Formato gerado = null;
		if ( formato.equalsIgnoreCase("jpeg") ) {			
			gerado = new FormatoJpeg();
		} else if ( formato.equalsIgnoreCase("png") ) {
			gerado = new FormatoPng();
		}else if ( formato.equalsIgnoreCase("gif") ) {
			gerado = new FormatoGif();
		}else if ( formato.equalsIgnoreCase("bmp") ) {
			gerado = new FormatoBmp();
		}
		return gerado;
	}
	
	
}
