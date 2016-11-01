package com.informatorio.pubs.model.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Personal")
public class Personal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPer")
    private int idPer;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dni")
    private int dni;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "Direccion")
    private String Direccion;

}