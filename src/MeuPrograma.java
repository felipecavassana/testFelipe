
public class MeuPrograma {	
	public static void main(String[] args){
		
		String user_profile = "00eF00000014579";
		
		//Cliente c1 = new Cliente();
		//c1.setNome("Felipe");
				
		//System.out.println(Conta.getTotalDeContas());

		
		if(user_profile != "00eF00000014579" || user_profile != "00eF0000000SZDj" || user_profile != "00eF0000000Req5" || user_profile != "00eF0000000ReWz"){
			System.out.println("1 - Entrou!");
		}else{
			System.out.println("1 - Não entrou!");
		}
		
		if(user_profile != "00eF00000014579" && user_profile != "00eF0000000SZDj" && user_profile != "00eF0000000Req5" && user_profile != "00eF0000000ReWz"){
			System.out.println("2 - Entrou!");
		}else{
			System.out.println("2 - Não entrou!");
		}
		
	}
}
