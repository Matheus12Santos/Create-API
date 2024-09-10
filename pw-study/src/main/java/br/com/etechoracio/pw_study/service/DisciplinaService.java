package br.com.etechoracio.pw_study.service;

import br.com.etechoracio.pw_study.entity.Disciplina;
import br.com.etechoracio.pw_study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    // Criar um metodo que vai pegar os resultados do BD.
    public List<Disciplina> listar(){
        return repository.findAll(); // Metodo do repository que retorna tudo da tabela (.findAll())
    }

    public Disciplina cadastrar(Disciplina disciplina){
        return repository.save(disciplina); // Salvar os dados no banco. usar save em update tambem
    }
}
