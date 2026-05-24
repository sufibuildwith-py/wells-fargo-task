package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ForeignKey;

@Entity
public class Portfolio{
    @Id
    @GeneratedValue()
    private long portfolioID;

    @ForeignKey
    @Column(nullable = false)
    private long clientID;

    @Column(nullable = false)
    private String dateCreated;

    protected Portfolio(){

    }

    Portfolio(long portfolioID, long clientID, String dateCreated){
        this.portfolioID = portfolioID;
        this.clientID = clientID;
        this.dateCreated = dateCreated;
    }

    public Long getPortfolioID(){return portfolioID;}
    public Long getClientID(){return clientID;}
    public String getDateCreated(){return dateCreated;}
    public void setDateCreated(String date){dateCreated = date;}
}