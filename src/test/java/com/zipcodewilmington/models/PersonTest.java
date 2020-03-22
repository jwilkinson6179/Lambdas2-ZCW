package com.zipcodewilmington.models;

import com.zipcodewilmington.interfaces.CheckPerson;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonTest implements CheckPerson
{
    Person test;

    @Before
    public void setup()
    {
        test = new Person("Daniel Craig", LocalDate.of(1968, 3, 2),
                com.zipcodewilmington.models.Person.Sex.MALE, "james_bond_007@mgm.com");
    }

    @Before
    public void testNullConstructor()
    {
        Person me = new Person("James");
    }

    @Test
    public void setName()
    {
        String expected = "Danny Craig";

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void setBirthday()
    {
        LocalDate expected = LocalDate.of(1971, 11, 15);

        test.setBirthday(expected);
        LocalDate actual = test.getBirthday();

        assertEquals(expected, actual);
    }

    @Test
    public void setGender()
    {
        Person.Sex expected = Person.Sex.FEMALE;

        test.setGender(expected);
        Person.Sex actual = test.getGender();

        assertEquals(expected, actual);
    }

    @Test
    public void setEmailAddress()
    {
        String expected = "skyfall_promo@mgm.com";

        test.setEmailAddress(expected);
        String actual = test.getEmailAddress();

        assertEquals(expected, actual);
    }

    @Test
    public void getAge()
    {
        Integer expected = 52;
        Integer actual = test.getAge();

        assertEquals(expected, actual);
    }

    @Override
    public boolean test(Person p) {
        return false;
    }
}
