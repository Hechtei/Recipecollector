package Rezeptsammler.service;

import Rezeptsammler.DTO.CookDTO;
import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Cook;
import Rezeptsammler.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RecipeService {

     List<RecipeDTO> getAllRecipes();
    List<RecipeDTO> getAllRecipesByUser(CookDTO cookDTO);

    RecipeDTO getRecipeById(long id);

    RecipeDTO addRecipe(RecipeDTO recipeDTO);

    void deleteRecipeById(long id);

    RecipeDTO updateRecipe(RecipeDTO recipeDTO);
}
