package mineracao;

public class MinerarPDF extends ClasseAbstrata {

	public void abrir() {
		System.out.println("Abrindo PDF...");
	}

	public void extrair() {
		System.out.println("Extraindo dados do PDF...");	
	}

	public void converter() {
		System.out.println("Convertendo dados do PDF...");
	}

	public void fechar() {
		System.out.println("Fechando PDF...");
	}

}
