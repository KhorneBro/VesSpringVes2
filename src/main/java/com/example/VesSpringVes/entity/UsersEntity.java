package com.example.VesSpringVes.entity;

import javax.persistence.*;
import java.lang.reflect.Type;
import java.util.List;

@Entity
@Table(name = "users", schema = "public", catalog = "postgres")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", length = 20)
    private String name;

    @Basic
    @Column(name = "secondname", length = 20)
    private String secondname;

    @Basic
    @Column(name = "lastname", length = 20)
    private String lastname;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usersEntity")
    private List<HomeEntity> homeEntities;

    public List<HomeEntity> getHomeEntities () {
        return homeEntities;
    }

    public void setHomeEntities (List<HomeEntity> homeEntities) {
        this.homeEntities = homeEntities;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (secondname != null ? !secondname.equals(that.secondname) : that.secondname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondname != null ? secondname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }
}
