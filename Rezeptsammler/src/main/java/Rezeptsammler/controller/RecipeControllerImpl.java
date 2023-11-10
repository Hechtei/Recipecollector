package Rezeptsammler.controller;


import Rezeptsammler.model.Recipe;
import Rezeptsammler.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeControllerImpl implements RecipeController {

    private RecipeService recipeService;

    @Override
    public List<Recipe> getallRecipes() {
        return null;
    }

    @Override
    public void getRecipe() {

    }

    @GetMapping("/index")
    public String showForm() {
        return "index";
    }
}
