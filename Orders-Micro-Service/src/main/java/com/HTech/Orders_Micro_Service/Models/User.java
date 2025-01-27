package com.HTech.Orders_Micro_Service.Models;

public class User {
    private String id;
    private  String Email;
    private  String password;
    private  String FirstName;
    private  String LastName;
    private  String Contact;
    private  String Address;

    public User(String id, String email, String password, String firstName, String lastName, String contact, String address) {
        this.id = id;
        Email = email;
        this.password = password;
        FirstName = firstName;
        LastName = lastName;
        Contact = contact;
        Address = address;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
