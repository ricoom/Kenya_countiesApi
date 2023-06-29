package com.ricoom.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ricoom.api.models.Constituency;

public interface ConstituencyRepository extends MongoRepository<Constituency, String>{
Constituency findByname(String name);

}
