package com.informatorio.pubs.model.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Pubs")
public class Pubs implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "licencia")
    private String licencia;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "diasDeAtencion")
    private String dias;

    @Column(name = "horarios")
    private String horarios;

    @ManyToMany(mappedBy="pubs")
    @JsonBackReference
    private List<Proveedores> proveedores = new ArrayList<>();

    public void addProveedor(Proveedores prov){
        this.proveedores.add(prov);
    }

    public List<Proveedores> getProveedores(){
        return this.proveedores;
    }


}