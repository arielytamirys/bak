package banco;

public class TestaValor {
	
	public static void main(String[] args) {
		Conta conta = new Conta(2222, 23456);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1234);
		
		Conta conta2 = new Conta(1234,1010);
		
		System.out.println(Conta.getTotal());
	}

}
