public class Conta {

    private double saldo;

    public Conta(double saldo){
	this.saldo = saldo;
    }

    public void retira(double valor,String nome) {
	    if(saldo > valor){
		    double saldoAtualizado = this.saldo -valor;
		    this.saldo = saldoAtualizado;
		    System.out.println(nome +" retirou "+valor+" reais. Saldo atual: "+saldo);
	    }
	    else{
		System.out.println(nome+":Saldo insuficiente!");
	    }
    }

    public void deposita(double valor,String nome) {
            double novoSaldo = this.saldo + valor;
            this.saldo = novoSaldo;
	    System.out.println(nome +" depositou "+valor+" reais. Saldo atual: "+saldo);
    }
}
