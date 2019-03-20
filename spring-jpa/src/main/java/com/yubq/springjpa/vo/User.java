package com.yubq.springjpa.vo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="test")
public class User implements Serializable {

    @Id
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="birthplace")
    private String birthplace;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
