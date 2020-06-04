package br.edu.usj.ads.lpii.cadastropessoahistorico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cadastros {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    Long id;
    String cadastros;
    String nome;
    Double idade;
    String sexo;


}