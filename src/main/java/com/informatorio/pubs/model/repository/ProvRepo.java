package com.informatorio.pubs.model.repository;

import com.informatorio.pubs.model.domain.Articulos;
import com.informatorio.pubs.model.domain.Proveedores;
import org.springframework.data.repository.CrudRepository;


public interface ProvRepo extends CrudRepository<Proveedores,Integer>{
}
