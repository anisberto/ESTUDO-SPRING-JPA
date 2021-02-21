package com.br.estudo.resources;

import com.br.estudo.domain.Categoria;
import com.br.estudo.resources.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Categoria> listar(){
       return ResponseEntity.ok().body(categoriaService.listar().getBody());
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Categoria find(@PathVariable Long id){
        return categoriaService.find(id);
    }
}
