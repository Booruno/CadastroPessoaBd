package br.edu.usj.ads.lpii.cadastropessoahistorico;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CadastroRepository extends CrudRepository<Cadastros, Long>{

List<Cadastros>findAll();
     
}