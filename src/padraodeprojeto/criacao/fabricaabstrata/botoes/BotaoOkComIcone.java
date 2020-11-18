package padraodeprojeto.criacao.fabricaabstrata.botoes;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotaoOkComIcone extends BotaoOk {

	public BotaoOkComIcone() {
		adicionaIcone();
	}

	@Override
	protected void adicionaIcone() {
		
		String caminhoParaImagem = "icon/Ok-icon.png"; 
		Image imagem = null;
		try {
			imagem = ImageIO.read(getClass().getResource(caminhoParaImagem)); 
		} catch (IOException ex) {
			Logger.getLogger(BotaoOkComIcone.class.getName()).log(Level.SEVERE, null, ex); 
		}
		
		this.setIcon(new ImageIcon(imagem));
		 
	}

}
