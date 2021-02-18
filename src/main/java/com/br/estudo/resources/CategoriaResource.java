package com.br.estudo.resources;

import com.br.estudo.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1L,"Tecnologia");
        Categoria cat2 = new Categoria(2L,"Literatura");

        List<Categoria> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        return list;
    }
}
