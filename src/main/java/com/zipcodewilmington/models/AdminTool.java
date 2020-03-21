package com.zipcodewilmington.models;

import java.util.ArrayList;
import java.util.List;

public class AdminTool implements CheckPerson
{
    List<Person> personList;

    public AdminTool(List<Person> personList)
    {
        this.personList = personList;
    }

    public AdminTool()
    {
        this(new ArrayList<Person>());
    }

    @Override
    public boolean test(Person p)
    {
        return false;
    }
}