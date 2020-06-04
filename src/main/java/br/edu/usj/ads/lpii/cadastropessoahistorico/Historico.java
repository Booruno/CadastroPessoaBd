package br.edu.usj.ads.lpii.cadastropessoahistorico;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    List<Cadastros> listaCadastros = new ArrayList<>();

    void adicionar(Cadastros cadastros) {
        listaCadastros.add(cadastros);
    }

    List<Cadastros> getHistorico(){
        return listaCadastros;
    }

}