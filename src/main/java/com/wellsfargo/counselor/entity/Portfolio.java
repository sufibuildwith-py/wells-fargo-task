package com.wellsfargo.counselor.entity;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    @OneToOne
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}