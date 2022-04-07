package com.example.recyclerviewexample;

public class Contact {

    private String name;
    private String email;
    private String imageURl;

    public Contact(String name, String email, String imageURl) {
        this.name = name;
        this.email = email;
        this.imageURl = imageURl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageURl() {
        return imageURl;
    }

    public void setImageURl(String imageURl) {
        this.imageURl = imageURl;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", imageURl='" + imageURl + '\'' +
                '}';
    }
}
