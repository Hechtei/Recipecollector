package Rezeptsammler.service;

import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.mapper.RecipeMapper;
import Rezeptsammler.model.Recipe;
import Rezeptsammler.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {


     RecipeRepository recipeRepository;

     RecipeMapper recipeMapper;


    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeMapper recipeMapper) {
        this.recipeRepository = recipeRepository;
        this.recipeMapper = recipeMapper;
    }

    @Override
    public List<RecipeDTO> getAllRecipes() {
        return this.recipeMapper.recipesTORecipeDTO(this.recipeRepository.findAll());
    }

    @Override //Muss man vielleicht austauschen und den Fall des nicht findens abdecken
    public RecipeDTO getRecipeById(long id) {
        return this.recipeMapper.recipeToRecipeDTO(this.recipeRepository.getById(id));
    }
    @Override
    public RecipeDTO addRecipe(RecipeDTO recipeDTO) {
        Recipe tmp = recipeMapper.recipeDTOToRecipe(recipeDTO);
        return recipeMapper.recipeToRecipeDTO(recipeRepository.save(tmp));

    }

    @Override
    public void deleteRecipeById(long id) {
        recipeRepository.deleteById(id);
    }

    @Override
    public RecipeDTO updateRecipe(RecipeDTO recipeDTO) {
        if (recipeRepository.existsById(recipeDTO.getId())) {
            Recipe tmp = recipeMapper.recipeDTOToRecipe(recipeDTO);
            return recipeMapper.recipeToRecipeDTO(recipeRepository.save(tmp));
        } else {
            throw new EntityNotFoundException("Rezept nicht gefunden");
        }
    }

    //Hier  Service implementieren : addRecipe, DeleteRecipeByID, getRecipeByID, getAllRecipes,


}
