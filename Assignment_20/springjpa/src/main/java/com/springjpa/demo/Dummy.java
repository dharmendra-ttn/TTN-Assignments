package com.springjpa.demo;

import com.springjpa.config.PersistenceContext;
import com.springjpa.entity.Person;
import com.springjpa.repositories.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Dummy {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);
        
//        Question3
        Person person = new Person();
        person.setFirstName("Dharmendra");
        person.setLastName("Saini");
        person.setAge(26);
        person.setSalary(15000);
        
        Person person1 = new Person();
        person1.setFirstName("Ankit");
        person1.setLastName("Thakur");
        person1.setSalary(15000);
        person1.setAge(27);
        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);
        personRepository.save(person);
        personRepository.save(person1);
        
        Person person3 = new Person();
        person3.setFirstName("Peter");
        person3.setLastName("Chaudhary");
        person3.setSalary(100);
        person3.setAge(34);
        personRepository.save(person3);
        
        Person person2 = personRepository.findOne(1);
        System.out.println(person2);
    
        System.out.println("Person with id=2 exists? " + personRepository.exists(2));
    
        System.out.println("Total entities :"+ personRepository.count());
    
        List<Person> personList = (List<Person>) personRepository.findAll();
        System.out.println(personList);
        
//        personRepository.delete(1);
//        personRepository.deleteAll();


//Question4 and 5
        List<Person> personList1 = personRepository.findByFirstName("Dharmendra");
        System.out.println(personList1);
        List<Person> personList2 = personRepository.findByLastName("Thakur");
        System.out.println(personList2);
        Person person4 = personRepository.findById(2);
        System.out.println(person4);
        
//        Question6
        List<String> listwithage_25 = personRepository.findByNameWithAge_25();
        System.out.println(listwithage_25);

//        Question7
        personRepository.findFirstandLastName_25().forEach(e->System.out.println(Arrays.toString(e)));
        
//        Question8
        personRepository.findPerson_25().forEach(System.out::println);
    
//        Question9
        System.out.println(personRepository.countByNamePeter());
        
        //Question10
        System.out.println(personRepository.countById(1));
        personRepository.findDistinctByFirstName("Dharmendra").forEach(System.out::println);
        personRepository.findByFirstNameOrAge("Ankit",25).forEach(System.out::println);
        personRepository.findByFirstNameAndAge("Ankit",25).forEach(System.out::println);
        personRepository.findByAgeBetween(20,25).forEach(System.out::println);
        personRepository.findByAgeLessThan(25).forEach(System.out::println);
        personRepository.findByAgeGreaterThan(21).forEach(System.out::println);
        personRepository.findByFirstNameLike("Dharmendra").forEach(System.out::println);
        personRepository.findByFirstNameNot("Dharmendra").forEach(System.out::println);
    
        List<String> list = Arrays.asList("Dharmendra","Peter","ABC");
        personRepository.findByFirstNameIn(list).forEach(System.out::println);
        personRepository.findByFirstNameIgnoreCase("dharmendra").forEach(System.out::println);
    
        //Question11
        personRepository.findByAgeGreaterThanOrderByIdDesc(25).forEach(System.out::println);
        
//        Question12
        personRepository.findByAgeGreaterThan(25, new Sort(Sort.Direction.DESC,"id")).forEach(System.out::println);
        
//        Question13
        Page<Person> personPage = personRepository.findAll(new PageRequest(0,2,new Sort(Sort.Direction.DESC,"id")));
        List<Person> personList3 = personPage.getContent();
        personList3.forEach(System.out::println);
    
    }
}
