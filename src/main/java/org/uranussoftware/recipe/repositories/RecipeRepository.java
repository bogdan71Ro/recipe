package org.uranussoftware.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.uranussoftware.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
