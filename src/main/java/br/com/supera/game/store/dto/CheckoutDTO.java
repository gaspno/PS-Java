package br.com.supera.game.store.dto;

import br.com.supera.game.store.entities.Checkout;
import br.com.supera.game.store.entities.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class CheckoutDTO {

    private List<Item> items=new ArrayList<Item>();
    private Double total;
    private Double frete;

    public CheckoutDTO(Checkout c){
        this.items=c.getItems();
        this.total=c.getTotal();
        this.frete=c.getFrete();

    }


}
