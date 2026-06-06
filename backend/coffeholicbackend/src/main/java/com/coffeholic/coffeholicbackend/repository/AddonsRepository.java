package com.coffeholic.coffeholicbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.coffeholic.coffeholicbackend.model.Addons;

public interface AddonsRepository extends MongoRepository<Addons, String> {

}
