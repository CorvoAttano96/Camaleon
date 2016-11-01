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
@Table(name = "ArticuloPedido")
public class ArticuloPedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAP")
    private int idAP;

    @Column(name="precio")
    private int precio;

    @Column(name="cantidad")
    private int cantidad;

    @ManyToOne
    @JoinColumn(name="articulo")
    private Articulos articulo;

}
