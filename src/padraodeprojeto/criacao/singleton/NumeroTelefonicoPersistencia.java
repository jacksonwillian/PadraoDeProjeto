package padraodeprojeto.criacao.singleton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.logging.Level; 
import java.util.logging.Logger; 


public class NumeroTelefonicoPersistencia {

	private String diretorioArquivo = "BackupTelefonico.txt";
	private Logger logger = null;
	
	public NumeroTelefonicoPersistencia () {
		this.logger = Logger.getLogger( NumeroTelefonicoPersistencia.class.getName() );
	}
	
	public void salvar (int numeroTelefonico) {
		
		String linha =  Integer.toString(numeroTelefonico); 
		
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(this.diretorioArquivo, false));
			escritor.write(linha);
			escritor.close();
		} catch (IOException e) {
			this.logger.log(Level.WARNING, e.toString());
		}
	}
	
	
	public int recuperar () {
		
		int numeroTelefonico = 999990100;
		String linha = "";
		
		try {
			BufferedReader leitor = new BufferedReader(new FileReader( this.diretorioArquivo ));
			linha = leitor.readLine();
			leitor.close();
			if (linha.matches("[0-9]+") && (Integer.parseInt(linha) >= numeroTelefonico))
				numeroTelefonico = Integer.parseInt(linha);			
		} catch (FileNotFoundException e) {
			this.logger.log(Level.WARNING, e.toString());
		} catch (IOException e) {
			this.logger.log(Level.WARNING, e.toString());
		}

		return numeroTelefonico;
	}
	
}
