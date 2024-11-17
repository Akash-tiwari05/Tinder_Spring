package com.akash.RestApp.service;

import com.akash.RestApp.dto.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersonData();
    List<Person> filterDataBasedOnGen(List<Person> personList);
}
