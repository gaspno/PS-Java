package br.com.supera.game.store.services;

import br.com.supera.game.store.dto.CheckoutDTO;
import br.com.supera.game.store.entities.Cart;
import br.com.supera.game.store.entities.Checkout;
import br.com.supera.game.store.entities.Item;
import br.com.supera.game.store.repositories.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService {

    @Autowired
    Cart cart;

    @Autowired
    CheckoutRepository checkoutRepository;

    public CheckoutDTO getCheckoutInfo() {

        Checkout checkout=getCheckout();
        CheckoutDTO checkoutDto=new CheckoutDTO(checkout.getItems(),checkout.getTotal(),checkout.getFrete());
        return checkoutDto;
    }

    public Checkout saveCheckout(){
        Checkout checkout=getCheckout();
        Checkout updateCheckout=checkoutRepository.save(checkout);
        return updateCheckout;
    }

    private Checkout getCheckout(){

        List<Item> listaItems =cart.getLista();
        double total=0;
        double frete=0;
        int quantity=0;
        Checkout checkout=new Checkout();

        for(Item i :listaItems){
            quantity+=i.getQuantity();
            total+=i.getSubTotal();
            i.setCheckout(checkout);
        }
        if(total>=250){
            frete=0;
        }else{
            frete=10*quantity;
        }
        checkout.setFrete(frete);
        checkout.setTotal(total);
        checkout.getItems().addAll(listaItems);

        return checkout;

    }
}
