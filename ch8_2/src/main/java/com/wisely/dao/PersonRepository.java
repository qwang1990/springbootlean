package com.wisely.dao;

import com.wisely.domain.Person;
import com.wisely.support.CustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by wangqi on 16/7/15.
 */
/*public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findByAddress(String name);

    Person findBynameAndAddress(String name, String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name") String name,
                                   @Param("address") String address);

    List<Person> withNameAndAddressNamedQuery(String name,String address);
}*/
public interface PersonRepository extends CustomRepository<Person,Long> {
    List<Person> findByAddress(String name);

    Person findBynameAndAddress(String name, String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name") String name,
                                   @Param("address") String address);

    List<Person> withNameAndAddressNamedQuery(String name,String address);
}



















