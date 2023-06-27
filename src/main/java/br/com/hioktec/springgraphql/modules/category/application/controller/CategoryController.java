package br.com.hioktec.springgraphql.modules.category.application.controller;

import br.com.hioktec.springgraphql.modules.category.application.dto.CategoryInput;
import br.com.hioktec.springgraphql.modules.category.domain.entity.CategoryEntity;
import br.com.hioktec.springgraphql.modules.category.domain.repository.CategoryRepository;
import jdk.jfr.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryController {

  private final CategoryRepository categoryRepository;

  @MutationMapping()
  public CategoryEntity addCategory(@Argument CategoryInput category) {
    return this.categoryRepository.save(new CategoryEntity(category.name()));
  }

  @QueryMapping()
  public Optional<CategoryEntity> categoryById(@Argument UUID id) {
    return this.categoryRepository.findById(id);
  }

}
