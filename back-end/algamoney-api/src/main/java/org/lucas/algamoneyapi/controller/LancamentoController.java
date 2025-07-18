package org.lucas.algamoneyapi.controller;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.lucas.algamoneyapi.dto.LancamentoDTO;
import org.lucas.algamoneyapi.model.Lancamento;
import org.lucas.algamoneyapi.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    @Autowired
    private LancamentoService lancamentoService;

    @Autowired
    ApplicationEventPublisher publisher;


    @GetMapping
    public ResponseEntity<List<Lancamento>> listarLancamentos(){
        return ResponseEntity.ok(lancamentoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lancamento> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(lancamentoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<LancamentoDTO> criarLancamento(@Valid @RequestBody LancamentoDTO dto, HttpServletResponse response){
        LancamentoDTO lancamentoSalvo = lancamentoService.salvar(dto);
//        publisher.publishEvent(new RecursoCriadoEvent(response, lancamentoSalvo.ge));
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalvo);
    }
}
