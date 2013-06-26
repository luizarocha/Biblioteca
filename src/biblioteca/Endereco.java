/*Alunos: Bruno Guilherme Ferreira dos Santos e Luiza Carolina Rocha - Téc. em Informática - tarde */
package biblioteca;
import exercicio.Data;

public class Endereco extends Usuario {
	public String logradouro;
	public String nome;
	public String complemento;
	public String bairro;
	public String cep;
	public String cidade;
	public String estado;
	public String pais;

	public Endereco (String nome, String sobrenome, String cpf, Data datNasc, String endereco, String exemEmpres,String logradouro, String nome, String complemento, String bairro, String cep, String cidade, String estado, String pais){
	super (nome, sobrenome, cpf, datNasc, endereco, exemEmpres);
	this.logradouro = logradouro;
	this.nome = nome;
	this.complemento = complemento;
	this.bairro = bairro;
	this.cep = cep;
	this.cidade = cidade;
	this.estado = estado;
	this.pais = pais;	
}
public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}

}
