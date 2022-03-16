
public class Tarefa extends Thread { // ou implements Runnable

	private int id;

	// Construtor:
	public Tarefa() {
	}

	// Setter e Getter:
	public void setIdent(int id) {
		this.id = id;
	}

	public int getIdent() {
		return this.id;
	}

	// Executando a Thread:
	public void run() { // método principal
		for (int i = 0; i < 100; i++) {
			System.out.println("Tarefa " + id + " valor: " + i);
		}
	}

}
