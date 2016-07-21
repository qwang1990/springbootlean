package com.wisely.dao;

import com.wisely.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangqi on 16/7/17.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByNameStartsWith(String name);
}
