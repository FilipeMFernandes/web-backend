package com.mapri.webbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "cpf")
    String cpf;
    @Column
    private String password;
}
