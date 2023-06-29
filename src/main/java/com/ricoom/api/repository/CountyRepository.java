package com.ricoom.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ricoom.api.models.County;

public interface CountyRepository extends MongoRepository<County, String> {
County findByname(String name);
}
