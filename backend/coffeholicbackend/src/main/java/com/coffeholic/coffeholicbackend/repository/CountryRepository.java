package com.coffeholic.coffeholicbackend.repository;

import com.coffeholic.coffeholicbackend.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryRepository extends MongoRepository<Country, String> {
}
