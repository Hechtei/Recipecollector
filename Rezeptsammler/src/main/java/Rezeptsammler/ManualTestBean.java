package Rezeptsammler;

import Rezeptsammler.controller.RecipeController;
import Rezeptsammler.model.Ingredient;
import Rezeptsammler.model.Prep;
import Rezeptsammler.model.Recipe;
import Rezeptsammler.repository.RecipeRepository;
import Rezeptsammler.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ManualTestBean {

    RecipeRepository recipeRepository;

    RecipeService recipeService;

    RecipeController recipeController;


    public ManualTestBean(RecipeRepository recipeRepository, RecipeService recipeService, RecipeController recipeController) {
        this.recipeRepository = recipeRepository;
        this.recipeService = recipeService;
        this.recipeController = recipeController;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void callController(){

        log.info("_____Test____");

        Ingredient ingredient = new Ingredient("banane", "pices", 1);

        Prep prep = new Prep(1,"easy","But banana Mouth");

        prep.setIngredients(List.of(ingredient));

        Recipe recipe = new Recipe("Banane","Wie esse ich eine Banane", 5.0,100,true,true);

        recipe.setPreparation(prep);
        this.recipeRepository.saveAll(List.of(recipe));


    }

}
