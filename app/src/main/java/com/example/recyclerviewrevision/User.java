package com.example.recyclerviewrevision;

import java.io.Serializable;
public class User implements Serializable{
    int userId;
    int userImageId;
    String username;

    public User(int userId, int userImageId, String username){
        this.userId = userId;
        this.userImageId = userImageId;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserImageId(int userImageId) {
        this.userImageId = userImageId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserImageId() {
        return userImageId;
    }

    public String getUsername() {
        return username;
    }
}
