package com.reactspring.studentssystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    public Student() {}

    public int getId() {  return id;  }

    public boolean setId(int id) {
        if (id >= 0){
            this.id = id;
            return true;
         } else
             return false;

    }

    public String getName() {  return name;  }

    public boolean setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public String getAddress() {  return address;  }

    public boolean setAddress(String address) {
        if(!address.isEmpty()){
            this.address = address;
            return true;
        } else
            return false;
    }
}
