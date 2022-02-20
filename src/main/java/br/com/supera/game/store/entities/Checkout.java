package br.com.supera.game.store.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "checkout")
@Getter
@Setter
public class Checkout {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade=CascadeType.ALL, mappedBy ="checkout")
    private List<Item> items=new ArrayList<Item>();
    private Double total;
    private Double frete;

}