package br.com.etechoracio.pw_study.service;

import br.com.etechoracio.pw_study.entity.Monitor;
import br.com.etechoracio.pw_study.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {
    @Autowired
    private MonitorRepository repository;

    public List<Monitor> listar(){
        return repository.findAll();
    }

    public Monitor cadastrar(Monitor monitor){
        return repository.save(monitor);
    }
}
