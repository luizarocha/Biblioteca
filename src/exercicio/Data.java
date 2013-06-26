package exercicio;

public class Data {
	public int dia;
	public int mes;
	public int ano;

	public Data (int dia,int mes, int ano ) {
		if ((dia <0) || (dia > 32)) {
			dia = 1;
		}

		if ((mes <0) || (mes>12)){
			mes = 1;
		}

		if (ano <0){
			ano = 1990;
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getdia (){
		return this.dia;
	}

	public void setdia (int dia){
		this.dia = dia;
	}

	public int getmes (){
		return this.mes;
	}

	public void setmes (int mes) {
		this.mes = mes;
	}

	public int getano (){
		return this.dia;
	}

	public void setano (int ano) {
		this.ano = ano;
	}

	public String barra (){
		String s = new String (this.dia + "/" +this.mes + "/" +this.ano);		
		return s;
	}

	public void avancaDia () {
		this.dia = this.dia+1;
		if (this.dia>31){
			this.dia = 1;
			this.mes= this.mes+1;	
			if (this.mes > 12) {
				this.mes = 1;
				this.ano = this.ano+1;
			}

		}

	}




	public static void main (String [] args) {

		Data d = new Data (31,12,2013);
		System.out.println ("Data: "+ d.barra());
		d.avancaDia();
		System.out.println ("Data:"+ d.barra());
	}
	
	

}







