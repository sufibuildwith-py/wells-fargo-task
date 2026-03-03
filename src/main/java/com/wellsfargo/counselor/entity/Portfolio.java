package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "portfolios")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SecurityHolding> holdings = new ArrayList<>();

    public Portfolio() {}

    public Portfolio(String name, LocalDate createdDate, Client client) {
        this.name = name;
        this.createdDate = createdDate;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<SecurityHolding> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<SecurityHolding> holdings) {
        this.holdings = holdings;
    }
}
