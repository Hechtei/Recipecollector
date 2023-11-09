package Rezeptsammler.service;

import Rezeptsammler.repository.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {


    private RecipeRepository recipeRepository;


    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
}
