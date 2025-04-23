package com.alquimiasoft.minegocio.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Data
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    @ColumnDefault(value = "0")
    private Double isMatriz;

    @ManyToOne
    @JoinColumn(name = "dir_cliente", referencedColumnName = "id")
    private Cliente cliente;
}
