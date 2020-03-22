package com.zipcodewilmington.models;

import com.zipcodewilmington.interfaces.CheckPerson;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdminToolTest
{
    AdminTool tool;
    Person jamesBond;
    Person kid;
    List<Person> personList;

    @Before
    public void setup()
    {
        jamesBond = new Person("Daniel Craig", LocalDate.of(1968, 3, 2),
                com.zipcodewilmington.models.Person.Sex.MALE, "james_bond_007@mgm.com");
        kid = new Person("Li'l Nancy", LocalDate.of(2011, 6, 19),
                Person.Sex.FEMALE, "nancyfancy@gmail.com");
        tool = new AdminTool();
        personList = new ArrayList<>();
        personList.add(jamesBond);
        personList.add(kid);
    }

    @Test
    public void testIfAdultWithLocalClass()
    {
        List<Person> expected = new ArrayList<>();
        expected.add(jamesBond);

        class adultChecker implements CheckPerson
        {
            @Override
            public boolean test(Person p) 
            {
                return p.getAge() >= 18;
            }
        }

        List<Person> actual = tool.printPersons(personList, new adultChecker());

        assertEquals(expected, actual);
    }

    @Test
    public void testIfAdultWithAnonymousClass()
    {
        List<Person> expected = new ArrayList<>();
        expected.add(jamesBond);

        List<Person> actual = tool.printPersons(personList, new CheckPerson()
        {
            public boolean test(Person p)
            {
                Integer minimumAge = 18;
                return (p.getAge() >= minimumAge);
            }
        });

        assertEquals(expected, actual);
    }

    @Test
    public void testIfAdultWithLambda()
    {
        List<Person> expected = new ArrayList<>();
        expected.add(jamesBond);

        List<Person> actual = tool.printPersons(personList, p -> p.getAge() >= 18);

        assertEquals(expected, actual);
    }
}
