/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.BankingSystem;

/**
 *
 * @author Samaa
 */
public class Person {
    private String name;
    private int SSn;
    private static int id =0;
    private int age;
    private AddressFacade a;

    public Person()
    {
        id ++;
    }
    public Person(String name, int SSn, int age, AddressFacade a) {
        this.name = name;
        this.SSn = SSn;
        id++;
        this.age = age;
        this.a = a;
    }
    public String getAddress()
    {
        return a.getData();
    }

    public void setA(AddressFacade a) {
        this.a = a;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSn() {
        return SSn;
    }

    public void setSSn(int SSn) {
        this.SSn = SSn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
