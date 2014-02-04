
public class Conta {
	private static int totalDeContas;
	int numero;
	private double saldo;
	private double limite = 100;
	Cliente titular;
	
	Conta(Cliente titular){
		this.titular = titular;
		Conta.totalDeContas++;
	}
	
	public static int getTotalDeContas(){
		return Conta.totalDeContas;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public Cliente getTitular(){
		return this.titular;
	}
	
	public void setTitular(Cliente titular){
		this.titular = titular;
	}
	
	boolean saca(double quantidade){
		if ((this.saldo + this.limite) >= quantidade) {
			this.saldo -= quantidade;
			return true;
		}else{
			return false;
		}
	}
	
	void deposita(double quantidade){
		if (quantidade > 0){
			this.saldo += quantidade;
		}else{
			System.out.println("Não se deposita valor negatico!");
		}
	}
	
	boolean transfere(Conta destino, double valor){
		if (this.saca(valor)){
			destino.deposita(valor);
			return true;
		}else{
			return false;
		}
	}
	
}
