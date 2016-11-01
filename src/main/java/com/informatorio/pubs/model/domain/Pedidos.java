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
@Table(name = "Pedidos")
public class Pedidos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPed")
    private int idPed;

    @Column(name="fecha")
    private String fecha;

    @Column(name="total")
    private int total;

    @ManyToOne
    @JoinColumn(name="Proveedores")
    private Proveedores proveedores;

    @OneToMany
    @JoinColumn(name="articuloPedido")
    private List<Articulos> articuloPedido;



}