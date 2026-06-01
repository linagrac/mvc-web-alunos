package com.exemplo.mvc.controller;

import com.exemplo.mvc.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlunoController {

    private final List<Aluno> alunos = new ArrayList<>();

    @GetMapping("/alunos")
    public String formulario(Model model) {
        model.addAttribute("alunos", alunos);
        return "alunos-form";
    }

    @PostMapping("/alunos")
    public String cadastrar(
            @RequestParam String nome,
            @RequestParam String matricula,
            Model model
    ) {
        try {
            alunos.add(new Aluno(nome, matricula));
            model.addAttribute("alunos", alunos);
            return "alunos-lista";
        } catch (IllegalArgumentException erro) {
            model.addAttribute("erro", erro.getMessage());
            model.addAttribute("alunos", alunos);
            return "alunos-form";
        }
    }
}
