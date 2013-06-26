/*Alunos: Bruno Guilherme Ferreira dos Santos e Luiza Carolina Rocha - Téc. em Informática - tarde */
package biblioteca;

public class Artigo extends Exemplar {
	public String autores;
	public String universidade;
	public String editora;
	
public Artigo (String titulo, String subTitulo, boolean disponibilidade, String autores, String universidade, String editora){
	super (titulo, subTitulo, disponibilidade);
	this.autores = autores;
	this.universidade = universidade;
	this.editora = editora;
}

public Artigo (String titulo, String subTitulo, boolean disponibilidade, String autores, String universidade){
	super (titulo, subTitulo, disponibilidade);
	this.autores = autores;
	this.universidade = universidade;

}

public String descricaoartigo (){
	String descricaoartigo;
	descricaoartigo = ("\n Titulo"+ this.titulo + "\n Subtitulo" + this.subTitulo + "\n Disponibilidade" + this.disponibilidade + "\n Cliente" + this.cliente + "\n Autores" + this.autores +"\n Universidades"+ this.universidade + "\n Editora" + this.editora); 
	return descricaoartigo;
}
public String getAutores() {
	return autores;
}

public void setAutores(String autores) {
	this.autores = autores;
}

public String getUniversidade() {
	return universidade;
}

public void setUniversidade(String universidade) {
	this.universidade = universidade;
}

public String getEditora() {
	return editora;
}

public void setEditora(String editora) {
	this.editora = editora;
}

}
