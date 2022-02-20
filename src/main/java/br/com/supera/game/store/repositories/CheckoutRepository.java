package br.com.supera.game.store.repositories;

import br.com.supera.game.store.entities.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
}