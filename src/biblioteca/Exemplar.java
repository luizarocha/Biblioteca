/*Alunos: Bruno Guilherme Ferreira dos Santos e Luiza Carolina Rocha - Téc. em Informática - tarde */
package biblioteca;

public class Exemplar {
	public String titulo;
	public String subTitulo;
	public boolean disponibilidade;
	public Usuario cliente;
	
	
public Exemplar (String titulo, String subTitulo, boolean disponibilidade){
	this.titulo = titulo;
	this.subTitulo = subTitulo;
	this.disponibilidade = disponibilidade;
	this.cliente = null;
}
public String descricaoexemplar (){
	String descricao;
	descricao = ("\n Titulo"+ this.titulo + "\n Subtitulo" + this.subTitulo + "\n Disponibilidade" + this.disponibilidade + "\n Cliente" + this.cliente); 
	return descricao;
}

public void emprestar (Usuario usr){
    this.cliente = usr ;
	usr.setExemEmprestados(this);
	this.disponibilidade = false;
    //return false ;
}

public String verificar () {
	String nn;
	if(this.disponibilidade == false){
		nn = "exemplar emprestado";
	}
	else {
		nn = "exemplar disponivel";
	}
	return nn;
	}

public Usuario quemEmprestou (){
	Usuario nn = null;
	if (this.disponibilidade == false){
		nn = this.cliente;
	}
		return nn;
	
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getSubTitulo() {
	return subTitulo;
}

public void setSubTitulo(String subTitulo) {
	this.subTitulo = subTitulo;
}

public boolean isDisponibilidade() {
	return disponibilidade;
}

public void setDisponibilidade(boolean disponibilidade) {
	this.disponibilidade = disponibilidade;
}

public Usuario getCliente() {
	return cliente;
}

public void setCliente(Usuario cliente) {
	this.cliente = cliente;
}


}
