package biblioteca;

public class Livro extends Exemplar {
	public String autor;
	public String editora;
	public String edicao;
	public String volume;
	
public Livro (String titulo, String subTitulo, boolean disponibilidade, Usuario cliente,String autor, String editora, String edicao, String volume){
	super(titulo, subTitulo, disponibilidade, cliente);
	this.autor = autor;
	this.editora = editora;
	this.edicao = edicao;
	this.volume = volume;
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
