package com.example.javaappversion21.Models;

public class PostsModel {
    String accountName;
    String location;
    int postImage;

    public PostsModel(String accountName, String location, int postImage) {
        this.accountName = accountName;
        this.location = location;
        this.postImage = postImage;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }
}
