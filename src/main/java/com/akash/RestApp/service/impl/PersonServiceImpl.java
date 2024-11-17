package com.akash.RestApp.service.impl;

import com.akash.RestApp.dto.Person;
import com.akash.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    Person amit = new Person("Amit", "Delhi","M",24,"BTech");
    Person sumit = new Person("Sumit","pune","M",27,"BCA");
    Person neha = new Person("Neha","Benglore","F",25,"MBA");
    Person ayushi = new Person("Ayushi","Varansi","F",35,"BSC");
    Person priya = new Person("Priya","PrayagRaj","F",21,"Bcom");

    List<Person> personList = new ArrayList<>();

    @Value("${user.gender}")
    String userGender;

    @Override
    public List<Person> getAllPersonData() {

       personList.add(amit);
       personList.add(sumit);
       personList.add(neha);
       personList.add(ayushi);
       personList.add(priya);

        return personList;
    }

    @Override
    public List<Person> filterDataBasedOnGen(List<Person> personList) {
        List<Person> per = new ArrayList<>();
        for(Person obj: personList) {
            if (!userGender.equalsIgnoreCase(obj.getGender())){
                per.add(obj);
            }
        }
        return List.of();
    }
}
