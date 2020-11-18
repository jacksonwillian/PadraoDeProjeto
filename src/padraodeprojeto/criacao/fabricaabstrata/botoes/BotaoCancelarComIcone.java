package padraodeprojeto.criacao.fabricaabstrata.botoes;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class BotaoCancelarComIcone extends BotaoCancelar {
	
	public BotaoCancelarComIcone() {
		adicionaIcone();
	}
	
	@Override
	protected void adicionaIcone() {
		
		String caminhoParaImagem = "icon/Cancel-icon.jpg"; 
		Image imagem = null;
		try {
			imagem = ImageIO.read(getClass().getResource(caminhoParaImagem)); 
		} catch (IOException ex) {
			Logger.getLogger(BotaoOkComIcone.class.getName()).log(Level.SEVERE, null, ex); 
		}
		
		this.setIcon(new ImageIcon(imagem));
	}

}
