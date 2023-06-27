package br.com.hioktec.springgraphql.modules.product.application.controller;

import br.com.hioktec.springgraphql.modules.product.application.dto.ProductInput;
import br.com.hioktec.springgraphql.modules.product.domain.entity.ProductEntity;
import br.com.hioktec.springgraphql.modules.product.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {

  private final ProductRepository productRepository;

  @MutationMapping()
  public ProductEntity appProduct(@Argument ProductInput productInput) {
    return this.productRepository
      .save(new ProductEntity(productInput.name(), productInput.price(), productInput.categoryId()));
  }

  @QueryMapping()
  public Iterable<ProductEntity> products() {
    return this.productRepository.findAll();
  }

}
