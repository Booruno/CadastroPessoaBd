package br.edu.usj.ads.lpii.cadastropessoahistorico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroPessoaController {

    @Autowired
    CadastroRepository cadastroRepository;
    
    @PostMapping(value="/cadastrar")

    public ModelAndView postCadastrar(@RequestParam String nome, @RequestParam String idade, @RequestParam String sexo){
        String nomeString = nome;
        Double idadeDouble = Double.parseDouble(idade);
        String sexoString = sexo;

        String informacoes = "Nome: " + nome +" " + "Idade: " + idade.toString() +" " + "Sexo: " +sexo;


        Cadastros cadastros = new Cadastros();
        cadastros.setCadastros(informacoes);
        cadastros.setNome(nomeString);
        cadastros.setSexo(sexoString);
        cadastros.setIdade(idadeDouble);
        cadastroRepository.save(cadastros);



        

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("texto", informacoes );
        modelAndView.addObject("historico",cadastroRepository.findAll());
        return modelAndView;

}
}