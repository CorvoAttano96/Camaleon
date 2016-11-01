package com.informatorio.pubs.model.repository;

import com.informatorio.pubs.model.domain.Articulos;
import com.informatorio.pubs.model.domain.Pedidos;
import org.springframework.data.repository.CrudRepository;


public interface PedRepo extends CrudRepository<Pedidos,Integer>{
}
