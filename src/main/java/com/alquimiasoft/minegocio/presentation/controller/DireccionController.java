package com.alquimiasoft.minegocio.presentation.controller;

import com.alquimiasoft.minegocio.persistence.entities.Direccion;
import com.alquimiasoft.minegocio.service.interfaces.IDireccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("direccion")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class DireccionController {

    private final IDireccionService service;

    @GetMapping("/listar")
    public ResponseEntity<List<Direccion>> listar() {
        List<Direccion> list = service.findByAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/listar/cliente/{clienteId}")
    public ResponseEntity<List<Direccion>> listarPorClienteId(@PathVariable Long clienteId) {
        List<Direccion> list = service.findByClienteId(clienteId);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/crear")
    public ResponseEntity<Direccion> crear(@RequestBody Direccion direccion) {
        Direccion creado = service.save(direccion);
        return ResponseEntity.ok(creado);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        Direccion encontrado = service.findById(id);
        if (encontrado == null) {
            return ResponseEntity.notFound().build();
        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Direccion> updateDireccion(@PathVariable Long id, @RequestBody Direccion direccion){
        Direccion encontrado = service.findById(id);
        if (encontrado == null){
            return ResponseEntity.notFound().build();
        }
        encontrado.setNombre(direccion.getNombre());
        encontrado.setIsMatriz(direccion.getIsMatriz());
        Direccion actualizado = service.save(encontrado);
        return ResponseEntity.ok(actualizado);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Direccion> findById(@PathVariable Long id){
        Direccion direccion = service.findById(id);
        return ResponseEntity.ok(direccion);
    }
}
