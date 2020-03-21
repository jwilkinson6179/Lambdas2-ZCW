package com.zipcodewilmington.models;

import java.time.LocalDate;

public class Person
{

    public enum Sex
    {
        MALE,
        FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress)
    {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Person(String name)
    {
        this(name, null, null, null);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getBirthday()
    {
        return birthday;
    }

    public void setBirthday(LocalDate birthday)
    {
        this.birthday = birthday;
    }

    public Sex getGender()
    {
        return gender;
    }

    public void setGender(Sex gender)
    {
        this.gender = gender;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public Integer getAge()
    {
        return LocalDate.now().atStartOfDay().getYear() - birthday.atStartOfDay().getYear();
    }
}
