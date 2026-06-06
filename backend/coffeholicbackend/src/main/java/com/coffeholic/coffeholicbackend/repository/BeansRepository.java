package com.coffeholic.coffeholicbackend.repository;

import com.coffeholic.coffeholicbackend.model.Beans;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeansRepository extends MongoRepository<Beans, String> {

}
