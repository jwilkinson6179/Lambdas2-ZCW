package com.zipcodewilmington.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonTest
{
    Person test;

    @Before
    public void setup()
    {
        test = new Person("Daniel Craig", LocalDate.of(1968, 3, 2),
                com.zipcodewilmington.models.Person.Sex.MALE, "james_bond_007@mgm.com");
    }

    @Test
    public void getAge()
    {
        Integer expected = 52;
        Integer actual = test.getAge();

        assertEquals(expected, actual);
    }
}
