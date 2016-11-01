package com.informatorio.pubs.model.repository;

import com.informatorio.pubs.model.domain.Personal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Fer on 21/10/2016.
 */
public interface PersRepo extends CrudRepository<Personal,Integer> {
}
