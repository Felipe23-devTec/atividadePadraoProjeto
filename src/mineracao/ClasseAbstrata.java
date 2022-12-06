package mineracao;

public abstract class ClasseAbstrata {


	public final void mineracao() {
		abrir();
		extrair();
		converter();
		fechar();
		analisarDados();
		enviarRelatorios();
	}

	public abstract void abrir();

	public abstract void extrair();

	public abstract void converter();

	public abstract void fechar();

	public void analisarDados() {
		System.out.println("Analisando dados...");
	}

	public void enviarRelatorios() {
		System.out.println("Enviando relatórios...");
	}


}
