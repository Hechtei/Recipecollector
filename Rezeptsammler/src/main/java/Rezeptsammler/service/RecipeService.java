package Rezeptsammler.service;

import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RecipeService {

     List<RecipeDTO> getAllRecipes();

    RecipeDTO getRecipeById(long id);

    RecipeDTO addRecipe(RecipeDTO recipeDTO);

    void deleteRecipeById(long id);

    RecipeDTO updateRecipe(RecipeDTO recipeDTO);
}
