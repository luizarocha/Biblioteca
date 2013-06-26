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

public boolean emprestar (String titulo){
	if (this.titulo)
	
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

public String dadosExem (){
	String descricao;
	descricao = (titulo,sub); 
	return descricao;