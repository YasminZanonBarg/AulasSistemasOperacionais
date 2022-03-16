import java.util.concurrent.Semaphore;

public class Conta {

    private double saldo;
    private final Semaphore semaforo = new Semaphore(1);

    public Conta(double saldo){
	this.saldo = saldo;
    }

    public void retira(double valor,String nome) {
    	try{
    		semaforo.acquire(); 
		    if(saldo > valor){
			    double saldoAtualizado = this.saldo -valor;
			    this.saldo = saldoAtualizado;
			    System.out.println(nome +" retirou "+valor+" reais. Saldo atual: "+saldo);
		    }
		    else{
			System.out.println(nome+":Saldo insuficiente!");
		    }
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    	    semaforo.release();
    	}
        
        
    }

    public void deposita(double valor,String nome) {
        try{
    		semaforo.acquire(); 
			double saldoAtualizado = this.saldo + valor;
			this.saldo = saldoAtualizado;
			System.out.println(nome +" depositou "+valor+" reais. Saldo atual: "+saldo);
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    	    semaforo.release();
    	}
    }
}
