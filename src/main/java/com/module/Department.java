package com.module;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id         // @Id ：定义一条记录的唯一标识，并结合 @GeneratedValue 将其设置为自动生成。
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
