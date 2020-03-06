package edu.escueling.arep.formulario_AREP_PatronesArquitecturales;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FormularioArepPatronesArquitecturalesApplication.class);
	}

}
