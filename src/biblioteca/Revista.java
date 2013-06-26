package biblioteca;

public class Revista extends Exemplar{
	public String editora;
	public String numero;
	public float preco;

public Revista (String titulo, String subTitulo, boolean disponibilidade, Usuario cliente,String editora, String numero, float preco) {
	super (titulo, subTitulo, disponibilidade, cliente);
	this.editora = editora;
	this.numero = numero;
	this.preco = preco;
}

public String getEditora() {
	return editora;
}

public void setEditora(String editora) {
	this.editora = editora;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public float getPreco() {
	return preco;
}

public void setPreco(float preco) {
	this.preco = preco;
}
}
