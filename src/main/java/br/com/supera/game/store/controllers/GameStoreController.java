package br.com.supera.game.store.controllers;

import br.com.supera.game.store.entities.Cart;
import br.com.supera.game.store.entities.Product;
import br.com.supera.game.store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping
public class GameStoreController {

    @Autowired
    private ProductRepository productRepository;

    
    @RequestMapping(value="/checkout",method= RequestMethod.GET)
    public Cart getCheckout(){

        return null;
    }
    @RequestMapping(value="/produtos/add",method= RequestMethod.POST)
    public void addCartItem(int idMovie){


    }
    @RequestMapping(value="/produtos/remove",method= RequestMethod.DELETE)
    public void removeCartItem(int idMovie){


    }
    @RequestMapping(value="/produtos",method= RequestMethod.GET)
    public Page<Product> produtos(Pageable pageable){
        Page<Product> products=productRepository.findAll(pageable);
        return products;
    }


}
