package banco;

public class TestaBanco {
	
	public static void main(String[]args) {
		Cliente ariely = new Cliente();
		
		Conta contaDaAriely = new Conta(1227, 1234);
		contaDaAriely.deposita(100);
		
		contaDaAriely.setTitular(ariely);
		System.out.println(contaDaAriely.getTitular());
		

	}
}
 