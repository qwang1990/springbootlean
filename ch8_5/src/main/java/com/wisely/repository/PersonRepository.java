package com.wisely.repository;

import com.wisely.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangqi on 16/7/21.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
