
public class Empresa {
	Funcionario[] empregados;
	String cnpj;
	
	void adiciona(Funcionario f, int x){
		this.empregados[x] = f;
	}
	
	void mostraEmpregados(){
		for (int i=0; i< this.empregados.length; i++){
			empregados[i].mostra();
			System.out.println();
		}
	}
}
