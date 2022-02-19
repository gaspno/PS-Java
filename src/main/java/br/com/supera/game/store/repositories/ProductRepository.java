package br.com.supera.game.store.repositories;

import br.com.supera.game.store.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {

}