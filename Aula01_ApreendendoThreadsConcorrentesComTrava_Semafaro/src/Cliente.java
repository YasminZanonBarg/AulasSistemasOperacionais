public class Cliente extends Thread{
	private String nome;
	private Conta conta;

	public Cliente(String nome,Conta conta){
		super(nome);
		this.nome=nome;
		this.conta=conta;
	}

	public void run(){
		try{
			for(int i=0;i<10;i++){
				conta.retira(100,nome);
				Thread.sleep(1000);
			}
		}catch(Exception e){}	
	}
}
