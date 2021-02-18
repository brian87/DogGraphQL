package com.brain.dogGraphQL.repository;

import org.springframework.data.repository.CrudRepository;

import com.brain.dogGraphQL.entity.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {
	
}
