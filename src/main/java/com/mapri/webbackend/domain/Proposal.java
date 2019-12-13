package com.mapri.webbackend.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "proposal")
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @OneToOne
    @JoinColumn(name = "id_provider")
    Provider provider;

    @OneToMany
    @JoinColumn(name = "budget")
    List<Budget> budgetList;

    @ManyToOne
    @JoinColumn(name = "id_product")
    Product product;

    @Column(name = "deliveryTime")
    int deliveryTime;
}
