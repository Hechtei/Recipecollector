package Rezeptsammler.mapper;

import Rezeptsammler.DTO.IngredientDTO;
import Rezeptsammler.DTO.PrepDTO;
import Rezeptsammler.model.Ingredient;
import Rezeptsammler.model.Prep;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-20T14:45:13+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class PrepMapperImpl implements PrepMapper {

    @Override
    public Prep prepDTOToPrep(PrepDTO prepDTO) {
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

    @Override
    public List<PrepDTO> prepDTOsToPrep(List<Prep> prepList) {
        if ( prepList == null ) {
            return null;
        }

        List<PrepDTO> list = new ArrayList<PrepDTO>( prepList.size() );
        for ( Prep prep : prepList ) {
            list.add( prepToPrepDTO( prep ) );
        }

        return list;
    }

    @Override
    public PrepDTO prepToPrepDTO(Prep prep) {
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

    @Override
    public List<PrepDTO> prepsTOPrepDTO(List<Prep> prepList) {
        if ( prepList == null ) {
            return null;
        }

        List<PrepDTO> list = new ArrayList<PrepDTO>( prepList.size() );
        for ( Prep prep : prepList ) {
            list.add( prepToPrepDTO( prep ) );
        }

        return list;
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
}
