package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    public Client(Long id, String firstName, String lastName, Advisor advisor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.advisor = advisor;
    }

    public Client() {}

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
