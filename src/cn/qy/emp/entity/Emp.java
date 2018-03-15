package cn.qy.emp.entity;

import java.util.Date;
import java.util.UUID;

public class Emp {
   private String id;
   private String name;
   private double salary;

    public Emp() {
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }
}
