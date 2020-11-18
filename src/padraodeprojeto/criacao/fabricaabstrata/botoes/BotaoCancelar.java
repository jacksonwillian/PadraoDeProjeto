package padraodeprojeto.criacao.fabricaabstrata.botoes;

import javax.swing.JButton;

public abstract class BotaoCancelar extends JButton {
	
	public BotaoCancelar() {
		this.setText("Cancelar");
	}
	
	protected abstract void adicionaIcone();

}
