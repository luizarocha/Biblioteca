/*Alunos: Bruno Guilherme Ferreira dos Santos e Luiza Carolina Rocha - Téc. em Informática - tarde */
package biblioteca;

public class Livro extends Exemplar {
	public String autor;
	public String editora;
	public String edicao;
	public String volume;
	
public Livro (String titulo, String subTitulo, boolean disponibilidade, String autor, String editora, String edicao, String volume){
	super (titulo, subTitulo, disponibilidade);
	this.autor = autor;
	this.editora = editora;
	this.edicao = edicao;
	this.volume = volume;
	
}

public Livro (String titulo, String subTitulo, boolean disponibilidade, String autor){
	super (titulo, subTitulo, disponibilidade);
	this.autor = autor;
}

public String descricaolivro (){
	String descricao;
	descricao = ("\n Titulo"+ this.titulo + "\n Subtitulo" + this.subTitulo + "\n Disponibilidade" + this.disponibilidade + "\n Nome do Cliente" + this.cliente.nome + "\n Autor:" + this.autor + "\n editora" +this.editora + "\n edição"+ this.edicao +"\n volume" + this.volume ); 
	return descricao;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getEditora() {
	return editora;
}

public void setEditora(String editora) {
	this.editora = editora;
}

public String getEdicao() {
	return edicao;
}

public void setEdicao(String edicao) {
	this.edicao = edicao;
}

public String getVolume() {
	return volume;
}

public void setVolume(String volume) {
	this.volume = volume;
}


}
