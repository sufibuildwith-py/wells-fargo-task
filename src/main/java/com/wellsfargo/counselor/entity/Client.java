package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client{

    @Id
    @GeneratedValue()
    private long clientID;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;


    protected Client(){

    }

    Client(String firstName, String lastName, String address, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getClientID(){return clientID;}

    public String getFirstName(){return firstName;}
    public void setFirstName(String fn){firstName = fn;}

    public String getLastName(){return lastName;}
    public void setLastName(String ln){lastName = ln;}

    public String getAddress(){return address;}
    public void setAddress(String a){address = a;}

    public String getPhone(){return phone;}
    public void setPhone(String p){phone = p;}

    public String getEmail(){return email;}
    public void setEmail(String e){email = e;}
}