package com.br.estudo.resources.services;

import com.br.estudo.domain.Categoria;
import com.br.estudo.resources.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    public CategoriaRepository categoriaRepository;

    public ResponseEntity<Categoria> listar() {
        Categoria cat1 = new Categoria(1L, "Tecnologia");
        Categoria cat2 = new Categoria(2L, "Literatura");

        List<Categoria> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        return ResponseEntity.ok().build();
    }

    public Categoria find(Long id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);
    }
}
