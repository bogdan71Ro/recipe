package org.uranussoftware.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.uranussoftware.recipe.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
