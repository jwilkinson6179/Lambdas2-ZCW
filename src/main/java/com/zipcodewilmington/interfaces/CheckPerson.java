package com.zipcodewilmington.interfaces;

import com.zipcodewilmington.models.Person;

@FunctionalInterface
public interface CheckPerson
{
    boolean test(Person p);
}