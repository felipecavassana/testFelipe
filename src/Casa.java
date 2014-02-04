
public class Casa {
	String cor;
	Porta[] portas;
	int totalDePortas;
	
	void pinta(String s){
		this.cor = s;
	}
	
	int quantasPortasEstaoAbertas(){
		int count = 0;
		for (Porta i : this.portas){
			if (i.estaAberta()){
				count++;
			}
		}
		return count;
	}
	
	void adicionaPorta(Porta p){
		this.portas[this.totalDePortas] = p;
		this.totalDePortas++;
	}
	
	int totalDePortas(){
		return this.totalDePortas;
	}
	
	void imprimirStatus(){
		System.out.println("Nr. de portas: "+ this.totalDePortas);
		System.out.println("Nr. de portas abertas: "+ this.quantasPortasEstaoAbertas());
	}
}
