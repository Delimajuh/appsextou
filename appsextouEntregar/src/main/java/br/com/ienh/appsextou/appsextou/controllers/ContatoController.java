package br.com.ienh.appsextou.appsextou.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ienh.appsextou.appsextou.entities.Contato;
import br.com.ienh.appsextou.appsextou.repositories.ContatoRepository;

@Controller
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    ContatoRepository contatoRepository;

    @GetMapping("/mostrarTodos")
    public String mostrarTodos(Model model) {
        Iterable<Contato> contatos = contatoRepository.findAll();
        model.addAttribute("contatos", contatos);
        return "contato/mostrarTodos";
        
    }
    
}
