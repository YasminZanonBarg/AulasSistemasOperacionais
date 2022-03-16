
public class TesteTarefa {

	public static void main(String[] args) {
		
		Tarefa p1 = new Tarefa(); // 1° Objeto 
		p1.setIdent(1);
		
		Thread t1 = new Thread(p1); // Cria uma Thread do primeiro objeto
		t1.start(); // Inicia
		
		
		Tarefa p2 = new Tarefa(); // 2° Objeto
		p2.setIdent(2);
		
		Thread t2 = new Thread(p2); // Cria uma Thread do segundo Objeto
		t2.start(); //inicia
	}

}
