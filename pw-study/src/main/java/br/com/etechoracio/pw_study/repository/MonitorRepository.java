package br.com.etechoracio.pw_study.repository;

import br.com.etechoracio.pw_study.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
    List<Monitor> findByWhatsappAndEmail(String whatsapp, String email);
}
