package portifolio.util;

import portifolio.model.Registro;

public class RegistroPrint {
	public String imprimir(Registro registro) {
		
		StringBuilder cupom = new StringBuilder();
		cupom.append("------------------------------\n");
		cupom.append("SIS CAMBIO - COMPROVANTE DE TRANSACAO\n");
		cupom.append("TRANSACAO DE CAMBIO\n");
		cupom.append("------------------------------\n");
		cupom.append(String.format("%-10s%s\n","NOME:",registro.getNomeCompleto()));
		cupom.append(String.format("%-10s%s\n","CPF:",FormatterUtil.cpf(registro.getCpf())));
		cupom.append(String.format("%-10s%s\n","DATA NASCIMENTO:",FormatterUtil.data(registro.getDataNascimento())));
		cupom.append("------------------------------\n");
		cupom.append(String.format("%-10s%s\n","VENDIDO:",FormatterUtil.moeda(registro.getMinimoSalario())));
		cupom.append(String.format("%-10s%s\n","COMPRADO:",FormatterUtil.moeda(registro.getMaximoSalario())));
		
		System.out.println(cupom);
		return cupom.toString();
	}
}
	


