package com.zipcodewilmington.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

    public Person()
    {
        this(null, null, null, null);
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

    public void printPerson()
    {
        String formattedDate = birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.printf("\nName: %s\nBirthday: %s\nGender: %s\nEmail Address: %s", this.name, formattedDate,
                this.gender.name(), this.emailAddress);
    }

    // TODO: Check if people are trying to enter dates that haven't occurred yet, regex check for email validity
}
