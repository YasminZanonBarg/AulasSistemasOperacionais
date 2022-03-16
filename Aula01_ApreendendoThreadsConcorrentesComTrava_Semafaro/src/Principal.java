public class Principal{
	public static void main(String[] args){
		Conta conta = new Conta(1000);
		Cliente pai = new Cliente("Pai",conta);
		Cliente mae = new Cliente("Mae",conta);
		Cliente filha = new Cliente("Filha",conta);


		pai.start();
		mae.start();
		filha.start();	
	}
}
