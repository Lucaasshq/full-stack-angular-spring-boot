package org.lucas.algamoneyapi.service;


import org.lucas.algamoneyapi.model.Categoria;
import org.lucas.algamoneyapi.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CategoriaService {


    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }

    public Categoria salvar(Categoria categoria){
       return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> buscarPorId(Long id){
        return categoriaRepository.findById(id);
    }
}
