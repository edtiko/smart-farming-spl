package com.farm.smart.repository;


import com.farm.smart.entities.Inventary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventaryRepository extends MongoRepository<Inventary, String> {


}
