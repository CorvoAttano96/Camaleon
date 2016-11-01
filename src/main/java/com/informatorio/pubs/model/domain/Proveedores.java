package com.informatorio.pubs.model.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Proveedores")
public class Proveedores implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idP")
    private int idP;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cuit")
    private String cuit;

    @Column(name = "Direccion")
    private String Direccion;

    @ManyToMany
    @JoinTable(name="pubsXprov", joinColumns={@JoinColumn(name="idP")}, inverseJoinColumns={@JoinColumn(name="id")})
    @JsonManagedReference
    private List<Pubs> pubs = new ArrayList<>();

    public void addPub(Pubs pub ){
        this.pubs.add(pub);
    }

    public List<Pubs> getPubs(){
        return this.pubs;
    }

}