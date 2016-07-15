package com.wisely.web;

import com.wisely.dao.PersonRepository;
import com.wisely.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangqi on 16/7/15.
 */
@RestController
public class DataController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(String name,String address,Integer age) {
        Person p = personRepository.save(new Person(null,name,age,address));

        return p;
    }

    @RequestMapping("/q1")
    public List<Person> q1(String address) {
        List<Person> people = personRepository.findByAddress(address);
        return people;
    }

    @RequestMapping("/q2")
    public Person q2(String name,String address) {
        Person people = personRepository.findBynameAndAddress(name,address);
        return people;
    }

    @RequestMapping("/q3")
    public Person q3(String name,String address) {
        Person people = personRepository.withNameAndAddressQuery(name,address);
        return people;
    }

    @RequestMapping("/q4")
    public List<Person> q4(String name,String address) {
        List<Person> people = personRepository.withNameAndAddressNamedQuery(name,address);
        return people;
    }

    @RequestMapping("/sort")
    public List<Person> sort() {
        List<Person> people = personRepository.findAll(new Sort(Sort.Direction.ASC,"age"));
        return people;
    }

    @RequestMapping("/page")
    public Page<Person> page() {
        Page<Person> people = personRepository.findAll(new PageRequest(1,2));
        return people;
    }


}
