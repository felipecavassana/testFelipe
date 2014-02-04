
public class Porta {
	boolean aberta = false;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	void abre(){
		if (estaAberta()){
			System.out.println("A porta já está aberta!");
		}else{
			this.aberta = true;
			System.out.println("Porta aberta!");
		}
	}
	
	void fecha(){
		if (estaAberta()){
			this.aberta = false;
			System.out.println("Porta fechada!");
		}else{
			System.out.println("A porta já está fechada!");
		}
	}
	
	void pinta(String s){
		this.cor = s;
	}
	
	boolean estaAberta(){
		return this.aberta;
	}
	
	void setDimensoes(double x, double y, double z){
		this.dimensaoX = x;
		this.dimensaoY = y;
		this.dimensaoZ = z;
	}
}
