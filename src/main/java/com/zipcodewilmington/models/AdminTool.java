package com.zipcodewilmington.models;

import com.zipcodewilmington.interfaces.CheckPerson;

import java.util.ArrayList;
import java.util.List;

public class AdminTool
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

    public static List<Person> printPersons(List<Person> roster, CheckPerson tester)
    {
        List<Person> filteredList = new ArrayList<>();

        for (Person p : roster)
        {
            if (tester.test(p))
            {
                filteredList.add(p);
                p.printPerson();
            }
        }

        return filteredList;
    }
}