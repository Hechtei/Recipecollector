package Rezeptsammler.mapper;

import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Recipe;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-10T08:39:26+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class RecipeMapperImpl implements RecipeMapper {

    @Override
    public Recipe recipeDTOToRecipe(RecipeDTO recipeDTO) {
        if ( recipeDTO == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        recipe.setTitle( recipeDTO.getTitle() );
        recipe.setDescription( recipeDTO.getDescription() );
        recipe.setPreparation( recipeDTO.getPreparation() );
        recipe.setRating( recipeDTO.getRating() );
        recipe.setKcal( recipeDTO.getKcal() );
        recipe.setVegetarian( recipeDTO.isVegetarian() );
        recipe.setVegan( recipeDTO.isVegan() );

        return recipe;
    }

    @Override
    public List<RecipeDTO> recipeDTOsToRecipe(List<Recipe> recipeList) {
        if ( recipeList == null ) {
            return null;
        }

        List<RecipeDTO> list = new ArrayList<RecipeDTO>( recipeList.size() );
        for ( Recipe recipe : recipeList ) {
            list.add( recipeToRecipeDTO( recipe ) );
        }

        return list;
    }

    @Override
    public RecipeDTO recipeToRecipeDTO(Recipe recipe) {
        if ( recipe == null ) {
            return null;
        }

        RecipeDTO recipeDTO = new RecipeDTO();

        recipeDTO.setTitle( recipe.getTitle() );
        recipeDTO.setDescription( recipe.getDescription() );
        recipeDTO.setPreparation( recipe.getPreparation() );
        recipeDTO.setRating( recipe.getRating() );
        recipeDTO.setKcal( recipe.getKcal() );
        recipeDTO.setVegetarian( recipe.isVegetarian() );
        recipeDTO.setVegan( recipe.isVegan() );

        return recipeDTO;
    }

    @Override
    public List<RecipeDTO> recipesTORecipeDTO(List<Recipe> recipeList) {
        if ( recipeList == null ) {
            return null;
        }

        List<RecipeDTO> list = new ArrayList<RecipeDTO>( recipeList.size() );
        for ( Recipe recipe : recipeList ) {
            list.add( recipeToRecipeDTO( recipe ) );
        }

        return list;
    }
}
