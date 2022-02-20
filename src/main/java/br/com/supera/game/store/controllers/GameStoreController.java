package br.com.supera.game.store.controllers;

import br.com.supera.game.store.entities.Cart;
import br.com.supera.game.store.entities.Product;
import br.com.supera.game.store.repositories.ProductRepository;
import br.com.supera.game.store.services.CartService;
import br.com.supera.game.store.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping
public class GameStoreController {

    @Autowired
    Cart cart;

    @Autowired
    private CartService cartService;

    @Autowired
    private CheckoutService checkoutService;

    @Autowired
    private ProductRepository productRepository;

    
    @RequestMapping(value="/checkout",method= RequestMethod.GET)
    public Cart getCheckout(){
       // checkoutService.getCheckoutInfo();
        return cartService.getCart();
    }
    @RequestMapping(value="/produtos/add",method= RequestMethod.POST)
    public void addCartItem(@RequestParam Long idMovie,@RequestParam int quantity){
        Product product =productRepository.getById(idMovie);
        cartService.addCart(product,quantity);

    }
    @RequestMapping(value="/produtos/remove",method= RequestMethod.DELETE)
    public void removeCartItem(@RequestParam Long idMovie,@RequestParam int quantity){
        Product product =productRepository.getById(idMovie);
        cartService.removeCart(product,quantity);

    }
    @RequestMapping(value="/produtos",method= RequestMethod.GET)
    public Page<Product> produtos(Pageable pageable){
        Page<Product> products=productRepository.findAll(pageable);
        return products;
    }


}
