package br.com.supera.game.store.controllers;

import br.com.supera.game.store.dto.CheckoutDTO;
import br.com.supera.game.store.utils.Cart;
import br.com.supera.game.store.entities.Product;
import br.com.supera.game.store.repositories.ProductRepository;
import br.com.supera.game.store.services.CartService;
import br.com.supera.game.store.services.CheckoutService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@OpenAPIDefinition(info = @Info(title = "GameStore API"))
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
    public ResponseEntity<CheckoutDTO> getCheckout(){
        checkoutService.getCheckoutInfo();
        return ResponseEntity.ok(checkoutService.getCheckoutInfo());
    }

    @RequestMapping(value="/checkout",method= RequestMethod.POST)
    public ResponseEntity<CheckoutDTO> saveCheckout(){
        CheckoutDTO dto= new CheckoutDTO(checkoutService.saveCheckout());
        return ResponseEntity.ok(dto);
    }

    @RequestMapping(value="/cart",method= RequestMethod.GET)
    public ResponseEntity<Cart> getCart(){

        return ResponseEntity.ok(cartService.getCart());
    }


    @RequestMapping(value="/produtos",method= RequestMethod.POST)
    public ResponseEntity<Void> addCartItem(@RequestParam Long id,@RequestParam int quantity){
        Product product =productRepository.getById(id);
        cartService.addCart(product,quantity);
        return  ResponseEntity.noContent().build();

    }
    @RequestMapping(value="/produtos",method= RequestMethod.DELETE)
    public ResponseEntity<Void> removeCartItem(@RequestParam Long id,@RequestParam int quantity){
        Product product =productRepository.getById(id);
        cartService.removeCart(product,quantity);
        return  ResponseEntity.noContent().build();

    }
    @RequestMapping(value="/produtos",method= RequestMethod.GET)
    public ResponseEntity<Page<Product>> produtos(Pageable pageable){
        Page<Product> products=productRepository.findAll(pageable);
        return ResponseEntity.ok(products);
    }


}
