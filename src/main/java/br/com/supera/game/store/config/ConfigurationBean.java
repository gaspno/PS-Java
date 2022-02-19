package br.com.supera.game.store.config;


import br.com.supera.game.store.entities.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ConfigurationBean {

    @Bean
    @SessionScope
    public Cart cartSession(){
        return new Cart();
    }



}
