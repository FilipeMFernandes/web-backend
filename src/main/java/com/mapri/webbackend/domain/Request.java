package com.mapri.webbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "amount")
    Integer amount;

    @ManyToOne
    @JoinColumn(table = "request", name = "client")
    Client client;

    @ManyToMany
    @JoinColumn(name = "id_proposta")
    List<Proposal> proposalList;

    @CreatedDate
    @Column(name = "createdDate")
    Date createdDate;
}
