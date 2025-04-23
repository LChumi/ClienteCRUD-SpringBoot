package com.alquimiasoft.minegocio.persistence.repository;

import com.alquimiasoft.minegocio.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
