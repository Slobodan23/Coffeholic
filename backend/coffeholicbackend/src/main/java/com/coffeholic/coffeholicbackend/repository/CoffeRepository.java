package com.coffeholic.coffeholicbackend.repository;

import com.coffeholic.coffeholicbackend.model.Coffe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoffeRepository extends MongoRepository<Coffe, String> {

}
