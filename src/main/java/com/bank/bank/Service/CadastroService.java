package com.bank.bank.Service;

import com.bank.bank.Domain.Cadastro;
import com.bank.bank.Repository.CadastroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CadastroService {

    private final CadastroRepository cadastroRepository;

    public Flux<Cadastro> findAll() {
        return cadastroRepository.findAll();
    }

    public Mono<Cadastro> findById(Integer id) {
        return cadastroRepository.findById(id);
    }

    public Mono<Cadastro> save(Cadastro cadastro) {return cadastroRepository.save(cadastro); }
}
