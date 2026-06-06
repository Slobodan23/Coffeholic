package com.coffeholic.coffeholicbackend.repository;

import com.coffeholic.coffeholicbackend.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepository extends MongoRepository<City, String> {

}
