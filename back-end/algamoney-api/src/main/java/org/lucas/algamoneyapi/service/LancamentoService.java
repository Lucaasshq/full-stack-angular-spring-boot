package org.lucas.algamoneyapi.service;

import org.lucas.algamoneyapi.dto.LancamentoDTO;
import org.lucas.algamoneyapi.dto.Mapper.LancamentoMapper;
import org.lucas.algamoneyapi.exeception.LancamentoNaoEncontradoException;
import org.lucas.algamoneyapi.model.Categoria;
import org.lucas.algamoneyapi.model.Lancamento;
import org.lucas.algamoneyapi.model.Pessoa;
import org.lucas.algamoneyapi.repository.CategoriaRepository;
import org.lucas.algamoneyapi.repository.LancamentoRepository;
import org.lucas.algamoneyapi.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoService {

    private final LancamentoRepository lancamentoRepository;

    private final PessoaRepository pessoaRepository;

    private final CategoriaRepository categoriaRepository;

    LancamentoService(LancamentoRepository lancamentoRepository, PessoaRepository pessoaRepository, CategoriaRepository categoriaRepository) {
        this.lancamentoRepository = lancamentoRepository;
        this.pessoaRepository = pessoaRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public List<Lancamento> buscarTodos(){
        return lancamentoRepository.findAll();
    }

    public Lancamento buscarPorId(Long id){
        return lancamentoRepository.findById(id).orElseThrow(() -> new LancamentoNaoEncontradoException("Lançamento de " +id+ " não encontrado"));
    }

    public LancamentoDTO salvar(LancamentoDTO lancamentoDTO){
        Pessoa pessoaEncontrada = pessoaRepository.getReferenceById(lancamentoDTO.getPessoa().getId());
        Categoria categoriaEncontrada = categoriaRepository.getReferenceById(lancamentoDTO.getCategoria().getId());

       Lancamento entity = LancamentoMapper.toEntity(lancamentoDTO, pessoaEncontrada, categoriaEncontrada);
       Lancamento salvo = lancamentoRepository.save(entity);
       return LancamentoMapper.toDto(salvo);
    }
    

    public void excluir(Long id){
        if (!lancamentoRepository.existsById(id)){
            throw new RuntimeException("Teste: id não encontrado Lancamento repostory exluir");
        };
        lancamentoRepository.deleteById(id);
    }
}
