package Rezeptsammler.mapper;

import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Prep;
import Rezeptsammler.model.Recipe;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    Recipe recipeDTOToRecipe(RecipeDTO recipeDTO);
    List<RecipeDTO> recipeDTOsToRecipe(List<Recipe> recipeList);

    RecipeDTO recipeToRecipeDTO(Recipe recipe);

    List<RecipeDTO> recipesTORecipeDTO(List<Recipe> recipeList);


}
