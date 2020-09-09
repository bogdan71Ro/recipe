package org.uranussoftware.recipe.services;

import org.uranussoftware.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
