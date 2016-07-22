package com.wisely.controller;

import com.wisely.dao.Person;
import com.wisely.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangqi on 16/7/22.
 */
@RestController
public class DataController {
    @Autowired
    PersonDao personDao;

    @RequestMapping("/set")
    public void set() {
        Person person = new Person("1","wangqi",32);
        personDao.save(person);
        personDao.stringRedisTemplateDemo();
    }

    @RequestMapping("/getStr")
    public String getStr() {
        return personDao.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson() {
        return personDao.getPerson();
    }

}
