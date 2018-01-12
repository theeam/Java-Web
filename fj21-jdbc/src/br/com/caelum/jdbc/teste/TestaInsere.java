package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Eduardo");
		contato.setEmail("eduuardomuller@hotmail.com");
		contato.setEndereco("Rua da Avenida, 23");
		contato.setDataNascimento(Calendar.getInstance());

		// gravar nessa conexao
		ContatoDao dao = new ContatoDao();

		// adicionar contato
		dao.adiciona(contato);

		System.out.println("Gravado");

	}
}
