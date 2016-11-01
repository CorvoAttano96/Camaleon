package com.informatorio.pubs.model.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Inventarios")
public class Inventarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idInv")
    private int idInv;

    @Column(name="precio")
    private int precio;

    @Column(name="cantidad")
    private int cantidad;

    @ManyToOne
    @JoinColumn(name="pub")
    private Pubs pubs;

    @ManyToOne
    @JoinColumn(name="articulo")
    private Articulos articulo;

    @ManyToOne
    @JoinColumn(name="proveedores")
    private Proveedores proveedores;


}