package com.wisely.service;

import com.wisely.domain.Person;

/**
 * Created by wangqi on 16/7/21.
 */
public interface DemoService {
     Person savePersonWithRollBack(Person person);
     Person savePersonWithoutRollBack(Person person);
}
