package com.farm.smart.repository;


import com.farm.smart.entities.Inventary;
import com.mongodb.DBCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InventaryRepository extends MongoRepository<Inventary, String> {
}
