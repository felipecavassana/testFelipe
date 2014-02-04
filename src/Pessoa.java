
public class Pessoa {
	String nome;
	int idade;
	
	void iniciaDados(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	void fazAniversario(){
		this.idade++;
	}
	
	void fazAniversario(int qtd){
		this.idade += qtd;
	}
	
	void imprimir(){
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: "+ this.idade);
	}
}
