package padraodeprojeto.criacao.fabricaabstrata.botoes;

import javax.swing.JButton;

public class FabricaBotoesSemIcone extends FabricaAbstrataBotoes {

	@Override
	public BotaoOk criarBotaoOK() {
		BotaoOk botaoOk = new BotaoOkSemIcone();
		return botaoOk;
	}

	@Override
	public BotaoCancelar criarBotaoCancelar() {
		BotaoCancelar botaoCancelar = new BotaoCancelarSemIcone();
		return botaoCancelar;	
	}

}
