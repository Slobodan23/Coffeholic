package com.coffeholic.coffeholicbackend.repository;

import com.coffeholic.coffeholicbackend.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {

}
