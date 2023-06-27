package br.com.hioktec.springgraphql.modules.product.domain.entity;

import br.com.hioktec.springgraphql.modules.category.domain.entity.CategoryEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class ProductEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false, unique = true)
  private String name;

  @Column(nullable = false)
  private BigDecimal price;

  @ManyToOne()
  @JoinColumn(name = "category_id", insertable = false, updatable = false)
  private CategoryEntity category;

  @Column(name = "category_id", nullable = false)
  private UUID categoryId;

  public ProductEntity(String name, BigDecimal price, UUID categoryId) {
    this.name = name;
    this.price = price;
    this.categoryId = categoryId;
  }

}
