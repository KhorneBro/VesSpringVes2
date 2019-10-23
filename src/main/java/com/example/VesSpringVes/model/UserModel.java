package com.example.VesSpringVes.model;


import com.example.VesSpringVes.entity.HomeEntity;

import java.util.List;

public class UserModel {

    private int id;
    private String name;
    private String secondName;
    private String lastName;
    private String type;
    private List<HomeEntity> homeEntities;

    public List<HomeEntity> getHomeEntities () {
        return homeEntities;
    }

    public void setHomeEntities (List<HomeEntity> homeEntities) {
        this.homeEntities = homeEntities;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
