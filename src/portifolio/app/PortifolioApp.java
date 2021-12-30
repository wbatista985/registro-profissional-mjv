package portifolio.app;

import java.util.List;

import portifolio.model.Registro;
import portifolio.util.LeitorRemessa;

public class PortifolioApp {
	public static void main(String[] args) {
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<Registro> registros = leitor.converter("//home//wagner//Transferências//DELREMESSA.csv");
		
		for(Registro r: registros) {
			System.out.println(r);
		}
	}
	

}
