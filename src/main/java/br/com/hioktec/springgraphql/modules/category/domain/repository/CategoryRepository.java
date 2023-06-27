package br.com.hioktec.springgraphql.modules.category.domain.repository;

import br.com.hioktec.springgraphql.modules.category.domain.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CategoryRepository extends CrudRepository<CategoryEntity, UUID> {

}
