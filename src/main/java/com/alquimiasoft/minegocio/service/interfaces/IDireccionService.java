package com.alquimiasoft.minegocio.service.interfaces;

import com.alquimiasoft.minegocio.persistence.entities.Direccion;

import java.util.List;

public interface IDireccionService extends GenericService<Direccion, Long> {

    List<Direccion> findByClienteId(Long clienteId);
}
