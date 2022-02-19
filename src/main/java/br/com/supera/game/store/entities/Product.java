package br.com.supera.game.store.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   public long id;

   public String name;

   public BigDecimal price;

   public short score;

   public String image;


}