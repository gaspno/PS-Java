package br.com.supera.game.store.services;

import br.com.supera.game.store.utils.Cart;
import br.com.supera.game.store.entities.Item;
import br.com.supera.game.store.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    Cart cart;


    public void addCart(Product product, int quantity) {

        Item item = new Item(product,quantity);
        cart.addItemCart(item);
    }

    public Cart getCart() {
        return cart;
    }

    public void removeCart(Product product, int quantity) {
        Item item = new Item(product,quantity);
        cart.removeItemCart(item);
    }
}
