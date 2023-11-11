package Rezeptsammler.controller;

import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface RecipeController {

    //RestController anlegen

    @GetMapping
    List<Recipe> getAllRecipes();
    @PostMapping
    RecipeDTO addRecipe(@RequestBody RecipeDTO recipeDTO);

    @GetMapping("/{recipeId}")
    RecipeDTO getRecipeByID(@PathVariable Long recipeId);

    @PutMapping("/recipeId")
    RecipeDTO updateRecipeByID(@PathVariable Long recipeId, @RequestBody RecipeDTO recipeDTO);

    @DeleteMapping("/{recipeId}")
    void deleteRecipeByID(@PathVariable Long recipeId);
}
