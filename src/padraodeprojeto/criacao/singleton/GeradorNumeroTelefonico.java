package padraodeprojeto.criacao.singleton;

public class GeradorNumeroTelefonico {

	private static GeradorNumeroTelefonico instancia = null;
	private NumeroTelefonicoPersistencia numeroTelefonicoPersistencia = new NumeroTelefonicoPersistencia();
	
	private GeradorNumeroTelefonico() {
		this.numeroTelefonico = this.numeroTelefonicoPersistencia.recuperar();
	};
	
	public synchronized static GeradorNumeroTelefonico getInstancia () {
		if (instancia == null)
			instancia = new GeradorNumeroTelefonico();
		return instancia;
	}
	
	private int numeroTelefonico;
	
	public synchronized int getNovoNumero () {
		this.numeroTelefonico++;
		this.numeroTelefonicoPersistencia.salvar(this.numeroTelefonico);
		return this.numeroTelefonico;
	}
	
}
