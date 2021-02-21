package com.br.estudo;

import com.br.estudo.domain.Categoria;
import com.br.estudo.resources.repositories.CategoriaRepository;
import com.br.estudo.resources.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class EstudoSpringApplication implements CommandLineRunner {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public static void main(String[] args) {
        SpringApplication.run(EstudoSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Tecnologia");
        Categoria cat2 = new Categoria(null, "Literatura");

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
    }
}
