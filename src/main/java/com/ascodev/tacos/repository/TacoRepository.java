package com.ascodev.tacos.repository;

import com.ascodev.tacos.entity.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}