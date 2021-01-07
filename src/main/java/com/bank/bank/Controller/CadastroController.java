package com.bank.bank.Controller;

import com.bank.bank.Domain.Cadastro;
import com.bank.bank.Repository.CadastroRepository;
import com.bank.bank.Service.CadastroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
//@RequestMapping("/cadastro")
@Slf4j
public class CadastroController {

    private final CadastroService cadastroService;

    @GetMapping
    public Flux<Cadastro> findAll(){
        return cadastroService.findAll();
    }

    @GetMapping(path="{id}")
    public Mono<Cadastro> findById(@PathVariable Integer id) {
        return cadastroService.findById(id);
    }


}
