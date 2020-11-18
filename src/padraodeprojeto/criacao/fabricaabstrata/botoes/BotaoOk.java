package padraodeprojeto.criacao.fabricaabstrata.botoes;

import javax.swing.JButton;

public abstract class BotaoOk extends JButton {
	
	public BotaoOk() {
		this.setText("Ok");
	}
	
	protected abstract void adicionaIcone();

}
