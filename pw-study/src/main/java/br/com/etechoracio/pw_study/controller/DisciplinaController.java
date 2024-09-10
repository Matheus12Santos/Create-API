package br.com.etechoracio.pw_study.controller;

import br.com.etechoracio.pw_study.entity.Disciplina;
import br.com.etechoracio.pw_study.service.DisciplinaService;
import org.hibernate.sql.results.graph.entity.internal.DiscriminatedEntityInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaService service;

    // Criar um metodo que retornara uma lista de disciplina
    @GetMapping
    public List<Disciplina> listar(){
        return service.listar();
    }
    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina){
        return service.cadastrar(disciplina);
    }
}
