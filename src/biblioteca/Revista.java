/*Alunos: Bruno Guilherme Ferreira dos Santos e Luiza Carolina Rocha - Téc. em Informática - tarde */
package biblioteca;

public class Revista extends Exemplar{
	public String editora;
	public int numero;
	public float preco;

public Revista (String titulo, String subTitulo, boolean disponibilidade, String editora, int numero, float preco){
	super (titulo, subTitulo, disponibilidade);
	this.editora = editora;
	this.numero = numero;
	this.preco = preco;
}
public Revista (String titulo, String subTitulo, boolean disponibilidade, String editora){
	super (titulo, subTitulo, disponibilidade);
	this.editora = editora;
}

public Revista (String titulo, String subTitulo, boolean disponibilidade, String autor, String editora){
	super (titulo, subTitulo, disponibilidade);
	this.editora = editora;
}

public String descricaolivro (){
	String descricao;
	descricao = ("\n Titulo"+ this.titulo + "\n Subtitulo" + this.subTitulo + "\n Disponibilidade" + this.disponibilidade + "\n Nome do Cliente" + this.cliente.nome + "\n Editora" + this.editora + "\n Número:" + this.numero + "\n Preço:" + this.preco); 
	return descricao;
}
public String getEditora() {
	return editora;
}

public void setEditora(String editora) {
	this.editora = editora;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public float getPreco() {
	return preco;
}

public void setPreco(float preco) {
	this.preco = preco;
}
}
