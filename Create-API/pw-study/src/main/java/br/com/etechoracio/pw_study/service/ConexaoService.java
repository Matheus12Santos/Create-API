package br.com.etechoracio.pw_study.service;

import br.com.etechoracio.pw_study.repository.ConexaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ConexaoService {
    @Autowired
    private ConexaoRepository repository;

    @GetMapping
    public Long contar(){
        return repository.count();
    }
}
