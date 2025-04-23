package com.alquimiasoft.minegocio.service.implementation;

import com.alquimiasoft.minegocio.persistence.entities.Direccion;
import com.alquimiasoft.minegocio.persistence.repository.DireccionRepository;
import com.alquimiasoft.minegocio.service.interfaces.IDireccionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class DireccionServiceImpl extends GenericServiceImpl<Direccion, Long> implements IDireccionService {

    private final DireccionRepository repository;


    @Override
    public CrudRepository<Direccion, Long> getDao() {
        return repository;
    }

    @Override
    public List<Direccion> findByClienteId(Long clienteId) {
        return repository.findByCliente_Id(clienteId);
    }
}
