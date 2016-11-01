package com.informatorio.pubs.model.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "Recaudaciones")
public class Recaudaciones implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idR")
    private int idR;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "monto")
    private int monto;

    @ManyToOne
    @JoinColumn(name="pub")
    private Pubs pubs;

}