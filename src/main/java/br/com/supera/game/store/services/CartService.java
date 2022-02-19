package br.com.supera.game.store.services;

import br.com.supera.game.store.entities.Cart;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CartService {

    @Resource(name = "cartSession")
    Cart cart;

    public void addItem(){

    }
    public void removeItem(){

    }

}
