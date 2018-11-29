package com.bellinfo.apartmentrental.model;

import javax.persistence.*;

@Entity
public class ApartmentRent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String aptname;
    @Column
    String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAptname() {
        return aptname;
    }

    public void setAptname(String aptname) {
        this.aptname = aptname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
