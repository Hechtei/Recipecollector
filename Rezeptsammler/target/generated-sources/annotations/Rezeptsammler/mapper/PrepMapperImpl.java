package Rezeptsammler.mapper;

import Rezeptsammler.DTO.PrepDTO;
import Rezeptsammler.model.Ingredient;
import Rezeptsammler.model.Prep;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T21:53:31+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
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
        List<Ingredient> list = prepDTO.getIngredients();
        if ( list != null ) {
            prep.setIngredients( new ArrayList<Ingredient>( list ) );
        }
        prep.setRecipe( prepDTO.getRecipe() );

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
        prepDTO.setRecipe( prep.getRecipe() );
        List<Ingredient> list = prep.getIngredients();
        if ( list != null ) {
            prepDTO.setIngredients( new ArrayList<Ingredient>( list ) );
        }

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
}
