/*Alunos: Bruno Guilherme Ferreira dos Santos e Luiza Carolina Rocha - Téc. em Informática - tarde */

package biblioteca; /*Pacote*/
import exercicio.Data;
import java.util.ArrayList;

public class Usuario {   /*Classes*/
	public String nome;
	public String sobrenome;
	public String cpf;
	public Data datNasc;
	public Endereco end;
	public ArrayList<Exemplar> exemEmprestados;

	
	public Usuario (String nome, String sobrenome, String cpf, Data datNasc, Endereco end){ /*Construtor*/
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.datNasc = datNasc;
		this.end = end;
		this.exemEmprestados = new ArrayList<Exemplar>();;	
	}
	
	public void alterar  (Endereco endnn){ /*Alterar o endereço*/
		this.end = endnn;
	}
	
	public String getNome() { 
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Data getDatNasc() {
		return datNasc;
	}

	public void setDatNasc(Data datNasc) {
		this.datNasc = datNasc;
	}

	public Endereco getEndereco() {
		return end;
	}

	public void setEndereco(Endereco endereco) {
		this.end = endereco;
	}

	public ArrayList<Exemplar> getExemEmprestados() {
		return exemEmprestados;
	}

	public void setExemEmprestados(Exemplar e) {
		this.exemEmprestados.add(e);
	}
	
	
	public String dados (){
		String descricao;
		descricao = ("Nome:" + this.nome + "\n Sobrenome:" + this.sobrenome + "\n CPF" + this.cpf + "\n Data de nascimento: " + this.datNasc + "\n Endereço:" + this.end + "\n Exemplares emprestados:" + this.exemEmprestados);
		return descricao;
	}
	
	public String desCompleta (){
		String desCompleta = this.dados();
		for (Exemplar exemplar: this.exemEmprestados){
			desCompleta += exemplar.descricao();
			
		}
		return desCompleta;
	}
	}
