
public class MeuPrograma {	
	public static void main(String[] args){
		
		String ref1 = "<ul><li>Order : 123456789012 </li></ul>";
		String ref2 = "<ul><li>Order : 12121xxx2121 </li></ul>";
		String cut = "Order : ";  
		
		//Cliente c1 = new Cliente();
		//c1.setNome("Felipe");
				
		//System.out.println(Conta.getTotalDeContas());

		ref1 = ref1.substring(ref1.indexOf(cut)+cut.length()); 
        ref1 = ref1.substring(0,ref1.indexOf('<')).trim();
        
        ref2 = ref2.substring(ref2.indexOf(cut)+cut.length()); 
        ref2 = ref2.substring(0,ref2.indexOf('<')).trim();
		
		System.out.println(Long.valueOf(ref1));
		System.out.println(Long.valueOf(ref2));
		
		
	}
}
