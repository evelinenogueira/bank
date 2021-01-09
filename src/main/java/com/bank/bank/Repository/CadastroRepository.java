package com.bank.bank.Repository;

import com.bank.bank.Domain.Cadastro;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CadastroRepository extends ReactiveCrudRepository<Cadastro,Integer> {


}
