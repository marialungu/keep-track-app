package com.keeptrack.rest.api.keeptrackapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ria on 5/28/2017.
 */
@Entity(name = "DUMMY")
public class dummy {
    @Id
    @Column (name = "d_id")
    private String id;

    @Column (name = "d_name")
    private String name;



}
