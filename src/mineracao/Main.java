package mineracao;

public class Main {

	public static void main(String[] args) {

		ClasseAbstrata pdf = new MinerarPDF();
		pdf.mineracao();
		System.out.println("==========\n");

		ClasseAbstrata doc = new MinerarDOC();
		doc.mineracao();
		System.out.println("==========\n");		

		ClasseAbstrata csv = new MinerarCSV();
		csv.mineracao();
	
	}

}
