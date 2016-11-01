package com.informatorio.pubs.model.repository;

import com.informatorio.pubs.model.domain.Articulos;
import com.informatorio.pubs.model.domain.Trabajos;
import org.springframework.data.repository.CrudRepository;


public interface TrabRepo extends CrudRepository<Trabajos,Integer>{
}
