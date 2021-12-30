package portifolio.model;

import java.time.LocalDate;

public class Registro {
	private String profissao;
	private String nomeCompleto;
	private Double minimoSalario;
	private Double maximoSalario;
	private LocalDate dataNascimento;
	private String cpf;
	private String rg;
	private Endereco endereco;
	private Long telefone;
	private String naturalidade;
	private String email;
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Double getMinimoSalario() {
		return minimoSalario;
	}
	public void setMinimoSalario(Double minimoSalario) {
		this.minimoSalario = minimoSalario;
	}
	public Double getMaximoSalario() {
		return maximoSalario;
	}
	public void setMaximoSalario(Double maximoSalario) {
		this.maximoSalario = maximoSalario;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Registro [profissao=" + profissao + ", nomeCompleto=" + nomeCompleto + ", minimoSalario="
				+ minimoSalario + ", maximoSalario=" + maximoSalario + ", dataNascimento=" + dataNascimento + ", cpf="
				+ cpf + ", rg=" + rg + ", endereco=" + endereco + ", telefone=" + telefone + ", naturalidade="
				+ naturalidade + ", email=" + email + "]";
	}
	
	
	

}