
public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	String getNome(){
		return this.nome;
	}
	
	String getSobrenome(){
		return this.sobrenome;
	}
	
	String getCPF(){
		return this.cpf;
	}
	
	int getIdade(){
		return this.idade;
	}
	
	public void mudaCPF(String cpf){
		if (validaCPF(cpf)){
			this.cpf = cpf;
		}
	}
	
	private boolean validaCPF(String cpf){
		if (cpf.length() == 11 || cpf.length() == 14){
			return true;
		}else{
			return false;
		}
	}
}
