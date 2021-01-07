package com.bank.bank.Controller;

import com.bank.bank.Domain.Cadastro;
import com.bank.bank.Repository.CadastroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cadastro")
@Slf4j
public class CadastroController {

    private final CadastroRepository cadastroRepository;

    @GetMapping("/tudo")
    public Flux<Cadastro> findAll(){
        return cadastroRepository.findAll();
    }


}
