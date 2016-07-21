package com.wisely.impl;

import com.wisely.domain.Person;
import com.wisely.repository.PersonRepository;
import com.wisely.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wangqi on 16/7/21.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    PersonRepository personRepository;

    @Transactional(rollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);

        if (person.getName().equals("wangqi")) {
            throw new IllegalArgumentException("wangqi已经存在了,数据库将回滚");
        }
        return p;
    }

    @Transactional(noRollbackFor ={IllegalArgumentException.class})
    @Override
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);

        if (person.getName().equals("wangqi")) {
            throw new IllegalArgumentException("wangqi已经存在了,数据库将回滚");
        }
        return p;
    }
}
