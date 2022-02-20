package br.com.supera.game.store.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Product product;
    private Integer quantity;

    public double getSubTotal(){
        return product.getPrice().doubleValue()*this.getQuantity();
    }

}
