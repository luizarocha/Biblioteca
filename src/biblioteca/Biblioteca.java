/*Alunos: Bruno Guilherme Ferreira dos Santos e uiza Carolina Rocha - T�c. em Inform�tica - tarde */
package biblioteca;
import exercicio.Data;
public class Biblioteca {
	public static void main(String[] args) {

		
/*Usu�rio*/
		Usuario a = new Usuario("Luiza" , "Rocha", "0326-96-01", new Data(08, 06, 1996), new Endereco("rua", "Sete de Setembro", "Casa", "Centro", "83005-100", "S�o Jos� dos Pinhais", "Paran�", "Brasil"));
		Usuario b = new Usuario("Bruno", "Guilherme", "23695-6", new Data(02, 12, 1996), new Endereco("rua","Ant�nio Bastista de Bastos" , "casa", "Ina", "8695-300", "S�o Jos� dos Pinhais", "Paran�", "Brasil"));
		
		
		
		Exemplar e1 = new Livro("Orgulho e Preconceito", null, true, "Jane Austen");
		Exemplar e2 = new Livro("As Cr�nicas de Gelo e Fogo", null, true, "George R. R. Martin.");
		Exemplar a1 = new Artigo("O Rei na Barriga", "Como Ser Um Sozinho", true, "B. ", "Famec");
		Exemplar a2 = new Artigo("O Rei na Barriga 2", "Como Ter Orgulho Sendo Um Nada", true, "", "Famec");
		Exemplar b1 = new Revista("Mensal do Sozinho", "Ningu�m me ama (al�m de min)", true , "Janeiro");
		Exemplar b2 = new Revista("Como me Apaixonei por uma Lesbian", subTitulo, disponibilidade, editora)
	}
}
