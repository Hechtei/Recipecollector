package Rezeptsammler.mapper;

import Rezeptsammler.DTO.IngredientDTO;
import Rezeptsammler.DTO.PrepDTO;
import Rezeptsammler.DTO.RecipeDTO;
import Rezeptsammler.model.Ingredient;
import Rezeptsammler.model.Prep;
import Rezeptsammler.model.Recipe;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-20T15:11:22+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class RecipeMapperImpl implements RecipeMapper {

    @Override
    public RecipeDTO recipeToRecipeDTO(Recipe recipe) {
        if ( recipe == null ) {
            return null;
        }

        RecipeDTO recipeDTO = new RecipeDTO();

        recipeDTO.setId( recipe.getId() );
        recipeDTO.setTitle( recipe.getTitle() );
        recipeDTO.setDescription( recipe.getDescription() );
        recipeDTO.setPreparation( prepToPrepDTO( recipe.getPreparation() ) );
        recipeDTO.setRating( recipe.getRating() );
        recipeDTO.setKcal( recipe.getKcal() );
        recipeDTO.setVegetarian( recipe.isVegetarian() );
        recipeDTO.setVegan( recipe.isVegan() );

        return recipeDTO;
    }

    @Override
    public List<RecipeDTO> recipesToRecipesDTO(List<Recipe> recipeList) {
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
    public Recipe recipeDTOToRecipe(RecipeDTO recipeDTO) {
        if ( recipeDTO == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        recipe.setId( recipeDTO.getId() );
        recipe.setTitle( recipeDTO.getTitle() );
        recipe.setDescription( recipeDTO.getDescription() );
        recipe.setPreparation( prepDTOToPrep( recipeDTO.getPreparation() ) );
        recipe.setRating( recipeDTO.getRating() );
        recipe.setKcal( recipeDTO.getKcal() );
        recipe.setVegetarian( recipeDTO.isVegetarian() );
        recipe.setVegan( recipeDTO.isVegan() );

        return recipe;
    }

    @Override
    public List<Recipe> recipesDTOToRecipes(List<RecipeDTO> recipeDTOList) {
        if ( recipeDTOList == null ) {
            return null;
        }

        List<Recipe> list = new ArrayList<Recipe>( recipeDTOList.size() );
        for ( RecipeDTO recipeDTO : recipeDTOList ) {
            list.add( recipeDTOToRecipe( recipeDTO ) );
        }

        return list;
    }

    protected IngredientDTO ingredientToIngredientDTO(Ingredient ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        IngredientDTO ingredientDTO = new IngredientDTO();

        ingredientDTO.setId( ingredient.getId() );
        ingredientDTO.setName( ingredient.getName() );
        ingredientDTO.setUnit( ingredient.getUnit() );
        ingredientDTO.setAmount( ingredient.getAmount() );

        return ingredientDTO;
    }

    protected List<IngredientDTO> ingredientListToIngredientDTOList(List<Ingredient> list) {
        if ( list == null ) {
            return null;
        }

        List<IngredientDTO> list1 = new ArrayList<IngredientDTO>( list.size() );
        for ( Ingredient ingredient : list ) {
            list1.add( ingredientToIngredientDTO( ingredient ) );
        }

        return list1;
    }

    protected PrepDTO prepToPrepDTO(Prep prep) {
        if ( prep == null ) {
            return null;
        }

        PrepDTO prepDTO = new PrepDTO();

        prepDTO.setId( prep.getId() );
        prepDTO.setPortions( prep.getPortions() );
        prepDTO.setComplexity( prep.getComplexity() );
        prepDTO.setExecution( prep.getExecution() );
        prepDTO.setIngredients( ingredientListToIngredientDTOList( prep.getIngredients() ) );

        return prepDTO;
    }

    protected Ingredient ingredientDTOToIngredient(IngredientDTO ingredientDTO) {
        if ( ingredientDTO == null ) {
            return null;
        }

        Ingredient ingredient = new Ingredient();

        ingredient.setId( ingredientDTO.getId() );
        ingredient.setName( ingredientDTO.getName() );
        ingredient.setUnit( ingredientDTO.getUnit() );
        ingredient.setAmount( ingredientDTO.getAmount() );

        return ingredient;
    }

    protected List<Ingredient> ingredientDTOListToIngredientList(List<IngredientDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Ingredient> list1 = new ArrayList<Ingredient>( list.size() );
        for ( IngredientDTO ingredientDTO : list ) {
            list1.add( ingredientDTOToIngredient( ingredientDTO ) );
        }

        return list1;
    }

    protected Prep prepDTOToPrep(PrepDTO prepDTO) {
        if ( prepDTO == null ) {
            return null;
        }

        Prep prep = new Prep();

        prep.setId( prepDTO.getId() );
        prep.setPortions( prepDTO.getPortions() );
        prep.setComplexity( prepDTO.getComplexity() );
        prep.setExecution( prepDTO.getExecution() );
        prep.setIngredients( ingredientDTOListToIngredientList( prepDTO.getIngredients() ) );

        return prep;
    }
}
