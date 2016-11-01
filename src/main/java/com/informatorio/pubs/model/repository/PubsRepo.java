package com.informatorio.pubs.model.repository;

import com.informatorio.pubs.model.domain.Articulos;
import com.informatorio.pubs.model.domain.Pubs;
import org.springframework.data.repository.CrudRepository;


public interface PubsRepo extends CrudRepository<Pubs,Integer>{
}
