package com.fabionascimento.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fabionascimento.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
