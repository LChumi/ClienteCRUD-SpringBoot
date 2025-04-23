package com.alquimiasoft.minegocio.persistence.repository;

import com.alquimiasoft.minegocio.persistence.entities.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    List<Direccion> findByCliente_Id(Long clienteId);
}
