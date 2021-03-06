package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;

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

		System.out.println("Contato Gravado");

		Funcionario funcionario = new Funcionario();
		FuncionarioDao fdao = new FuncionarioDao();

		funcionario.setNome("Muller");
		funcionario.setUsuario("theeam");
		funcionario.setSenha("passw0rd");

		fdao.adiciona(funcionario);

		System.out.println("Funcionario Gravado");
	}
}
