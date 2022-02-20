package br.com.supera.game.store.services;

import br.com.supera.game.store.dto.Checkout;
import br.com.supera.game.store.entities.Cart;
import br.com.supera.game.store.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class CheckoutService {

    @Autowired
    Cart cart;
    public void getCheckoutInfo() {

        List<Item> listaItems =cart.getLista();
        double total=0;

        for(Item i :listaItems){
            total+=i.getSubTotal();
        }
        Checkout checkout=new Checkout();

    }
}
