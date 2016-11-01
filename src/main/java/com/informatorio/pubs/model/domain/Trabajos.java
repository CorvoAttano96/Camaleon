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
@Table(name = "Trabajos")
public class Trabajos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idT;

    @ManyToOne
    @JoinColumn(name="personal")
    private Personal personal;

    @ManyToOne
    @JoinColumn(name="pub")
    private Pubs pubs;

    @Column(name="puesto")
    private String puesto;

}
