package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;


    @ManyToOne
    @JoinColumn
    private Client client;

    @OneToMany
    private List<Security> securityList = new ArrayList<>();

    @Column(nullable = false)
    private String portfolioCategory;

    @Column(nullable = false)
    private String portfolioName;

    protected Portfolio() {
    }

    public Portfolio(long portfolioId, Client client, List<Security> securityList, String portfolioCategory, String portfolioName) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.securityList = securityList;
        this.portfolioCategory = portfolioCategory;
        this.portfolioName = portfolioName;
    }

    public long getPortfolioId() {
        return portfolioId;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioCategory() {
        return portfolioCategory;
    }

    public void setPortfolioCategory(String portfolioCategory) {
        this.portfolioCategory = portfolioCategory;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public List<Security> getSecurityList() {
        return securityList;
    }

    public void setSecurityList(List<Security> securityList) {
        this.securityList = securityList;
    }
}
