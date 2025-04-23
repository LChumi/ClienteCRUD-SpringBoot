package com.alquimiasoft.minegocio.presentation.controller;

import com.alquimiasoft.minegocio.persistence.entities.Cliente;
import com.alquimiasoft.minegocio.service.interfaces.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ClienteController {

    private final IClienteService service;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listar() {
        List<Cliente> list = service.findByAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> crear(@RequestBody Cliente cliente) {
        Cliente creado = service.save(cliente);
        return ResponseEntity.ok(creado);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cliente> actualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente encontrado = service.findById(id);
        if (encontrado == null) {
            return ResponseEntity.notFound().build();
        }
        encontrado.setNombres(cliente.getNombres());
        encontrado.setCorreo(cliente.getCorreo());
        Cliente actualizado = service.save(encontrado);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        Cliente encontrado = service.findById(id);
        if (encontrado == null) {
            return ResponseEntity.notFound().build();
        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id){
        Cliente cliente = service.findById(id);
        return ResponseEntity.ok(cliente);
    }
}
