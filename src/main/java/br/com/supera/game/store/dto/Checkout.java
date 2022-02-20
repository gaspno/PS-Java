package br.com.supera.game.store.dto;

import br.com.supera.game.store.entities.Item;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    private Double total;
    private List<Item> items=new ArrayList<Item>();
    private Double frete;

}
