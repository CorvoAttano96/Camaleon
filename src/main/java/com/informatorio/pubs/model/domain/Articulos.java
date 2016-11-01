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
@Table(name = "Articulos")
public class Articulos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAr")
    private int idAr;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descript")
    private String descript;

}