package com.informatorio.pubs.model.repository;

import com.informatorio.pubs.model.domain.Articulos;
import org.springframework.data.repository.CrudRepository;


public interface ArtRepo extends CrudRepository<Articulos,Integer>{
}
