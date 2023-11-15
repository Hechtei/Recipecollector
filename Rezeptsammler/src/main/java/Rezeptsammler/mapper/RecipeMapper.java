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


    @Mapping(source = "rating", target = "Rating")
    Recipe recipeDTOToRecipe(RecipeDTO recipeDTO);
    List<RecipeDTO> recipeDTOsToRecipe(List<Recipe> recipeList);

    @InheritInverseConfiguration
    RecipeDTO recipeToRecipeDTO(Recipe recipe);

    List<RecipeDTO> recipesTORecipeDTO(List<Recipe> recipeList);


}
