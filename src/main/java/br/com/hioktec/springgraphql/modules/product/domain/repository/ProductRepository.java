package br.com.hioktec.springgraphql.modules.product.domain.repository;

import br.com.hioktec.springgraphql.modules.product.domain.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {

}
