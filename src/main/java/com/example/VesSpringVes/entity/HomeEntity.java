package com.example.VesSpringVes.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "home")
public class HomeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "city", length = 20)
    private String city;

    @Basic
    @Column(name = "street", length = 20)
    private String street;

    @Basic
    @Column(name = "type", length = 20)
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false, updatable = false)
    private UsersEntity usersEntity;

    public UsersEntity getUsersEntity () {
        return usersEntity;
    }

    public void setUsersEntity (UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

    public HomeEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
