package com.ama.prototipo;

import com.ama.prototipo.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class App implements CommandLineRunner{
	@Autowired
	UsuarioService userservice;
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
      	app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		//userservice.updateUsuario();
		//userservice.CreateUsuario();
		userservice.testUsuario();
	}

}
