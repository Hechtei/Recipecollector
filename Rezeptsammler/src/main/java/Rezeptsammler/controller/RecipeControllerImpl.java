package Rezeptsammler.controller;


import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Recipe;
import Rezeptsammler.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
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
    public RecipeDTO updateRecipe(@PathVariable Long recipeId, @Valid @RequestBody RecipeDTO recipeDTO) {
       try {
           return recipeService.updateRecipe(recipeDTO);
       } catch (ConstraintViolationException CVException){
           throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
       }

    }

    @DeleteMapping("/{recipeId}")
    public void deleteRecipeByID(@PathVariable Long recipeId) {
        recipeService.deleteRecipeById(recipeId);
    }
}
