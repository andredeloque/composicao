package br.com.db1.oo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("André");
		
		Endereco endereco = new Endereco ();
		endereco.setLogradouro("Mato");
		endereco.setNumero("123");
		endereco.setBairro("Aliança");
		endereco.setCidade("Sarandi");
	}

}
