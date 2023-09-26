package br.com.ienh.appsextou.appsextou.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ienh.appsextou.appsextou.entities.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
    
}
