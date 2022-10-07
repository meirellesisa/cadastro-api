package br.com.diego.cadastroapi.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class NotaFiscal {
	
	@Id
	@GeneratedValue
	private int numeroNota;
	
	@NotBlank
	private String data;
	
	
	@NotBlank
	private String CnpjCpfPrestador;
	
	@NotBlank
	private String nomePrestador;
	
	@NotBlank
	private String enderecoPrestador;

	@NotBlank
	private String municipioPrestador;
	
	@NotBlank
	private String UfPrestador;

	@NotBlank
	private String emailPrestador;
	
	@NotBlank
	private String telefonePrestador;

	
	@NotBlank
	private String CnpjCpfTomador;
	
	@NotBlank
	private String nomeTomador;
	
	@NotBlank
	private String enderecoTomador;
	
	@NotBlank
	private String municipioTomador;
	
	@NotBlank
	private String UfTomador;
	
	@NotBlank
	private String emailTomador;
	
	@NotBlank
	private String telefoneTomador;
	
	
	@NotBlank
	private String descricaoServico;
	
	
	@Min(0)
	private double valorNota;
	
	
	public NotaFiscal() {
		
	}


	public NotaFiscal(@NotBlank String data, @NotBlank String cnpjCpfPrestador,
			@NotBlank String nomePrestador, @NotBlank String enderecoPrestador, @NotBlank String municipioPrestador,
			@NotBlank String ufPrestador, @NotBlank String emailPrestador, @NotBlank String telefonePrestador,
			@NotBlank String cnpjCpfTomador, @NotBlank String nomeTomador, @NotBlank String enderecoTomador,
			@NotBlank String municipioTomador, @NotBlank String ufTomador, @NotBlank String emailTomador,
			@NotBlank String telefoneTomador, @NotBlank String descricaoServico, @Min(0) double valorNota) {
		super();
		this.data = data;
		CnpjCpfPrestador = cnpjCpfPrestador;
		this.nomePrestador = nomePrestador;
		this.enderecoPrestador = enderecoPrestador;
		this.municipioPrestador = municipioPrestador;
		UfPrestador = ufPrestador;
		this.emailPrestador = emailPrestador;
		this.telefonePrestador = telefonePrestador;
		CnpjCpfTomador = cnpjCpfTomador;
		this.nomeTomador = nomeTomador;
		this.enderecoTomador = enderecoTomador;
		this.municipioTomador = municipioTomador;
		UfTomador = ufTomador;
		this.emailTomador = emailTomador;
		this.telefoneTomador = telefoneTomador;
		this.descricaoServico = descricaoServico;
		this.valorNota = valorNota;
	}


	public int getNumeroNota() {
		return numeroNota;
	}


	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}





	public String getCnpjCpfPrestador() {
		return CnpjCpfPrestador;
	}


	public void setCnpjCpfPrestador(String cnpjCpfPrestador) {
		CnpjCpfPrestador = cnpjCpfPrestador;
	}


	public String getNomePrestador() {
		return nomePrestador;
	}


	public void setNomePrestador(String nomePrestador) {
		this.nomePrestador = nomePrestador;
	}


	public String getEnderecoPrestador() {
		return enderecoPrestador;
	}


	public void setEnderecoPrestador(String enderecoPrestador) {
		this.enderecoPrestador = enderecoPrestador;
	}


	public String getMunicipioPrestador() {
		return municipioPrestador;
	}


	public void setMunicipioPrestador(String municipioPrestador) {
		this.municipioPrestador = municipioPrestador;
	}


	public String getUfPrestador() {
		return UfPrestador;
	}


	public void setUfPrestador(String ufPrestador) {
		UfPrestador = ufPrestador;
	}


	public String getEmailPrestador() {
		return emailPrestador;
	}


	public void setEmailPrestador(String emailPrestador) {
		this.emailPrestador = emailPrestador;
	}


	public String getTelefonePrestador() {
		return telefonePrestador;
	}


	public void setTelefonePrestador(String telefonePrestador) {
		this.telefonePrestador = telefonePrestador;
	}


	public String getCnpjCpfTomador() {
		return CnpjCpfTomador;
	}


	public void setCnpjCpfTomador(String cnpjCpfTomador) {
		CnpjCpfTomador = cnpjCpfTomador;
	}


	public String getNomeTomador() {
		return nomeTomador;
	}


	public void setNomeTomador(String nomeTomador) {
		this.nomeTomador = nomeTomador;
	}


	public String getEnderecoTomador() {
		return enderecoTomador;
	}


	public void setEnderecoTomador(String enderecoTomador) {
		this.enderecoTomador = enderecoTomador;
	}


	public String getMunicipioTomador() {
		return municipioTomador;
	}


	public void setMunicipioTomador(String municipioTomador) {
		this.municipioTomador = municipioTomador;
	}


	public String getUfTomador() {
		return UfTomador;
	}


	public void setUfTomador(String ufTomador) {
		UfTomador = ufTomador;
	}


	public String getEmailTomador() {
		return emailTomador;
	}


	public void setEmailTomador(String emailTomador) {
		this.emailTomador = emailTomador;
	}


	public String getTelefoneTomador() {
		return telefoneTomador;
	}


	public void setTelefoneTomador(String telefoneTomador) {
		this.telefoneTomador = telefoneTomador;
	}


	public String getDescricaoServico() {
		return descricaoServico;
	}


	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}


	public double getValorNota() {
		return valorNota;
	}


	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}


	
	
	
	
	
	
	
	
	
	
	

}
