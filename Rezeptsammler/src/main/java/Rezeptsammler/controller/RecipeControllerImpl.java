package Rezeptsammler.controller;


import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Recipe;
import Rezeptsammler.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecipeControllerImpl implements RecipeController {

     RecipeService recipeService;

    public RecipeControllerImpl(RecipeService recipeService){
        this.recipeService = recipeService;
    }
    @GetMapping
    public List<Recipe> getAllRecipes() {
        return null;
    }

    @PostMapping
    public RecipeDTO addRecipe(@RequestBody RecipeDTO recipeDTO) {
        return null;
    }

    @GetMapping("/{recipeId}")
    public RecipeDTO getRecipeByID(@PathVariable Long recipeId) {
        return null;
    }

    @PutMapping("/{recipeId}")
    public RecipeDTO updateRecipeByID(@PathVariable Long recipeId, @RequestBody RecipeDTO recipeDTO) {
        return null;
    }

    @DeleteMapping("/{recipeId}")
    public void deleteRecipeByID(@PathVariable Long recipeId) {

    }
}
