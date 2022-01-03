package portifolio.util;

import portifolio.model.Registro;

public class RegistroPrint {
	public String imprimir(Registro registro) {
		
		StringBuilder cupom = new StringBuilder();
		cupom.append("----------------------------- FICHA PROFISSIONAL -----------------------------\n");
		cupom.append(String.format("\n%-12s%s\n","PROFISSÃO: ",registro.getProfissao()));
		cupom.append(String.format("\n%-11s%s\n","NOME: ",registro.getNomeCompleto()));
		cupom.append(String.format("\n%-5s%s","SALÁRIO REQUERIDO:  MINÍMO: ",FormatterUtil.moeda(registro.getMinimoSalario())));
		cupom.append(String.format("%23s%s\n","MÁXIMO: ",FormatterUtil.moeda(registro.getMaximoSalario())));
		cupom.append(String.format("\n%10s%s","DATA NASC: ",FormatterUtil.data(registro.getDataNascimento())));
		cupom.append(String.format("%10s%s","CPF: ",FormatterUtil.cpf(registro.getCpf())));
		cupom.append(String.format("%10s%s\n","RG:", FormatterUtil.rg(registro.getRg())));
		cupom.append(String.format("\n%-11s%s\n","ENDEREÇO: ",registro.getLogradouro()));
		cupom.append(String.format("\n%-2s%s","N: ",registro.getNumeroCasa()));
		cupom.append(String.format("%13s%s","BAIRRO: ",registro.getBairro()));
		cupom.append(String.format("%16s%s","MUNICÍPIO: ",registro.getCidade()));
		cupom.append(String.format("%12s%s\n","UF: ",registro.getUf()));
		cupom.append(String.format("\n%-2s%s","CEP: ",FormatterUtil.cep(registro.getCep())));
		cupom.append(String.format("%20s%s","NATURALIDADE: ",registro.getNaturalidade()));
		cupom.append(String.format("%16s%s\n","País: ",registro.getPais()));
		cupom.append(String.format("\n%-4s%s","TELEFONE: ",FormatterUtil.formataTelefone(registro.getTelefone())));
		cupom.append(String.format("%26s%s\n","CELULAR: ",FormatterUtil.formataTelefone(registro.getCelular())));
		cupom.append(String.format("\n%-11s%s\n","EMAIL: ",registro.getEmail()));
		
		cupom.append("------------------------------------------------------------------------------\n");
		
		
		System.out.println(cupom);
		return cupom.toString();
	}
}
	


