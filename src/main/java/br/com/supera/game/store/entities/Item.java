package br.com.supera.game.store.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item_cart")
public class Item {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;
    private Integer quantity;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "checkout_id")
    private Checkout checkout;


    public Item(Product p,Integer q) {
        this.product = p;
        this.quantity=q;

    }



    public double getSubTotal(){
        return product.getPrice().doubleValue()*this.getQuantity();
    }

}
