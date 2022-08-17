package banco;

public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(12223, 3344);
		conta.setNumero(1223);
		
		System.out.println(conta.getNumero());
		
		Cliente ariely = new Cliente();
		ariely.setNome("ariely santos");
		conta.setTitular (ariely);
		
		System.out.println(conta.getTitular().getNome());
		
		
	}

}
