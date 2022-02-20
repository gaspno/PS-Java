package br.com.supera.game.store.utils;

import br.com.supera.game.store.entities.Item;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class Cart {

    private List<Item> lista=new ArrayList<Item>();

    public void addItemCart(Item item){
        for(Item i : lista)     {
            if(i.getProduct().getId() == item.getProduct().getId()){
                i.setQuantity(i.getQuantity()+item.getQuantity());
                return;
            }
        }
        lista.add(item);
    }
    public void removeItemCart(Item item){
        for(Item i : lista)     {
            if(i.getProduct().getId() == item.getProduct().getId()){
                if(i.getQuantity()<=item.getQuantity()){
                    lista.remove(i);
                }else {
                    i.setQuantity(i.getQuantity() - item.getQuantity());
                }
                return;
            }
        }
        lista.add(item);
    }


    public void removeAll() {
        lista.removeAll(lista);
    }
}
