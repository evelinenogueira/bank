package com.bank.bank.Controller;

import com.bank.bank.Domain.Cadastro;
import com.bank.bank.Repository.CadastroRepository;
import com.bank.bank.Service.CadastroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cadastro")
@Slf4j
public class CadastroController {

    private final CadastroService cadastroService;

    @PostMapping("/novo")
    public ResponseEntity<Mono<Cadastro>> save(@Valid @RequestBody Cadastro cadastro) {

        try {
            return new ResponseEntity<>(cadastroService.save(cadastro), HttpStatus.CREATED);
    }catch (Exception e){

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/tudo")
    public ResponseEntity<Flux<Cadastro>> findAll(){

        try{
            return new ResponseEntity<>(cadastroService.findAll(),HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="{id}")
    public Mono<Cadastro> findById(@PathVariable Integer id) {
        return cadastroService.findById(id);
    }


}
