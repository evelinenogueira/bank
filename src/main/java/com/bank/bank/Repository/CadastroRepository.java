package com.bank.bank.Repository;

import com.bank.bank.Domain.Cadastro;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CadastroRepository extends ReactiveCrudRepository<Cadastro,Integer> {



    Flux<Cadastro> findAll();
    Mono<Cadastro> findById(Integer id);
}
