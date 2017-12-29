package com.genpact.mongodb.dao;

import org.springframework.data.repository.CrudRepository;

import com.genpact.mongodb.pojo.School;

public interface SchoolRepository extends CrudRepository<School, String> {
}
