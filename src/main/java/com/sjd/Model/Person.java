package com.sjd.Model;

import java.util.*;


public class Person
{
    private String name;
    private int age;

    private List<Person> children = new ArrayList<Person> ();

    public Person ()
    {
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public void addChild (String childName, int age)
    {
        Person c = new Person();
        c.setName(childName);
        c.setAge(age);
        
        children.add(c);
    }

    public List<Person> getChildren ()
    {
        return children;
    }
}