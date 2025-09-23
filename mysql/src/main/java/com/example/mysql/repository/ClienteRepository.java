package com.example.mysql.repository;

import com.example.mysql.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByProtocoloAtendimento(String protocoloAtendimento);
}
