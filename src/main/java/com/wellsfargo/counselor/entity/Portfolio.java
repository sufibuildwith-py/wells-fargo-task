package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Portfolio
{
    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name ="clientId", nullable=false, unique = true)
    private Client client;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(nullable = false)
    private BigDecimal totalPrice;

    public Portfolio() {
    }

    public Portfolio(LocalDate creationDate, BigDecimal totalPrice)
    {
        this.creationDate = creationDate;
        this.totalPrice = totalPrice;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
