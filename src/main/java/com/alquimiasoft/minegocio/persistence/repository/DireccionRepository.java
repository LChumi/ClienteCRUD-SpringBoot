package com.alquimiasoft.minegocio.persistence.repository;

import com.alquimiasoft.minegocio.persistence.entities.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {
}
