package Rezeptsammler.controller;


import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Recipe;
import Rezeptsammler.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeControllerImpl implements RecipeController {

     RecipeService recipeService;

    public RecipeControllerImpl(RecipeService recipeService){
        this.recipeService = recipeService;
    }
    @GetMapping
    public List<RecipeDTO> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @PostMapping
    public RecipeDTO addRecipe(@RequestBody RecipeDTO recipeDTO) {
        return recipeService.addRecipe(recipeDTO);
    }

    @GetMapping("/{recipeId}")
    public RecipeDTO getRecipeByID(@PathVariable Long recipeId) {
        return recipeService.getRecipeById(recipeId);
    }

    @PutMapping("/{recipeId}")
    public RecipeDTO updateRecipe(@PathVariable Long recipeId, @RequestBody RecipeDTO recipeDTO) {
        return recipeService.updateRecipe(recipeDTO);
    }

    @DeleteMapping("/{recipeId}")
    public void deleteRecipeByID(@PathVariable Long recipeId) {
        recipeService.deleteRecipeById(recipeId);
    }
}
