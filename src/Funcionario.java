
public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String RG;
	
	void novoFuncionario (String nome, String rg, String data){
		this.nome = nome;
		this.RG = rg;
		this.dataEntrada = data;
	}
	
	void setDepartamento(String area){
		this.departamento = area;
	}
	
	void recebeAumento(double valor){
		this.salario += valor;
	}
	
	double calculaGanhoAnual(){
		return this.salario*12;
	}
	
	void mostra(){
		System.out.println("Nome:" + this.nome);
		System.out.println("RG:" + this.RG);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Salário:" + this.salario);
		System.out.println("Data de entrada:" + this.dataEntrada);
	}
	
}
