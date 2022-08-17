package banco;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta contaDaClarice = new Conta(1111, 2222);
		contaDaClarice.deposita(100);
		System.out.println(contaDaClarice.saca(200));
		
		contaDaClarice.saca(150);
		System.out.println(contaDaClarice.getSaldo());

	}

}
