package Rezeptsammler.controller;

import Rezeptsammler.model.Recipe;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface RecipeController {

    //RestController anlegen

    List<Recipe> getallRecipes();

    void addRecipe();


}
