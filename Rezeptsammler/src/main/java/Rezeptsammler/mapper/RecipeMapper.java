package Rezeptsammler.mapper;

import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Prep;
import Rezeptsammler.model.Recipe;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecipeMapper {


    @InheritInverseConfiguration
    RecipeDTO recipeToRecipeDTO(Recipe recipe);
    List<RecipeDTO> recipesToRecipesDTO(List<Recipe> recipeList);

    Recipe recipeDTOToRecipe(RecipeDTO recipeDTO);
    List<Recipe> recipesDTOToRecipes(List<RecipeDTO> recipeDTOList);


}
