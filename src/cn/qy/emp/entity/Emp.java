package cn.qy.emp.entity;

import java.util.Date;
import java.util.UUID;

public class Emp {
   private String id;
   private String name;
   private float sal;

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

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}
