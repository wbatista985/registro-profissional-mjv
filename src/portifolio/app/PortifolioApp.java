package portifolio.app;

import java.util.List;


import portifolio.model.Registro;
import portifolio.util.LeitorRemessa;
import portifolio.util.RegistroPrint;

public class PortifolioApp {
	public static void main(String[] args) {
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<Registro> registros = leitor.converter("//home//wagner//TransferĂȘncias//DELREMESSA.csv");
		
		RegistroPrint printer = new RegistroPrint();
		printer.imprimir(registros.get(0));
		}
        

	}
	
