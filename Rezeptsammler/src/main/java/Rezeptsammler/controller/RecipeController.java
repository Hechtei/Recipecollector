package Rezeptsammler.controller;

import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface RecipeController {

    //RestController anlegen

    @GetMapping
    List<RecipeDTO> getAllRecipes();
    @PostMapping
    RecipeDTO addRecipe(@RequestBody RecipeDTO recipeDTO);

    @GetMapping("/{recipeId}")
    RecipeDTO getRecipeByID(@PathVariable Long recipeId);

    @PutMapping("/{recipeId}")
    RecipeDTO updateRecipe(@PathVariable Long recipeId, @RequestBody RecipeDTO recipeDTO);

    @DeleteMapping("/{recipeId}")
    void deleteRecipeByID(@PathVariable Long recipeId);
}
