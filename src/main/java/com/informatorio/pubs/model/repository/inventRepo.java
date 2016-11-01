package com.informatorio.pubs.model.repository;

import com.informatorio.pubs.model.domain.Inventarios;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Fer on 21/10/2016.
 */
public interface inventRepo extends CrudRepository<Inventarios,Integer> {
}
