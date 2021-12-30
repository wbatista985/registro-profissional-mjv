package portifolio.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import portifolio.model.Registro;

public class LeitorRemessa {
	private List<String> ler(String caminhoArquivo) {
		try {
			List<String> registros = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
			return registros;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
    public List<Registro> converter (String caminhoArquivo) {
    	List<String> conteudos = ler(caminhoArquivo);
    	List<Registro> registros = new ArrayList();
    	
	    for(String linha:conteudos) {
	    	String [] campos = linha.split(";");
	    	Registro r = new Registro();
	    	r.setProfissao(campos[0]);
	    	r.setNomeCompleto(campos[1]);
	    	r.setMinimoSalario(Double.valueOf(campos[2]));
	    	
	    	r.setCpf(campos[5]);
	    	
	    	
	    	registros.add(r);
	    }
	    
	    return  registros;
	}
    
    

}
