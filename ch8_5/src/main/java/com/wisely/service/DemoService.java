package com.wisely.service;

import com.wisely.domain.Person;

/**
 * Created by wangqi on 16/7/21.
 */
public interface DemoService {
    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);
}
