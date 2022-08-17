package banco;

public class Conta {
	
 private double saldo;
 private int agencia;
 private int numero;
 private Cliente titular;
 private static int total;
 
 /*Construtor*/
	
 public Conta(int agencia, int numero){
	 /*fazendo a conta de total de contas abertas*/
	 Conta.total++;
	 System.out.println("total de contas é " + total);
	
	 this.agencia = agencia;
	 this.numero = numero;
	 System.out.println("estou criando uma cota"+ this.numero);
	 
 }
 
 {/*metodo*/}
 public void deposita(double valor) {
	 this.saldo += valor;
{/*+= valor, é a mesma coisa de = this.saldo + valor*/}
	 
 }
 
 public boolean saca (double valor) {
	 if (this.saldo >= valor) {
		 this.saldo -=valor;
{/*mesma coisa do descima, que dize menos igual valor ou mais..*/}
		 return true;
	 }else {
		 return false;
	 }
 }
 
 public boolean transfere (double valor, Conta destino){
	 if(this.saldo >= valor) {
		 this.saldo -= valor;
		 destino.deposita(valor);
		 return true;
		  }return false;
	 
 }
 
 public double getSaldo() {
	 return this.saldo;
 }

public int getAgencia() {
	return agencia;
}

public void setAgencia(int agencia) {
	this.agencia = agencia;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public Cliente getTitular() {
	return titular;
}

public void setTitular(Cliente titular) {
	this.titular = titular;
}

public static int getTotal() {
	return Conta.total;
}

}
