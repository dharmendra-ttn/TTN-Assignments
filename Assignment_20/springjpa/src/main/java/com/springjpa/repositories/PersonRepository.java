package com.springjpa.repositories;



import com.springjpa.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.sql.ResultSet;
import java.util.EmptyStackException;
import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer> {

    List<Person> findByFirstName(String fname);
    List<Person> findByLastName(String lname);
    Person findById(Integer id);
    
    @Query("select p.firstName from Person p where p.age=25")
    List<String> findByNameWithAge_25();
    
    @Query("select p.firstName,p.lastName from Person p where p.age=25")
    List<Object[]> findFirstandLastName_25();
    
    @Query("select p from Person p where p.age=25")
    List<Person> findPerson_25();
    
    @Query("select count(*) from Person p where p.firstName='Peter'")
    Integer countByNamePeter();
    
    Integer countById(Integer id);
    List<Person>  findDistinctByFirstName(String firstName);
    List<Person> findByFirstNameOrAge(String firstName, Integer age);
    List<Person> findByFirstNameAndAge(String firstName, Integer age);
    List<Person> findByAgeBetween(Integer min, Integer max);
    List<Person> findByAgeLessThan(Integer age);
    List<Person> findByAgeGreaterThan(Integer age);
    List<Person> findByFirstNameLike(String name);
    List<Person> findByFirstNameNot(String name);
    List<Person> findByFirstNameIn(List<String> list);
    List<Person> findByFirstNameIgnoreCase(String firstName);
    
    
    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);
    
    List<Person> findByAgeGreaterThan(Integer age, Sort sort);
    
    Page<Person> findAll(Pageable pageable);
}
