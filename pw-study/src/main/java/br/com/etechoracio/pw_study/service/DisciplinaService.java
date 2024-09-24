package br.com.etechoracio.pw_study.service;

import br.com.etechoracio.pw_study.entity.Disciplina;
import br.com.etechoracio.pw_study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    // Criar um metodo que vai pegar os resultados do BD.
    public List<Disciplina> listar(){
        return repository.findAll(); // Metodo do repository que retorna tudo da tabela (.findAll())
    }

    public Optional<Disciplina> buscarPorId(Long id){
        return repository.findById(id);
    }

    public Disciplina cadastrar(Disciplina disciplina){
        var existe = repository.findByNome(disciplina.getNome());
        if(!existe.isEmpty()){
            throw new RuntimeException("Disciplina já cadastrada.");
        }
        return repository.save(disciplina); // Salvar os dados no banco. usar save em update tambem
    }

    public void deletarId(Long id){
        repository.deleteById(id);
    }
}
