package com.keeptrack.rest.api.keeptrackapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "DUMMY")
public class Dummy {
    @Id
    @Column (name = "d_id")
    private String id;

    @Column (name = "d_name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
