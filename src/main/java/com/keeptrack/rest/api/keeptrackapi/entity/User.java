package com.keeptrack.rest.api.keeptrackapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "USERS")
public class User {
    @Id
    @Column (name = "u_id")
    private String userId;

    @Column (name = "u_name")
    private String userName;

    @Column (name = "u_email")
    private String userEmail;

    @Column (name = "u_key")
    private String userKey;

    @Column (name = "u_created_at")
    private Date userCreatedAt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public Date getUserCreatedAt() {
        return userCreatedAt;
    }

    public void setUserCreatedAt(Date userCreatedAt) {
        this.userCreatedAt = userCreatedAt;
    }
}
