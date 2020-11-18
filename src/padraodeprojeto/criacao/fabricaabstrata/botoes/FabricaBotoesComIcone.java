package padraodeprojeto.criacao.fabricaabstrata.botoes;

import javax.swing.JButton;

public class FabricaBotoesComIcone extends FabricaAbstrataBotoes {

	@Override
	public BotaoOk criarBotaoOK() {
		BotaoOk botaoOk = new BotaoOkComIcone();
		return botaoOk;
	}

	@Override
	public BotaoCancelar criarBotaoCancelar() {
		BotaoCancelar botaoCancelar = new BotaoCancelarComIcone();
		return botaoCancelar;	
	}

}
