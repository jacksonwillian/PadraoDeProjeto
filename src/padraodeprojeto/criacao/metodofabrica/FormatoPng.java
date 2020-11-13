/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraodeprojeto.criacao.metodofabrica;

/**
 *
 * @author jackson
 */
public class FormatoPng implements Formato {

	@Override
	public Imagem gerar() {
        System.out.println("gerou PNG");
		return null;
	}
    
}
