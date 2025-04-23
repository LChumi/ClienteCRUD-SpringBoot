package com.alquimiasoft.minegocio.service.implementation;

import com.alquimiasoft.minegocio.persistence.entities.Cliente;
import com.alquimiasoft.minegocio.persistence.repository.ClienteRepository;
import com.alquimiasoft.minegocio.service.interfaces.IClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired})
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements IClienteService {

    private final ClienteRepository repository;

    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return repository;
    }
}
