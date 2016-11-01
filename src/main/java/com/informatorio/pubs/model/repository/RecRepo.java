package com.informatorio.pubs.model.repository;

import com.informatorio.pubs.model.domain.Articulos;
import com.informatorio.pubs.model.domain.Recaudaciones;
import org.springframework.data.repository.CrudRepository;


public interface RecRepo extends CrudRepository<Recaudaciones,Integer>{

}
