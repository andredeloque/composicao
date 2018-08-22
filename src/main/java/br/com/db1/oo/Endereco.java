package br.com.db1.oo;

public class Endereco {
	private String tipoLogradouro;
	private String logradouro;
	private String numero;
	private String bairro;
	private Integer cep;
	private Cidade cidade;
	private String formataCep;

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getCep() {
		return cep;
	}


	public String getFormataCep() {
		return formataCep;
	}

	public void setFormataCep(String formataCep) {
		this.formataCep = formataCep;
	}

	public String formataCep() {
		return formataCep + cep;
	}

	public void setCidade(String string) {
		
	}
}
