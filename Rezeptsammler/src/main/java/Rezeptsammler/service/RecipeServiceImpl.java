package Rezeptsammler.service;

import Rezeptsammler.mapper.RecipeMapper;
import Rezeptsammler.repository.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {


    private RecipeRepository recipeRepository;

    private RecipeMapper recipeMapper;


    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    //Hier  Service implementieren : addRecipe, DeleteRecipeByID, getRecipeByID, getAllRecipes,


}
